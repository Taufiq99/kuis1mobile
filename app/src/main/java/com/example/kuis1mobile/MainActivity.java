package com.example.kuis1mobile;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ChatAdapter adapter;
    private ArrayList<Chat> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new ChatAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Chat("M. Taufiq Rahmatullah", "Saya / Anak Ketiga","Jl. Jend Sudirman, Komp. Haur Kuning Permai Blok K/1" , R.drawable.taufiq));
        mahasiswaArrayList.add(new Chat("Suwadi", "Ayah", "Jl. Jend Sudirman, Komp. Haur Kuning Permai Blok K/1" , R.drawable.ayah));
        mahasiswaArrayList.add(new Chat("Titut Munjiyati", "Ibu", "Jl. Jend Sudirman, Komp. Haur Kuning Permai Blok K/1" , R.drawable.ibu));
        mahasiswaArrayList.add(new Chat("Syarifah Hidayatullaili", "Anak Pertama / Kakak ke 1", "Jl. Jend Sudirman, Komp. Haur Kuning Permai Blok K/1" , R.drawable.mba));
        mahasiswaArrayList.add(new Chat("M. Syarif Hidayatullah", "Anak Kedua / Kakak ke 2", "Jl. Jend Sudirman, Komp. Haur Kuning Permai Blok K/1" , R.drawable.mas));
    }
}

