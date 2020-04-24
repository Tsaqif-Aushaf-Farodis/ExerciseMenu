package com.example.exercisemenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Objects;

public class MenuHitung extends AppCompatActivity {
    Button persegi, lingkaran, persegiPanjang, segitiga, trapesium;
    int kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

        persegi = findViewById(R.id.tvPersegi);
        lingkaran = findViewById(R.id.tvLingkaran);
        persegiPanjang = findViewById(R.id.tvPersegiPanjang);
        segitiga = findViewById(R.id.tvSegitiga);
        trapesium = findViewById(R.id.tvTrapesium);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=1;
                showDialog();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=2;
                showDialog();
            }
        });

        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=3;
                showDialog();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=4;
                showDialog();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=5;
                showDialog();
            }
        });
    }

    private void showDialog(){
        final AlertDialog dialog = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_popup, null);

        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.activity_popup);

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        Objects.requireNonNull(dialog.getWindow()).setLayout((7 * width) / 7, LinearLayout.LayoutParams.WRAP_CONTENT);

        Button luas = dialogView.findViewById(R.id.btnluas);
        Button keliling = dialogView.findViewById(R.id.btnkeliling);
        luas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (kode==1){
                    Intent intent = new Intent(getApplicationContext(), LuasPersegi.class);
                    startActivity(intent);
                }else if (kode==2){
                    Intent intent = new Intent(getApplicationContext(), LuasLingkaran.class);
                    startActivity(intent);
                }else if (kode==3){
                    Intent intent = new Intent(getApplicationContext(), LuasPersegiPanjang.class);
                    startActivity(intent);
                }else if (kode==4){
                    Intent intent = new Intent(getApplicationContext(), LuasSegitiga.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getApplicationContext(), LuasTrapesium.class);
                    startActivity(intent);
                }
                dialog.cancel();
            }
        });
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kode==1){
                    Intent intent = new Intent(getApplicationContext(), KelilingPersegi.class);
                    startActivity(intent);
                }else if (kode==2){
                    Intent intent = new Intent(getApplicationContext(), KelilingLingkaran.class);
                    startActivity(intent);
                }else if (kode==3){
                    Intent intent = new Intent(getApplicationContext(), KelilingPersegiPanjang.class);
                    startActivity(intent);
                }else if (kode==4){
                    Intent intent = new Intent(getApplicationContext(), KelilingSegitiga.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getApplicationContext(), KelilingTrapesium.class);
                    startActivity(intent);
                }
                dialog.cancel();
            }
        });
        dialog.show();
    }
}
