package com.example.pract5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FootballClubAdapter adapter;
    private List<FootballClub> footballClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        footballClubs = new ArrayList<>();
        footballClubs.add(new FootballClub("Манчестер Юнайтед", "Олд Траффорд", "Эрик тен Хаг", "1878"));
        footballClubs.add(new FootballClub("Бавария Мюнхен", "Альянц Арена", "Юлиан Нагельсманн", "1900"));
        footballClubs.add(new FootballClub("Ювентус", "Альянц Стэдиум", "Массимилиано Аллегри", "1897"));
        footballClubs.add(new FootballClub("Пари Сен-Жермен", "Парк де Пренс", "Луис Энрике", "1970"));
        footballClubs.add(new FootballClub("Ливерпуль", "Энфилд", "Юрген Клопп", "1892"));
        footballClubs.add(new FootballClub("Атлетико Мадрид", "Ванда Метрополитано", "Диего Симеоне", "1903"));
        footballClubs.add(new FootballClub("Интер Милан", "Сан-Сиро", "Симоне Индзаги", "1908"));
        footballClubs.add(new FootballClub("Рома", "Стадио Олимпико", "Жозе Моуринью", "1927"));
        footballClubs.add(new FootballClub("Тоттенхэм Хотспур", "Тоттенхэм Хотспур Стэдиум", "Антонио Конте", "1882"));
        footballClubs.add(new FootballClub("Боруссия Дортмунд", "Сигнал Идуна Парк", "Эдин Терзич", "1909"));

        adapter = new FootballClubAdapter(this, footballClubs);
        recyclerView.setAdapter(adapter);
    }
}