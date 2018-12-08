package com.example.ian.beadando9;


import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;


public class jatek {
    private static jatek jatekpeldany;

    public static final int magassag=10;
    public static final int szelesseg=10;
    public int kovetkezo;
    public TextView pontszam;
    public int pontint=0;
  public  TextView szoveg;

    private Context adat;

    private cella[][] aknakeresomezo =new cella[szelesseg][magassag];


    public static jatek getJatekpeldany() {

        if (jatekpeldany== null) {
            jatekpeldany = new jatek();
        }
        return jatekpeldany;
    }


    private jatek() {


    }

    public void setszoveg(TextView i){

        szoveg=i;

    }
    public void setpont(TextView i){

        pontszam=i;

    }

    public void mezorajz(Context adat ){

        this.adat=adat;

        int[][] rajzoltmezo = rajzol.rajzol(magassag,szelesseg);


        mezobeallit(adat,rajzoltmezo);




    }


    private void mezobeallit(final Context adat, final int[][] mezo){

        for( int x=0;x<szelesseg;x++){
            for( int y=0;y<magassag;y++){
                if(aknakeresomezo[x][y]==null){
                    aknakeresomezo[x][y] = new cella(adat ,x,y);
                }
                aknakeresomezo[x][y].setErtek(0);
                aknakeresomezo[x][y].invalidate();



            }

        }



    }

    public int ujgolyo(){

        Random r = new Random();
        int low = 1;
        int high = 6;
        int result = r.nextInt(high-low) + low;

        return result;

    }




   public  void adjegygolyot(){

         kovetkezo=ujgolyo();

       switch (kovetkezo ){
           case 0:
               szoveg.setText("hiba");
               break;
           case 1:
               szoveg.setText("Fekete");
               break;
           case 2:
               szoveg.setText("Szürke");
               break;

           case 3:
              szoveg.setText("Barna");
               break;

           case 4:
               szoveg.setText("Lila");
               break;

           case 5:
               szoveg.setText("Sárga");
               break;

           case 6:
               szoveg.setText("Zöld");
               break;

           case 7:
               szoveg.setText("Kék");
               break;

           case 8:
               szoveg.setText("Piros");
               break;

       }




    }

    public cella getmezo(int pozicio) {

        int x = pozicio % szelesseg;
        int y = pozicio / magassag;

        return aknakeresomezo[x][y];

    }

    public cella getmezo(int x,int y){
        return aknakeresomezo[x][y];

    }


public int geprandomszam() {

    Random r = new Random();
    int low = 1;
    int high = 10;
    int result = r.nextInt(high-low) + low;
return result;
}

public void geprak(){


            adjegygolyot();

            int a = geprandomszam();
            int b = geprandomszam();

            do {
                if (!getmezo(a, b).isKattintott()) {
                    getmezo(a, b).setKattintott(kovetkezo);

                    Log.e("hibasag","egyfutas");
                    adjegygolyot();

                } else {
                    a = geprandomszam();
                    b = geprandomszam();
                }
            } while (!getmezo(a, b).isKattintott());

        }





    public void pontkeres() {


        for (int i = 0; i < szelesseg-2; i++){

            for (int j = 0; j < magassag; j++){


                if(getmezo(i,j).getErtek()==getmezo(i+1,j).getErtek() && getmezo(i,j).getErtek()==getmezo(i+2,j).getErtek() &&getmezo(i,j).getErtek() !=0 ){
                    Log.e("keres","vizszintesen talalt");
                    pontint++;
                    pontszam.setText(Integer.toString(pontint));

                    getmezo(i,j).kinullaz(0);
                    getmezo(i+1,j).kinullaz(0);
                    getmezo(i+2,j).kinullaz(0);
                }
            }
        }


        for (int i = 0; i < szelesseg; i++){

            for (int j = 0; j < magassag-2; j++){


                if(getmezo(i,j).getErtek()==getmezo(i,j+1).getErtek() && getmezo(i,j).getErtek()==getmezo(i,j+2).getErtek() &&getmezo(i,j).getErtek() !=0 ){
                    Log.e("keres","vizszintesen talalt");
                    pontint++;
                    pontszam.setText(Integer.toString(pontint));
                    getmezo(i,j).kinullaz(0);
                    getmezo(i,j+1).kinullaz(0);
                    getmezo(i,j+2).kinullaz(0);
                }
            }
        }


    }





    public void kattintas(int x, int y) {

        if(!getmezo(x, y).isKattintott() ) {

            getmezo(x,y).setKattintott(kovetkezo);

            for (int u=0;u<=4;u++) {
                geprak();
                u++;
            }

            pontkeres();




            adjegygolyot();


            }



        }







    }


