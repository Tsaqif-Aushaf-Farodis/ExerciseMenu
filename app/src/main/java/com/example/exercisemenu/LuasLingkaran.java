package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LuasLingkaran extends AppCompatActivity {
    EditText et_JariJari;
    Button btn_LuasLingkaran;
    TextView tv_HasilLuasLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        et_JariJari = findViewById(R.id.addJari2Luas);
        btn_LuasLingkaran = findViewById(R.id.btnLuasLingkaran);
        tv_HasilLuasLingkaran = findViewById(R.id.hasilLuasLingkaran);

        btn_LuasLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_JariJari.getText().toString().trim().isEmpty()) {
                    Toast.makeText(LuasLingkaran.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double jarijari = Double.parseDouble(et_JariJari.getText().toString());
                    double Luas = 3.14 * jarijari * jarijari;
                    //double Luas2 = 22/7 * jarijari * jarijari;
                    //double Luas3 = Math.PI * jarijari * jarijari;
                    tv_HasilLuasLingkaran.setText("Luas lingkaran dengan jari-jari "+jarijari+" adalah: "+Luas+"");
                }
            }
        });
    }
}
