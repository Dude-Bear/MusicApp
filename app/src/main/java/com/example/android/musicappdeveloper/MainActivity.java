package com.example.android.musicappdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerViewFavorites;
    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapterFavorites;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.LayoutManager layoutManagerFavorites;
//    String[] artist, title;
//    int[] Img_res = {R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread};
    ArrayList<Dataprovider> arrayList = new ArrayList<Dataprovider>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)(findViewById(R.id.my_recycler_view));
        recyclerViewFavorites = (RecyclerView)(findViewById(R.id.my_recycler_view_favorites));

//        artist = getResources().getStringArray(R.array.Artists);
//        title = getResources().getStringArray(R.array.Titels);

//        int i = 0;
//        for (String name : artist){
//            Dataprovider dataprovider = new Dataprovider(Img_res [i],name,artist[i]);
//            arrayList.add(dataprovider);
//            i++;
//        }

        ArrayList<Dataprovider> recommendation = new ArrayList<Dataprovider>();
        recommendation.add(new Dataprovider(R.drawable.donut, "Elvis Presley", "In the Ghetto"));
        recommendation.add(new Dataprovider(R.drawable.froyo, "Bruce Springsteen", "I'm on fire"));
        recommendation.add(new Dataprovider(R.drawable.honeycomb, "Lady Gaga", "Poker Face"));

        adapter = new RecyclerAdapter(recommendation);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        ArrayList<Dataprovider> favorites = new ArrayList<Dataprovider>();
        favorites.add(new Dataprovider(R.drawable.donut, "Tina Turner", "Proud Mary"));
        favorites.add(new Dataprovider(R.drawable.froyo, "Eric Clapton", "Layla"));
        favorites.add(new Dataprovider(R.drawable.honeycomb, "Miley Cyrus", "The Backyard Sessions"));

        adapterFavorites = new RecyclerAdapter(favorites);
        recyclerViewFavorites.setHasFixedSize(true);
        layoutManagerFavorites = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewFavorites.setLayoutManager(layoutManagerFavorites);
        recyclerViewFavorites.setAdapter(adapterFavorites);

    }
}
