package com.example.ian.beadando9;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView kovigolyo;
    TextView pont;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kovigolyo=(TextView)findViewById(R.id.jatekoskovigolyo);
        pont=(TextView)findViewById(R.id.jatekospontszam);

        Log.e("MainActivity","onCreate");

        jatek.getJatekpeldany().mezorajz(this);

        jatek.getJatekpeldany().setszoveg(kovigolyo);
        jatek.getJatekpeldany().setpont(pont);
jatek.getJatekpeldany().adjegygolyot();




    }
}
