package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegiPanjang extends AppCompatActivity {
    EditText et_Panjang, et_Lebar;
    Button btn_LuasPP;
    TextView tv_HasilLuasPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);

        et_Panjang = findViewById(R.id.addPanjangLuas);
        et_Lebar = findViewById(R.id.addLebarLuas);
        btn_LuasPP = findViewById(R.id.btnLuasPP);
        tv_HasilLuasPP = findViewById(R.id.hasilLuasPP);

        btn_LuasPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_Panjang.getText().toString().trim().isEmpty() ||
                        et_Lebar.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LuasPersegiPanjang.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double panjang = Double.parseDouble(et_Panjang.getText().toString());
                    double lebar = Double.parseDouble(et_Lebar.getText().toString());
                    double Luas = panjang * lebar;
                    tv_HasilLuasPP.setText("Luas persegi panjang dengan panjang "+panjang+" dan lebar "+lebar+" adalah: "+Luas+"");
                }
            }
        });
    }
}
