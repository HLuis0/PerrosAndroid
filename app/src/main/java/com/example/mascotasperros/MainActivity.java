package com.example.mascotasperros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListaElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListaElement(R.drawable.perro1));
        elements.add(new ListaElement(R.drawable.perro2));
        elements.add(new ListaElement(R.drawable.perro3));

        ListaAdapter listaAdapter = new ListaAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.lista);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listaAdapter);
    }
}