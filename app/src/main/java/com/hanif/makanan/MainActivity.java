package com.hanif.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(view -> {
            TextView usernameTV = findViewById(R.id.username_edt);
            TextView passwordTV = findViewById(R.id.password_edt);

            String username = usernameTV.getText().toString();
            String password = passwordTV.getText().toString();

            if (username.equals("test") && password.equals("123456")) {
                Log.d("success", "Sukses Login");
                //Jika iya pindah activity
                //Menggunakan Explicit Intent
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                this.finish();
            }  else {
                Log.d("failed", "Gagal login");
                //Jika tidak tampilkan pesan error
                Toast toast = Toast.makeText(getApplicationContext(), "Username/Password salah", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}