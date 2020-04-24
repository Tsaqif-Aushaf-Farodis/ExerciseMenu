package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasSegitiga extends AppCompatActivity {
    EditText et_alas,  et_tinggi;
    Button btn_LuasSegitiga;
    TextView tv_HasilLuasSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);

        et_alas = findViewById(R.id.addAlasLuas);
        et_tinggi = findViewById(R.id.addTinggiLuas);
        btn_LuasSegitiga     = findViewById(R.id.btnLuasSegitiga);
        tv_HasilLuasSegitiga = findViewById(R.id.hasilLuasSegitiga);

        btn_LuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_alas.getText().toString().trim().isEmpty() ||
                        et_tinggi.getText().toString().trim().isEmpty()){
                    Toast.makeText(LuasSegitiga.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double alas = Double.parseDouble(et_alas.getText().toString());
                    double tinggi = Double.parseDouble(et_tinggi.getText().toString());
                    double Luas = alas * tinggi / 2;
                    tv_HasilLuasSegitiga.setText("Luas Segitiga Dengan Alas "+alas+"dan tinggi "+tinggi+"  adalah: "+Luas+"");
                }
            }
        });
    }
}
