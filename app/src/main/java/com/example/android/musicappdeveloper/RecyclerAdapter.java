package com.example.android.musicappdeveloper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bjoer on 08.03.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();


    public RecyclerAdapter (ArrayList<Dataprovider>arrayList){

        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        Dataprovider dataprovider = arrayList.get(position);
        holder.imageView.setImageResource(dataprovider.getImg_res());
        holder.artist.setText(dataprovider.getArtist());
        holder.title.setText(dataprovider.getTitle());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView artist, title;

        public RecyclerViewHolder(View view) {
            super(view);
            imageView = (ImageView) view.findViewById(R.id.img);
            artist = (TextView) view.findViewById(R.id.artist);
            title = (TextView) view.findViewById(R.id.title);
        }



    }
}
