package com.pad1.uts_kompascare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class newsPage extends AppCompatActivity {
    TextView judul;
    TextView tgl;
    TextView content;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_page);
        judul = findViewById(R.id.judul);
        tgl = findViewById(R.id.tanggal);
        content = findViewById(R.id.content);
        gambar = findViewById(R.id.imgview);
        Intent intent = getIntent();
        String title = intent.getStringExtra("judul");
        String tanggal = intent.getStringExtra("tanggal");
        int img = intent.getIntExtra("noImg",0);
        String isi = intent.getStringExtra("content");
        judul.setText(title);
        tgl.setText(tanggal);
        content.setText(isi);
        gambar.setImageResource(img);

    }
}