package com.novozap.userd.mensagenspronta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.novozap.userd.mensagenspronta.activity.ListaDeCursosActivity;

import hotchemi.android.rate.AppRate;

public class TelaInicial3 extends AppCompatActivity {

    private LinearLayout botao1;
    private LinearLayout botao2;
    private LinearLayout botao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial3);

        botao1=findViewById(R.id.botao1);
        botao2=findViewById(R.id.botao2);
        botao3=findViewById(R.id.botao3);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaInicial3.this,PostsListActivity.class));
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TelaInicial3.this, ListaDeCursosActivity.class));
            }
        });
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));
            }
        });

        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();
        AppRate.with(this).showRateDialog(this);

        AppRate.showRateDialogIfMeetsConditions(this);

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
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("")));

        }
        if(id==R.id.action_chat){
            //startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=arthur+luiz")));
            AppRate.with(this).showRateDialog(this);

            AppRate.showRateDialogIfMeetsConditions(this);
        }

        return true;
    }


}
