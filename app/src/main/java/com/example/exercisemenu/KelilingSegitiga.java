package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingSegitiga extends AppCompatActivity {
    EditText et_alas,  et_tinggi, et_miring;
    Button btn_kelilingSegitiga;
    TextView tv_HasilKelilingSegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);

        et_alas = findViewById(R.id.addAlasKeliling);
        et_tinggi = findViewById(R.id.addTinggiKeliling);
        et_miring = findViewById(R.id.addMiringKeliling);
        btn_kelilingSegitiga = findViewById(R.id.btnKelilingSegitiga);
        tv_HasilKelilingSegitiga = findViewById(R.id.hasilKelilingSegitiga);

        btn_kelilingSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_alas.getText().toString().trim().isEmpty() ||
                    et_tinggi.getText().toString().trim().isEmpty() ||
                    et_miring.getText().toString().trim().isEmpty()) {
                    Toast.makeText(KelilingSegitiga.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double alas = Double.parseDouble(et_alas.getText().toString());
                    double tinggi = Double.parseDouble(et_tinggi.getText().toString());
                    double miring = Double.parseDouble(et_miring.getText().toString());
                    double keliling = alas + tinggi + miring;
                    tv_HasilKelilingSegitiga.setText("Hasil Keliling Segitiga Dengan Alas: "+alas+", tinggi "+tinggi+" dan sisi miring "+miring+" adalah: "+keliling+"");
                }
            }
        });
    }
}
