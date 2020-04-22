package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    TextView tv_persegi, tv_lingkaran, tv_persegiPanjang, tv_segitiga, tv_trapesium;
    String persegi, lingkaran, persegiPanjang, segitiga, trapesium;
    int kode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_hitung);

        tv_persegi = (TextView) findViewById(R.id.tvPersegi);
        tv_lingkaran = (TextView) findViewById(R.id.tvLingkaran);
        tv_persegiPanjang = (TextView) findViewById(R.id.tvPersegiPanjang);
        tv_segitiga = (TextView) findViewById(R.id.tvSegitiga);
        tv_trapesium = (TextView) findViewById(R.id.tvTrapesium);

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
            case R.id.tvPersegi:
                if (item.getItemId() == R.id.luas){
                    Intent luasPersegi = new Intent(getApplicationContext(), LuasPersegi.class);
                    startActivity(luasPersegi);
                }else{
                    Intent kelilingPersegi = new Intent(getApplicationContext(), KelilingPersegi.class);
                    startActivity(kelilingPersegi);
                }
            default:
                return false;
        }
    }
}
