package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
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
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=2;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=3;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=4;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=5;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.luas:
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
                }break;

            case R.id.keliling:
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
                }break;
        }return false;
    }
}
