package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingTrapesium extends AppCompatActivity {
    EditText et_a, et_b, et_m;
    Button btn_KelilingTrapesium;
    TextView tv_HasilKelilingTrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);

        et_a = findViewById(R.id.addPAKeliling);
        et_b = findViewById(R.id.addPBKeliling);
        et_m = findViewById(R.id.addMKeliling);
        btn_KelilingTrapesium = findViewById(R.id.btnKelilingTrapesium);
        tv_HasilKelilingTrapesium = findViewById(R.id.hasilKelilingTrapesium);

        btn_KelilingTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_a.getText().toString().trim().isEmpty() ||
                        et_b.getText().toString().trim().isEmpty() ||
                        et_m.getText().toString().trim().isEmpty()) {
                    Toast.makeText(KelilingTrapesium.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double a = Double.parseDouble(et_a.getText().toString());
                    double b = Double.parseDouble(et_b.getText().toString());
                    double m = Double.parseDouble(et_m.getText().toString());
                    double keliling = a + b + (m * 2);
                    tv_HasilKelilingTrapesium.setText("Hasil Keliling Trapesium Dengan Panjang A "+a+", Panjang B "+b+" dan sisi miring "+m+" adalah: "+keliling+"");
                }
            }
        });
    }
}
