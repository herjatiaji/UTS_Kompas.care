package com.pad1.uts_kompascare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class loginActivity extends AppCompatActivity {
    public static final String MESSAGE_ORDER = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);
        MaterialButton loginBtn = findViewById(R.id.loginbtn);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("pakjoko") && password.getText().toString().equals("yangpentingcuan")) {
                    Toast.makeText(loginActivity.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),detailUser.class);
                    String usernm = username.getText().toString();
                    intent.putExtra(MESSAGE_ORDER,usernm);
                    startActivity(intent);

                } else {
                    AlertDialog.Builder loginKembali = new AlertDialog.Builder(loginActivity.this);
                    loginKembali.setTitle("LOGIN GAGAL");
                    loginKembali.setMessage("Username dan Password yang Anda masukkan salah, silahkan diisi kembali.");
                    loginKembali.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            username.setText("");
                            password.setText("");
                        }
                    });
                    loginKembali.show();


                }
            }


        });
    }}