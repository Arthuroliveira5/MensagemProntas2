package com.novozap.userd.mensagenspronta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.novozap.userd.mensagenspronta.activity.ListaDeCursosActivity;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;


import hotchemi.android.rate.AppRate;

public class Telainicial10 extends AppCompatActivity {

    private Button botao3;
    private Button botao1;
    private Button botao2;
    private Button botao4;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial10);
        StartAppSDK.init(this, "207942769", true);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "@string/admob_appid");



        StartAppAd.showAd(this);
        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();
        AppRate.with(this).showRateDialog(this);

        botao3=findViewById(R.id.button20);
        botao1=findViewById(R.id.button2);
        botao2=findViewById(R.id.button4);
        botao4=findViewById(R.id.button5);
        prepareAd();

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Telainicial10.this, ListaDeCursosActivity.class));

            }
        });
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Telainicial10.this, PostsListActivity3.class));

            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Telainicial10.this, PostsListActivity4.class));

            }
        });
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Telainicial10.this, PostsListActivity5.class));

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if(id == R.id.menu_novo){
            //startActivity(new Intent(MainActivity.this,TelaInicial.class));
            //startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=arthur+luiz")));
            startActivity(new Intent(Telainicial10.this,PostsListActivity2.class));
        }
        if(id==R.id.action_chat){
            //startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=arthur+luiz")));
           // AppRate.with(this).showRateDialog(this);

           // AppRate.showRateDialogIfMeetsConditions(this);
        }

        return true;
    }

    @Override
    public void onBackPressed() {
        mInterstitialAd.show();

        super.onBackPressed();
    }

    public void  prepareAd(){

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3496326012995764/6076221822");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }
}
