package com.example.ian.beadando9;

import android.content.Context;
import android.view.View;

import com.example.ian.beadando9.jatek;

public abstract class alapcella extends View {

    private int ertek, x,y,pozicio;


    private boolean lathatoe;
    private boolean kattintott;


    public alapcella(Context adat){
        super(adat);
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {


        lathatoe=false;
        kattintott=false;
        this.ertek = ertek;
    }

    public void kinullaz(int ertek) {


        lathatoe=false;
        kattintott=false;
        this.ertek = ertek;
        invalidate();
    }




    public boolean isLathatoe() {
        return lathatoe;
    }

    public void setLathatoe() {
        lathatoe=true;
        invalidate();
           }


    public boolean isKattintott() {
        return kattintott;
    }




    public void setKattintott(int ertek) {
        this.kattintott=true;
        this.lathatoe = true;
        this.ertek=ertek;

        invalidate();
    }



    public int getXpozicio() {
        return x;
    }


    public int getYpozicio() {
        return y;
    }


    public int getPozicio() {
        return pozicio;
    }


    public void setPozicio(int x,int y) {

        this.x = x;
        this.y = y;

        this.pozicio = y * jatek.szelesseg + x;

        invalidate();

    }










}
