package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasPersegi extends AppCompatActivity {
    EditText et_sisi;
    Button btn_LuasPersegi;
    TextView tv_HasilLuasPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);

        et_sisi = findViewById(R.id.addSisiLuas);
        btn_LuasPersegi = findViewById(R.id.btnLuasPersegi);
        tv_HasilLuasPersegi = findViewById(R.id.hasilLuasPersegi);

        btn_LuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_sisi.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LuasPersegi.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double sisi = Double.parseDouble(et_sisi.getText().toString());
                    double Luas = sisi * sisi;
                    tv_HasilLuasPersegi.setText("Luas persegi dengan sisi "+sisi+" adalah: "+Luas+"");
                }
            }
        });
    }
}
