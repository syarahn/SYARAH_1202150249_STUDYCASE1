package com.example.gl552vw.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mMenu, mPorsi;
    private int uangOsas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = (EditText) findViewById(R.id.makanan);
        mPorsi = (EditText) findViewById(R.id.jumlah);
    }

    public void btn_eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("tempat", "Eatbus");
        intent.putExtra("makanan", mMenu.getText().toString());
        intent.putExtra("porsi", mPorsi.getText().toString());
        intent.putExtra("uang_osas", uangOsas);

        startActivity(intent);
    }

    public void btn_abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("tempat", "Abnormal");
        intent.putExtra("makanan", mMenu.getText().toString());
        intent.putExtra("porsi", mPorsi.getText().toString());
        intent.putExtra("uang_osas", uangOsas);

        startActivity(intent);
    }
}
