package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuHitung extends AppCompatActivity {
    TextView tv_persegi, tv_lingkaran, tv_persegiPanjang, tv_segitiga, tv_trapesium;
    String persegi, lingkaran, persegiPanjang, segitiga, trapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

        tv_persegi = (TextView) findViewById(R.id.tvPersegi);
        tv_lingkaran = (TextView) findViewById(R.id.tvLingkaran);
        tv_persegiPanjang = (TextView) findViewById(R.id.tvPersegiPanjang);
        tv_segitiga = (TextView) findViewById(R.id.tvSegitiga);
        tv_trapesium = (TextView) findViewById(R.id.tvTrapesium);
    }
}
