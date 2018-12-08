package com.example.ian.beadando9;



public class rajzol {


    public static  int [] [] rajzol(final int szel, final int mag){



        int [] [] mezo =new int [szel] [mag];
        for (int i=0; i<szel;i++) {
            mezo[i] = new int[mag];
        }

        for( int i=0; i<szel; i++){

            for( int j=0;j<mag;j++) {

                mezo[i][j]=0;
            }
        }

        return mezo;
    }


}









