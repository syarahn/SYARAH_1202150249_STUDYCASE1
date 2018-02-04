package com.example.gl552vw.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView menu, porsi, tempat, harga;

    int hargaEatbus = 50000;
    int hargaAbnormal = 30000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        tempat = (TextView) findViewById(R.id.tempat);
        menu = (TextView) findViewById(R.id.menu);
        porsi = (TextView) findViewById(R.id.porsi);
        harga = (TextView) findViewById(R.id.harga);

        String sTempat = intent.getStringExtra("tempat");
        String sMenu = intent.getStringExtra("makanan");
        String sPorsi = intent.getStringExtra("porsi");
        int uang = intent.getIntExtra("uangOsas", 0);

        //parse int ke string
        int intPorsi = Integer.parseInt(sPorsi);

        tempat.setText(sTempat);
        menu.setText(sMenu);
        porsi.setText(sPorsi);

        switch (sTempat) {
            case "Abnormal":
                harga.setText(String.valueOf(hargaAbnormal*intPorsi));
                if (hargaAbnormal*intPorsi < uang) {
                    Toast.makeText(this,
                            "Uang kamu cukup, silahkan berkunjung",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this,
                            "Uang kamu ga cukup, silahkan cari tempat lain",Toast.LENGTH_LONG).show();
                }
                break;
            case "Eatbus":
                harga.setText(String.valueOf(hargaEatbus*intPorsi));
                if (hargaEatbus*intPorsi > uang) {
                    Toast.makeText(this,
                            "Uang kamu ga cukup, silahkan cari tempat lain",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this,
                            "Uang kamu cukup, silahkan berkunjung",Toast.LENGTH_LONG).show();
                }
                break;
        }

    }
}
