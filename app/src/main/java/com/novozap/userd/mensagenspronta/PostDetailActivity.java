package com.novozap.userd.mensagenspronta;

import android.Manifest;
import android.app.WallpaperManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PostDetailActivity extends AppCompatActivity {

    TextView mTitleTv,mDetailTv;
    ImageView mImageTv;
    Button mSaveBtn,mShareBtn,mWallBtn;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    Bitmap bitmap;
    private static final int WRITE_EXTERNAL_STORAGE_CODE =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Detalhes");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        mTitleTv=findViewById(R.id.titleTv);
        mDetailTv=findViewById(R.id.descriptionTv);
        mImageTv=findViewById(R.id.imageView);
        mSaveBtn=findViewById(R.id.saveBtn);
        mShareBtn=findViewById(R.id.shareBtn);
        mWallBtn=findViewById(R.id.wallBtn);



        byte[] bytes = getIntent().getByteArrayExtra("image");
        String title=getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("description");
        Bitmap bmp= BitmapFactory.decodeByteArray(bytes,0,bytes.length);


        mTitleTv.setText(title);
        mDetailTv.setText(desc);
        mImageTv.setImageBitmap(bmp);


        bitmap=((BitmapDrawable)mImageTv.getDrawable()).getBitmap();

        mSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
                            PackageManager.PERMISSION_DENIED){
                        String [] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);


                    }

                    else{

                        saveImage();

                    }

                }
                else{

                    saveImage();


                }
            }
        });
    mShareBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            shareImage();

        }
    });

    mWallBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setImgWallpapar();

        }
    });

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

    private void setImgWallpapar() {

        WallpaperManager myWallManager = WallpaperManager.getInstance(getApplicationContext());
        try{

            myWallManager.setBitmap(bitmap);
            Toast.makeText(this,"Colocar Papel de parede",Toast.LENGTH_SHORT).show();



        }catch (Exception e){


            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }

    private void shareImage() {

        try{

            String s = mTitleTv.getText().toString() + "\n"+ mDetailTv.getText().toString();

            File file = new File(getExternalCacheDir(),"sample.png");
            FileOutputStream fOut = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,fOut);
            fOut.flush();
            fOut.close();
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());

            file.setReadable(true,false);

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Intent.EXTRA_TEXT,s);
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
            intent.setType("image/png");
            startActivity(Intent.createChooser(intent,"COMPARTILHAR VIA"));


        }catch (Exception e){

            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }


    }

    private void saveImage() {

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());


        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DownloadPapeldeParede/");
        dir.mkdirs();
        String imageName = timeStamp + ".PNG";
        File file = new File(dir,imageName);
        OutputStream out;
        try{


            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);
            out.flush();
            out.close();
            Toast.makeText(this,imageName+"salva"+dir,Toast.LENGTH_SHORT).show();


        }
        catch(Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();



        }
    }

    @Override
    public boolean onSupportNavigateUp() {

        onBackPressed();
        return true;
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){

            case WRITE_EXTERNAL_STORAGE_CODE:{

                if(grantResults.length>0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                    saveImage();

                }
                else {


                    Toast.makeText(this,"enable permission to save image",Toast.LENGTH_SHORT).show();
                }

            }


        }
    }
}
