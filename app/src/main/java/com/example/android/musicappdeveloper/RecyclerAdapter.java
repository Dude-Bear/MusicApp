package com.example.android.musicappdeveloper;

import android.content.Context;
import android.content.Intent;
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
    Context ctx;


    public RecyclerAdapter(ArrayList<Dataprovider> arrayList, Context ctx) {

        this.arrayList = arrayList;
        this.ctx = ctx;

    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view, ctx, arrayList);
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

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView artist, title;
        ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();
        Context ctx;

        public RecyclerViewHolder(View view, Context ctx, ArrayList<Dataprovider>arrayLists) {
            super(view);
            this.arrayList = arrayLists;
            this.ctx = ctx;
            view.setOnClickListener(this);
            imageView = (ImageView) view.findViewById(R.id.img);
            artist = (TextView) view.findViewById(R.id.artist);
            title = (TextView) view.findViewById(R.id.title);
        }


        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Dataprovider dataprovider = this.arrayList.get(position);
            Intent intent = new Intent(this.ctx,PlayingSong.class);
            intent.putExtra("image", dataprovider.getImg_res());
            intent.putExtra("artist", dataprovider.getArtist());
            intent.putExtra("title", dataprovider.getTitle());
            this.ctx.startActivities(new Intent[]{intent});

        }
    }
}
