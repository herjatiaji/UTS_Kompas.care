package com.pad1.uts_kompascare;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private final ArrayList<News> news;
    private LayoutInflater inflater;

    public NewsAdapter(Context context, ArrayList<News> listBerita) {
        this.news = listBerita;
        this.inflater = LayoutInflater.from(context);

    }


    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsAdapter.ViewHolder holder, final int position) {
        final News berita = news.get(position);
        holder.judul.setText(berita.getHeadlines());
        holder.tglRilis.setText(berita.getReleaseDate().toString());
        holder.pic.setImageResource(berita.getNewspic());
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), newsPage.class);
            String judul = berita.getHeadlines();
            String tanggal = berita.getReleaseDate();
            int noImg = berita.getNewspic();
            String content = berita.getContent();
            intent.putExtra("judul", judul);
            intent.putExtra("tanggal", tanggal);
            intent.putExtra("noImg", noImg);
            intent.putExtra("content", content);
            view.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        TextView tglRilis;
        ImageView pic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.headline);
            tglRilis = itemView.findViewById(R.id.date);
            pic = itemView.findViewById(R.id.newsPic);
        }
    }
}
