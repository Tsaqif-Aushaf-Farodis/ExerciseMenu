package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasTrapesium extends AppCompatActivity {
    EditText et_a, et_b, et_t;
    Button btn_LuasTrapesium;
    TextView tv_HasilLuasTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);

        et_a = findViewById(R.id.addPALuas);
        et_b = findViewById(R.id.addPBLuas);
        et_t = findViewById(R.id.addTLuas);
        btn_LuasTrapesium = findViewById(R.id.btnLuasTrapesium);
        tv_HasilLuasTrapesium = findViewById(R.id.hasilLuasTrapesium);

        btn_LuasTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_a.getText().toString().trim().isEmpty() ||
                        et_b.getText().toString().trim().isEmpty() ||
                        et_t.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LuasTrapesium.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double a = Double.parseDouble(et_a.getText().toString());
                    double b = Double.parseDouble(et_b.getText().toString());
                    double t = Double.parseDouble(et_t.getText().toString());
                    double Luas = (a + b) * t / 2;
                    tv_HasilLuasTrapesium.setText("Luas Trapesium Dengan Panjang A "+a+", Panjang B "+b+" dan tinggi "+t+" adalah: "+Luas+"");
                }
            }
        });
    }
}
