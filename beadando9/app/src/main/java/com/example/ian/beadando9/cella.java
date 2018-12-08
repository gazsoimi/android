package com.example.ian.beadando9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;


public class cella extends alapcella implements View.OnClickListener
    {

    public cella (Context adat, int  x, int y){

        super(adat);

        setPozicio(x,y);

        setOnClickListener(this);

    }



    @Override
    protected void onMeasure(int szelessegmeret, int magassagmeret) {
        super.onMeasure(szelessegmeret, szelessegmeret);
    }

    protected  void onDraw(Canvas vaszon) {

        super.onDraw(vaszon);
        Log.d("MainActivity" , "onDraw");



           if(!isKattintott()){


               gombrajzol(vaszon);

           } else{


                szamrajzol(vaszon);



        }


    }






        private void gombrajzol(Canvas vaszon){

            Drawable kocka =ContextCompat.getDrawable(getContext(),R.drawable.fedett);
            kocka.setBounds(0,0,getWidth(),getHeight());
            kocka.draw(vaszon);




        }



    private void szamrajzol(Canvas vaszon){


        Drawable drawable = null;

        switch (getErtek() ){
            case 0:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.fedett);
                break;
            case 1:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.egy);
                break;
            case 2:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.ketto);
                break;
            case 3:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.harom);
                break;
            case 4:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.negy);
                break;
            case 5:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.ot);
                break;
            case 6:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.hat);
                break;
            case 7:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.het);
                break;
            case 8:
                drawable = ContextCompat.getDrawable(getContext(), R.drawable.nyolc);
                break;
        }

        drawable.setBounds(0,0,getWidth(),getHeight());
        drawable.draw(vaszon);



    }

        @Override
        public void onClick(View view) {

        jatek.getJatekpeldany().kattintas(getXpozicio(),getYpozicio());
        }


}
