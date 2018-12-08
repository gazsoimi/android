package com.example.ian.beadando9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.example.ian.beadando9.jatek;

public class mezo extends GridView{

    public mezo(Context adat , AttributeSet attrs){
        super(adat,attrs);




        jatek.getJatekpeldany().mezorajz(adat);
        setNumColumns(jatek.szelesseg);
        setAdapter(new mezoadapter());

    }

    @Override
    protected void onMeasure(int szelessegmeret, int magassagmeret) {
        super.onMeasure(szelessegmeret, magassagmeret);

    }
    private class mezoadapter extends BaseAdapter{


        @Override
        public int getCount() {
            return jatek.getJatekpeldany().szelesseg * jatek.getJatekpeldany().magassag;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return jatek.getJatekpeldany().getmezo(i);
        }
    }



}

