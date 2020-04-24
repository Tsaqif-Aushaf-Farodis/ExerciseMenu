package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    EditText addUsername, addPassword;
    Button btnLogin;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbarLogin);
        setSupportActionBar(toolbar);

        addUsername   = findViewById(R.id.username);
        addPassword = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Membaca input dari editText
                username   = addUsername.getText().toString();
                password = addPassword.getText().toString();

                if (username.equals("") || password.equals("")){
                    //Pindah activity
                    Toast.makeText(getApplicationContext(),
                            "Login Failed", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),
                            "Selamat Datang "+username+"", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),MenuHitung.class);
                    startActivity(i);
                }
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
        getSupportActionBar().setTitle("Login");
        toolbar.setSubtitle("Silahkan login terlebih dahulu");
    }
}
