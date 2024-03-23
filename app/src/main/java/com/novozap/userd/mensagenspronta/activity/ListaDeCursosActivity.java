package com.novozap.userd.mensagenspronta.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.novozap.userd.mensagenspronta.GooglePlayStoreAppVersionNameLoader;
import com.novozap.userd.mensagenspronta.PostsListActivity;
import com.novozap.userd.mensagenspronta.R;
import com.novozap.userd.mensagenspronta.adapter.AdapterCursosPersonalizado;
import com.novozap.userd.mensagenspronta.model.Categoria;
import com.novozap.userd.mensagenspronta.model.Curso;
import com.novozap.userd.mensagenspronta.model.EstadoAtual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hotchemi.android.rate.AppRate;


public class ListaDeCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new GooglePlayStoreAppVersionNameLoader().execute();

        setContentView(R.layout.activity_lista_de_cursos);
        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();
        AppRate.with(this).showRateDialog(this);

        AppRate.showRateDialogIfMeetsConditions(this);
        ListView lista = (ListView) findViewById(R.id.lista);
        List<Curso> cursos = todosOsCursos();
        AdapterCursosPersonalizado adapter = new AdapterCursosPersonalizado(cursos, this);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//Agradecimento
                if(position==0){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data1");
                    startActivity(intent);






                }
//AutoEstima
                if(position==1){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data4");
                    startActivity(intent);






                }
                //Amor
                if(position==2){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data26");
                    startActivity(intent);






                }
                //Albert Einstein
                if(position==3){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m1");
                    startActivity(intent);






                }
                //Amizade
                if(position==4){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data14");
                    startActivity(intent);






                }
                //Aniversário
                if(position==5){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data2");
                    startActivity(intent);






                }
                //Ano Novo
                if(position==6){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m10");
                    startActivity(intent);






                }
                //Ano Atitude
                if(position==7){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data33");
                    startActivity(intent);






                }
                //Ansiedade
                if(position==8){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m11");
                    startActivity(intent);






                }
                //Augusto Cury
                if(position==9){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m12");
                    startActivity(intent);






                }
                //Beijo
                if(position==10){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m13");
                    startActivity(intent);






                }
                //Bom Dia
                if(position==11){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m14");
                    startActivity(intent);






                }
                //Boa Tarde
                if(position==12){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m15");
                    startActivity(intent);






                }
                //Boa Noite
                if(position==13){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m16");
                    startActivity(intent);






                }
                //Boa Semana
                if(position==14){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data34");
                    startActivity(intent);






                }
                //Bob Marley
                if(position==15){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m17");
                    startActivity(intent);






                }
                //Biblicas
                if(position==16){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","art1");
                    startActivity(intent);






                }
                //Bomdia/Boatarde/Boa  Noite
                if(position==17){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","art");
                    startActivity(intent);






                }
                //Xavecos
                if(position==18){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data11");
                    startActivity(intent);






                }
                //Bonitas de Amor
                if(position==19){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data8");
                    startActivity(intent);






                }
                //Bonitas Whatsapp
                if(position==20){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data9");
                    startActivity(intent);






                }
                //Cantadas
                if(position==21){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data11");
                    startActivity(intent);






                }
                //Cristas
                if(position==22){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","art1");
                    startActivity(intent);






                }
                //Caminhoneiro
                if(position==23){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m18");
                    startActivity(intent);






                }
                //Charles chaplin
                if(position==24){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m19");
                    startActivity(intent);






                }
                //Chuck norris
                if(position==25){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m21");
                    startActivity(intent);






                }
                //Clarice linspector
                if(position==26){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m2");
                    startActivity(intent);






                }
                //Decepçao
                if(position==27){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data37");
                    startActivity(intent);






                }
                //Declaraçao de amor
                if(position==28){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data24");
                    startActivity(intent);






                }
                //Crush
                if(position==29){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data26");
                    startActivity(intent);






                }
                //Genios
                if(position==30){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data10");
                    startActivity(intent);






                }
                //Desculpas
                if(position==31){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data36");
                    startActivity(intent);






                }
                //Desenhos
                if(position==32){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m23");
                    startActivity(intent);






                }
                //Elogios
                if(position==33){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data16");
                    startActivity(intent);






                }
                //Engraçadas
                if(position==34){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data17");
                    startActivity(intent);






                }
                //Super heroi
                if(position==35){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m23");
                    startActivity(intent);






                }
                //Paulo coelho
                if(position==36){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m24");
                    startActivity(intent);






                }
                //Fernando Pessoa
                if(position==37){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m25");
                    startActivity(intent);






                }
                //Machado de Assim
                if(position==38){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m26");
                    startActivity(intent);






                }
                //Despedida
                if(position==39){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data15");
                    startActivity(intent);






                }
                //Dia das Mães
                if(position==40){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m27");
                    startActivity(intent);






                }
                //Dia dos namorados
                if(position==41){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m28");
                    startActivity(intent);






                }
                //Dia dos pais
                if(position==42){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m29");
                    startActivity(intent);






                }
                //Dinheiro
                if(position==43){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m3");
                    startActivity(intent);






                }
                //Diversas
                if(position==44){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data48");
                    startActivity(intent);






                }
                //Eróticas
                if(position==45){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m30");
                    startActivity(intent);






                }
                //Facebook
                if(position==46){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data48");
                    startActivity(intent);






                }
                //Esperança
                if(position==47){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m31");
                    startActivity(intent);






                }//Família
                if(position==48){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m32");
                    startActivity(intent);






                }
                //Felicidade
                if(position==49){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m33");
                    startActivity(intent);






                }
                //Final de Semana
                if(position==50){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data18");
                    startActivity(intent);






                }
                //Caio fernando abreu
                if(position==51){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m34");
                    startActivity(intent);






                }
                //Filhos
                if(position==52){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m35");
                    startActivity(intent);






                }
                //Filmes,Série e Livros
                if(position==53){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m36");
                    startActivity(intent);






                }
                //Hommer Simpson
                if(position==54){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m37");
                    startActivity(intent);






                }
                //Humildade
                if(position==55){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m38");
                    startActivity(intent);






                }
                //Frases com Indiretas
                if(position==56){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data19");
                    startActivity(intent);






                }//Incentico
                if(position==57){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data20");
                    startActivity(intent);






                }
                //Motivção
                if(position==58){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data28");
                    startActivity(intent);






                }
                //Motivadoras
                if(position==59){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data28");
                    startActivity(intent);






                }
                //Ironia
                if(position==60){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data22");
                    startActivity(intent);






                }
                //Indiretas
                if(position==61){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data19");
                    startActivity(intent);






                }
                //Inteligentes
                if(position==62){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data10");
                    startActivity(intent);






                }
                //Inveja
                if(position==63){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m39");
                    startActivity(intent);






                }
                //Justiça
                if(position==64){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m4");
                    startActivity(intent);






                }
                //Legenda para fotos
                if(position==65){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m40");
                    startActivity(intent);






                }
                //Lindas
                if(position==66){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data23");
                    startActivity(intent);






                }
                //Lindas de Amor
                if(position==67){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data24");
                    startActivity(intent);






                }
                //Livros
                if(position==68){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data25");
                    startActivity(intent);






                }
                //Luto
                if(position==69){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data15");
                    startActivity(intent);






                }
                //Mentira
                if(position==70){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m42");
                    startActivity(intent);






                }
                //Músicas
                if(position==71){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data30");
                    startActivity(intent);






                }
                //Mensagem de amor
                if(position==72){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data26");
                    startActivity(intent);






                }
                //Natal
                if(position==73){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m43");
                    startActivity(intent);






                }
                //Paciência
                if(position==74){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m44");
                    startActivity(intent);






                }
                //Perguntas
                if(position==75){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data13");
                    startActivity(intent);






                }
                //Para conquistar
                if(position==76){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data32");
                    startActivity(intent);






                }
                //Odio
                if(position==77){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data31");
                    startActivity(intent);






                }
                //Reflexao
                if(position==78){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data35");
                    startActivity(intent);






                }
                //Romantica
                if(position==79){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data41");
                    startActivity(intent);






                }
                //Sinceridade
                if(position==80){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m46");
                    startActivity(intent);






                }
                //Vinicius de moraes
                if(position==81){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m47");
                    startActivity(intent);






                }
                //Perdão
                if(position==82){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data36");
                    startActivity(intent);






                }
                //Tristeza
                if(position==83){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data37");
                    startActivity(intent);






                }
                //Poemas de amor
                if(position==84){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data38");
                    startActivity(intent);






                }
                //Otimismo
                if(position==85){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data40");
                    startActivity(intent);






                }
                //Rimas de amor
                if(position==86){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data42");
                    startActivity(intent);






                }
                //Sabedoria
                if(position==87){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data44");
                    startActivity(intent);






                }
                //Sacarsmo
                if(position==88){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data43");
                    startActivity(intent);






                }
                //Solteiras
                if(position==89){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data46");
                    startActivity(intent);






                }
                //Sucesso
                if(position==90){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data47");
                    startActivity(intent);






                }
                //Status whatsapp
                if(position==91){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data48");
                    startActivity(intent);






                }//Superaçao
                if(position==92){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data49");
                    startActivity(intent);






                }//Walt disney
                if(position==93){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m48");
                    startActivity(intent);






                }
                //Whastapp
                if(position==94){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data48");
                    startActivity(intent);






                }
               // Shaskpeare
                if(position==95){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","m49");
                    startActivity(intent);




//Zoacao

                }
                if(position==96){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","data17");
                    startActivity(intent);






                }

                //Amyr Klink
                if(position==97){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdklik");
                    startActivity(intent);






                }

                //Oscar Wilde
                if(position==98){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdwilde");
                    startActivity(intent);






                }
                //Segunda
                if(position==99){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdseg");
                    startActivity(intent);






                }
                //Terca
                if(position==100){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdterc");
                    startActivity(intent);






                }
                //Quarta
                if(position==101){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdquart");
                    startActivity(intent);






                }
                //quinta
                if(position==102){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdquint");
                    startActivity(intent);






                }
                //sexta
                if(position==103){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdsexta");
                    startActivity(intent);






                }
                //sab
                if(position==104){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdsab");
                    startActivity(intent);






                }
                //dom
                if(position==105){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bddomingo");
                    startActivity(intent);






                }
                //luis fernado verissimo
                if(position==106){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdverissimo");
                    startActivity(intent);






                }
                //camoes
                if(position==107){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcamoes");
                    startActivity(intent);






                }
                //dalai lama
                if(position==108){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdlama");
                    startActivity(intent);






                }
                //martin luther king
                if(position==109){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdking");
                    startActivity(intent);






                }
                //carlos drummond de andrade
                if(position==110){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcarlos");
                    startActivity(intent);






                }
                //falsiane
                if(position==111){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdfals");
                    startActivity(intent);






                }
                //neruda
                if(position==112){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdneruda");
                    startActivity(intent);






                }
                //gandhi
                if(position==113){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdgand");
                    startActivity(intent);






                }
                //karl marx
                if(position==114){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdmarx");
                    startActivity(intent);






                }
                //buda
                if(position==115){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdbuda");
                    startActivity(intent);






                }
                //saramago
                if(position==116){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdsaramago");
                    startActivity(intent);






                }
                //tati
                if(position==117){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdtati");
                    startActivity(intent);






                }
                //cicero
                if(position==118){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcicero");
                    startActivity(intent);






                }
                //milor fernandes
                if(position==119){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdfernandes");
                    startActivity(intent);






                }
                //senna
                if(position==120){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdsena");
                    startActivity(intent);






                }
                //mandela
                if(position==121){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdmandela");
                    startActivity(intent);






                }
                //cecilia meireles
                if(position==122){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcecilia");
                    startActivity(intent);






                }
                //john lennon
                if(position==123){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdlennon");
                    startActivity(intent);






                }
                //renato russo
                if(position==124){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdrenato");
                    startActivity(intent);






                }
                //bill gates
                if(position==125){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdgates");
                    startActivity(intent);






                }
                //Jesus
                if(position==126){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdjejus");
                    startActivity(intent);






                }
                //padre fabio de mello
                if(position==127){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdpadrefabio");
                    startActivity(intent);






                }
                //wooddy allen
                if(position==128){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome"," bdallen");
                    startActivity(intent);






                }
                //steve jobs
                if(position==129){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdsteve");
                    startActivity(intent);






                }
                //cortella
                if(position==130){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcortella");
                    startActivity(intent);






                }
                //cazuza
                if(position==131){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdcazuza");
                    startActivity(intent);






                }
                //karnal
                if(position==132){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdkarnal");
                    startActivity(intent);






                }
                //chico xavier
                if(position==133){

                    Intent intent = new Intent(ListaDeCursosActivity.this, PostsListActivity.class);



                    intent.putExtra("nome","bdchico");
                    startActivity(intent);






                }








            }
        });
    }

    /**
     * Exemplo qualquer de devolução de uma lista de cursos.
     * Para esse exemplo será considerado um hard coded.
     *
     * @return lista com todos os cursos
     */
    private List<Curso> todosOsCursos() {
        return new ArrayList<>(Arrays.asList(
                new Curso("Agradecimento", "Frases e Imagens ", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Auto Estima", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Amor", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Albert Einstein", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Amizade ", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Aniversário", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Ano Novo", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Atitude", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Ansiedade", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Augusto Cury", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Beijo", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Bom Dia", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                new Curso("Boa Tarde", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Boa Noite", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Boa Semana", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Bob Marley", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Bíblicas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Bom dia/Boa tarde/Boa noite", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Xavecos", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Bonitas de Amor", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Bonitas WhatsApp", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Cantadas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Cristãs", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Caminhoneiro", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Charles Chaplin", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Chuck Norris", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Clarice Linspector", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Decepção", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Declaração de Amor", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Crush", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                new Curso("Geniais", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Desculpas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Desenhos", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Elogios", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Engraçadas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Super-Héroi", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                new Curso("Paulo Coelho", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Fernando Pessoa", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Machado de Assis", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Despedida", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Dia das Mães", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Dia dos Namorados", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Dia dos pais", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Dinheiro", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Diversas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                new Curso("Eróticas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Facebook", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Esperança", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Família", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Felicidade", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Final de Semana", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Caio Fernando de Abreu", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Filhos", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Filmes,Série e Livros", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Hommer Simpson", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Humildade", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Frases com Indiretas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Incentivo", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Motivação", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Motivadoras", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                new Curso("Irônicas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Indiretas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Inteligentes", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Inveja", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Justiça", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Legenda para Fotos", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Lindas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Lindas de Amor", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Livros", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Luto", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Mentira", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Músicas", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Mensagem de Amor", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Natal", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Paciência", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Pichação", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Para Conquistar", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Raiva/Ódio", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Reflexão", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Românticas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Sinceridade", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                 new Curso("Vinícius de Moraes", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Perdão", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Tristeza", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Poemas de Amor", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Otimistas", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Rimas de Amor", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                  new Curso("Sabedoria", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Sacarsmo", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Solteiras", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                  new Curso("Sucesso", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Status para WhatsApp", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Superação", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                  new Curso("Walt Disney", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("WhatsApp", "Frases e Imagens", EstadoAtual.FAZENDO, Categoria.HTML),
                new Curso("Willian Shakepeare", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID) ,
                 new Curso("Zoação", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.JAVA),
                new Curso("Amyr Klink ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Oscar Wilde ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Segunda Feira ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Terça Feira ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Quarta Feira ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Quinta Feira  ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Sexta Feira  ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Sábado ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Domingo ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Luis Fernando Veríssimo ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Luis de Camões", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Dalai Lama ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Martin Luther King", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Carlos Drummond", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Falsiane ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Neruda ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Gandhi ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Karl Marx ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Buda ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Saramago ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Tati Bernadi ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Cicero ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Millor Fernandes ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Ayrton Senna ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Nelson Mandela", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Cecília meireles  ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("John Lennon ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Renato Russo ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Bill Gates  ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Jesus ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Padre Fabio de Melo ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Woody Allen ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Steve Jobs ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Mario Sergio Cortella ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Cazuza ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Karnal ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID),
                new Curso("Chico Xavier ", "Frases e Imagens", EstadoAtual.FINALIZADO, Categoria.ANDROID)));

    }
}
