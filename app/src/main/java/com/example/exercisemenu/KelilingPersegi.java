package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingPersegi extends AppCompatActivity {
    EditText et_sisi;
    Button btn_KelilingPersegi;
    TextView tv_HasilKelilingPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);

        et_sisi = findViewById(R.id.addSisiKeliling);
        btn_KelilingPersegi = findViewById(R.id.btnKelilingPersegi);
        tv_HasilKelilingPersegi = findViewById(R.id.hasilKelilingPersegi);

        btn_KelilingPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_sisi.getText().toString().trim().isEmpty()) {
                    Toast.makeText(KelilingPersegi.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double sisi = Double.parseDouble(et_sisi.getText().toString());
                    double keliling = 4 * sisi;
                    tv_HasilKelilingPersegi.setText("Hasil keliling persegi dengan sisi: "+sisi+" adalah: "+keliling+"");
                }
            }
        });
    }
}
