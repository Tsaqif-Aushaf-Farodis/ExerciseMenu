package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MenuHitung extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
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

    public void showMenu(View v){
        PopupMenu menu = new PopupMenu(this, v);
        menu.setOnMenuItemClickListener(this);
        menu.inflate(R.menu.main_menu);
        menu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.luas:
                Toast.makeText(this, "Test Luas", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.keliling:
                Toast.makeText(this, "Test Keliling", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}
