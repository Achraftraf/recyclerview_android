package com.mql.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // link with design
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // layout management
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        List<Music> m = new ArrayList<>();
        m.add(new Music("Midnight Reverie","Melancholic piano nocturnes."));
        m.add(new Music("Rhythmic Fusion","Eclectic beats blend harmoniously."));
        m.add(new Music("Serenity Falls","Nature's tranquil symphony."));
        m.add(new Music("Ethereal Horizons","Celestial ambient journey."));
        m.add(new Music("Vibrant Echoes","Energetic, uplifting rhythms."));
        m.add(new Music("Dreamscape Serenade","Sublime dreamlike harmonies."));
        m.add(new Music("Harmonic Waves","Soothing oceanic melodies."));
        m.add(new Music("Whispering Breeze","Gentle, calming acoustic tunes."));
        m.add(new Music("Enigmatic Echoes","Mystical, haunting melodies."));
        m.add(new Music("Pulse of Life","Energetic, vibrant rhythms."));

        // object of my Adapter
        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),m);
        // set mu adapter in my recyclerView
        recyclerView.setAdapter(myAdapter);

    }
}