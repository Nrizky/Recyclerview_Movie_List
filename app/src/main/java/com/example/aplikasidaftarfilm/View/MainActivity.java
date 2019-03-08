package com.example.aplikasidaftarfilm.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aplikasidaftarfilm.Adapter.MovieAdapter;
import com.example.aplikasidaftarfilm.Model.MovieModel;
import com.example.aplikasidaftarfilm.Presenter.MoviePresenter;
import com.example.aplikasidaftarfilm.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView recyclerView;
    MovieAdapter adapter;
    MoviePresenter presenter;
    List<MovieModel> movieModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MovieAdapter(this,movieModels);
        recyclerView.setAdapter(adapter);
        presenter = new MoviePresenter(this,this);
        presenter.setData();
    }


    @Override
    public void onSuccess(List<MovieModel> movieModels) {
        this.movieModels.clear();
        this.movieModels.addAll(movieModels);
        this.adapter.notifyDataSetChanged();
    }
}
