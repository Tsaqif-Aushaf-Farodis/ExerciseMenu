package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KelilingPersegiPanjang extends AppCompatActivity {
    EditText et_Panjang, et_Lebar;
    Button btn_KelilingPP;
    TextView tv_HasilKelilingPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi_panjang);

        et_Panjang = findViewById(R.id.addPanjangKeliling);
        et_Lebar = findViewById(R.id.addLebarKeliling);
        btn_KelilingPP = findViewById(R.id.btnKelilingPP);
        tv_HasilKelilingPP = findViewById(R.id.hasilKelilingPP);

        btn_KelilingPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_Panjang.getText().toString().trim().isEmpty() ||
                        et_Lebar.getText().toString().trim().isEmpty()) {
                    Toast.makeText(KelilingPersegiPanjang.this,
                            "Data Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    double panjang = Double.parseDouble(et_Panjang.getText().toString());
                    double lebar = Double.parseDouble(et_Lebar.getText().toString());
                    double keliling = 2 * (panjang + lebar);
                    tv_HasilKelilingPP.setText("Hasil keliling persegi panjang dengan panjang: "+panjang+" dan lebar "+lebar+" adalah: "+keliling+"");
                }
            }
        });
    }
}
