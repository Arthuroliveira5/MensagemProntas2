package com.novozap.userd.mensagenspronta;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.startapp.android.publish.adsCommon.StartAppAd;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PostsListActivity extends AppCompatActivity {

    LinearLayoutManager mLayoutManager;//for sorting
    SharedPreferences mSharedPref ;//for saving sort settings
    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts_list);





        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "@string/admob_appid");

        StartAppAd.showAd(this);
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Mensagens Prontas ");


        mSharedPref = getSharedPreferences("SortSettings",MODE_PRIVATE);
        String mSorting = mSharedPref.getString("Sort","newest");

        if(mSorting.equals("newest")){
            mLayoutManager = new LinearLayoutManager(this);

            mLayoutManager.setReverseLayout(true);
            mLayoutManager.setStackFromEnd(true);




        }

        else if (mSorting.equals("oldest")){


            mLayoutManager = new LinearLayoutManager(this);

            mLayoutManager.setReverseLayout(false);
            mLayoutManager.setStackFromEnd(false);


        }


        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);


        mRecyclerView.setLayoutManager( mLayoutManager);

        Bundle extra = getIntent().getExtras();

        if(extra!=null){
            String textoPassado = extra.getString("nome");
            mFirebaseDatabase= FirebaseDatabase.getInstance();
            mRef= mFirebaseDatabase.getReference(textoPassado);




        }





        prepareAd();

        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {

            public void run() {
                Log.i("Ut", "Masti");
                runOnUiThread(new Runnable() {
                    public void run() {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG"," Interstitial not loaded");
                        }

                        prepareAd();


                    }
                });

            }
        }, 2, 2, TimeUnit.SECONDS);


    }




    public void  prepareAd(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3496326012995764/6076221822");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }






    //Procurar

    private void  firebaseSearch(String searchText){

        Query fireabaseSearchQuery = mRef.orderByChild("title").startAt(searchText).endAt(searchText + "\uf8ff");

            FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Model, ViewHolder>(
                    Model.class,
                    R.layout.row,
                    ViewHolder.class,
                    fireabaseSearchQuery



            ) {
                @Override
                protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {
                    viewHolder.setDetails(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage());

                }


                @Override
                public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                    ViewHolder viewHolder = super.onCreateViewHolder(parent,viewType);

                    viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            //View
                            TextView mTitleTv= view.findViewById(R.id.rTitleTv);
                            TextView mDescTv= view.findViewById(R.id.rDescriptionTv);
                            ImageView mImageView= view.findViewById(R.id.rImageView);
                            //get data from view
                            String mTitle = mTitleTv.getText().toString();
                            String mDesc = mDescTv.getText().toString();
                            Drawable mDrawable =mImageView.getDrawable();
                            Bitmap mBitmap=((BitmapDrawable)mDrawable).getBitmap();

                            //pass this to new activity

                            Intent intent = new Intent(view.getContext(),PostDetailActivity.class);
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            mBitmap.compress(Bitmap.CompressFormat.PNG,100,stream );
                            byte[] bytes=stream.toByteArray();
                            intent.putExtra("image",bytes);
                            intent.putExtra("title",mTitle);
                            intent.putExtra("description",mDesc);
                            startActivity(intent);


                        }

                        @Override
                        public void onItemLongClick(View view, int position) {

                        }
                    });
                    return viewHolder;
                }







            };

        //set adadpter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);


    }






    //load data into recycle view on Start

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Model, ViewHolder>(Model.class,R.layout.row,ViewHolder.class,mRef) {



            @Override
            protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {



                viewHolder.setDetails(getApplicationContext(),model.getTitle(),model.getDescription(),model.getImage());

            }

            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

                ViewHolder viewHolder = super.onCreateViewHolder(parent,viewType);

                viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        //View
                        TextView mTitleTv= view.findViewById(R.id.rTitleTv);
                        TextView mDescTv= view.findViewById(R.id.rDescriptionTv);
                        ImageView mImageView= view.findViewById(R.id.rImageView);
                        //get data from view
                        String mTitle = mTitleTv.getText().toString();
                        String mDesc = mDescTv.getText().toString();
                        Drawable mDrawable =mImageView.getDrawable();
                        Bitmap mBitmap=((BitmapDrawable)mDrawable).getBitmap();

                        //pass this to new activity

                        Intent intent = new Intent(view.getContext(),PostDetailActivity.class);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        mBitmap.compress(Bitmap.CompressFormat.PNG,100,stream );
                        byte[] bytes=stream.toByteArray();
                        intent.putExtra("image",bytes);
                        intent.putExtra("title",mTitle);
                        intent.putExtra("description",mDesc);
                        startActivity(intent);
                      mInterstitialAd.show();
                       // StartAppAd.showAd(PostsListActivity.this);
                    }

                    @Override
                    public void onItemLongClick(View view, int position) {

                    }
                });
                return viewHolder;
            }




        };

        //set adadpter to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {



        //chammar o menu e os itens dentro dele
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                firebaseSearch(query);


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                //filter as you type
                firebaseSearch(newText);


                return false;
            }
        });



        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();

            // handler other item actionbar
        if(id==R.id.action_sort){
                showSortDialog();
                return true ;

        }

        return super.onOptionsItemSelected(item);
    }

    private void showSortDialog() {

        String[] sortOptions ={"Novos Posts","Velhos Posts"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Atualizar").setIcon(R.drawable.ic_action_sort).setItems(sortOptions, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if(which==0){
                    //sort by newest

                    SharedPreferences.Editor editor = mSharedPref.edit();
                    editor.putString("Sort","newest");
                    editor.apply();
                    recreate();


                }else if(which==1){
                    //sort by oldest
                    SharedPreferences.Editor editor = mSharedPref.edit();
                    editor.putString("Sort","oldest");
                    editor.apply();
                    recreate();




                }

            }
        });


        builder.show();


    }


}
