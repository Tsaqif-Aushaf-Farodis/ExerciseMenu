package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingLingkaran extends AppCompatActivity {
    EditText et_JariJari;
    Button btn_KelilingLingkaran;
    TextView tv_HasilKelilingLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);

        et_JariJari = findViewById(R.id.addJari2Keliling);
        btn_KelilingLingkaran = findViewById(R.id.btnKelilingLingkaran);
        tv_HasilKelilingLingkaran = findViewById(R.id.hasilKelilingLingkaran);

        btn_KelilingLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_KelilingLingkaran.getText().toString().trim().isEmpty() ||
                et_JariJari.getText().toString().trim().isEmpty()) {
                    Toast.makeText(KelilingLingkaran.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double jarijari = Double.parseDouble(et_JariJari.getText().toString());
                    double keliling = 2 * 3.14 * jarijari;
                    //double keliling2 = 2 * 22/7 * jarijari;
                    //double keliling3 = 2 * Math.PI * jarijari;
                    tv_HasilKelilingLingkaran.setText("Hasil Keliling Lingkaran Dengan Jari-jari: "+jarijari+" adalah: "+keliling+"");
                }
            }
        });
    }
}
