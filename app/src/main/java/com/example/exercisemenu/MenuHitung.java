package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    TextView tv_persegi, tv_lingkaran, tv_persegiPanjang, tv_segitiga, tv_trapesium;
    int kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

        tv_persegi = findViewById(R.id.tvPersegi);
        tv_lingkaran = findViewById(R.id.tvLingkaran);
        tv_persegiPanjang = findViewById(R.id.tvPersegiPanjang);
        tv_segitiga = findViewById(R.id.tvSegitiga);
        tv_trapesium = findViewById(R.id.tvTrapesium);

        tv_persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=1;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        tv_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=2;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        tv_persegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=3;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        tv_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kode=4;
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), v);
                popupMenu.setOnMenuItemClickListener(MenuHitung.this);
                popupMenu.inflate(R.menu.main_menu);
                popupMenu.show();
            }
        });

        tv_trapesium.setOnClickListener(new View.OnClickListener() {
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
