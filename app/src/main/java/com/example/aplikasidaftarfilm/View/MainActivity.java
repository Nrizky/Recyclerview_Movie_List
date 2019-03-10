package com.example.aplikasidaftarfilm.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.aplikasidaftarfilm.Adapter.MovieAdapter;
import com.example.aplikasidaftarfilm.Model.MovieModel;
import com.example.aplikasidaftarfilm.Presenter.MoviePresenter;
import com.example.aplikasidaftarfilm.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{
    RecyclerView rvHorizontal, rvStaggered, rvGrid, rvVertical;
    MovieAdapter adapter;
    MoviePresenter presenter;

    List<MovieModel> movieModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public void onSuccess(List<MovieModel> movieModels) {
        this.movieModels.clear();
        this.movieModels.addAll(movieModels);
        this.adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        rvHorizontal = findViewById(R.id.rvH);
        rvStaggered = findViewById(R.id.rvS);
        rvGrid = findViewById(R.id.rvG);
        rvVertical = findViewById(R.id.rvV);
        switch (item.getItemId()) {
            case R.id.hotizontalItem:
                Toast.makeText(this, "Menampilakan Horizontal Layout", Toast.LENGTH_SHORT).show();
                rvHorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
                adapter = new MovieAdapter(this, movieModels);
                rvHorizontal.setAdapter(adapter);
                presenter = new MoviePresenter(this, this);
                presenter.setData();
                rvStaggered.setVisibility(View.GONE);
                rvGrid.setVisibility(View.GONE);
                rvVertical.setVisibility(View.GONE);
                rvHorizontal.setVisibility(View.VISIBLE);
                return true;

            case R.id.staggeredItem:
                Toast.makeText(this, "Menampilakan Staggered Grid Layout", Toast.LENGTH_SHORT).show();
                rvStaggered.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL));
                adapter = new MovieAdapter(this, movieModels);
                rvStaggered.setAdapter(adapter);
                presenter = new MoviePresenter(this, this);
                presenter.setData();
                rvGrid.setVisibility(View.GONE);
                rvHorizontal.setVisibility(View.GONE);
                rvVertical.setVisibility(View.GONE);
                rvStaggered.setVisibility(View.VISIBLE);
                return true;

            case R.id.gridItem:
                Toast.makeText(this, "Menampilakan Grid Layout", Toast.LENGTH_SHORT).show();
                rvGrid.setLayoutManager(new GridLayoutManager(this, 2));
                adapter = new MovieAdapter(this, movieModels);
                rvGrid.setAdapter(adapter);
                presenter = new MoviePresenter(this, this);
                presenter.setData();
                rvStaggered.setVisibility(View.GONE);
                rvHorizontal.setVisibility(View.GONE);
                rvVertical.setVisibility(View.GONE);
                rvGrid.setVisibility(View.VISIBLE);
                return true;

            case R.id.verticalItem:
                Toast.makeText(this, "Menampilakan Vertical Layout", Toast.LENGTH_SHORT).show();
                rvVertical.setLayoutManager(new LinearLayoutManager(this));
                adapter = new MovieAdapter(this, movieModels);
                rvVertical.setAdapter(adapter);
                presenter = new MoviePresenter(this, this);
                presenter.setData();
                rvStaggered.setVisibility(View.GONE);
                rvHorizontal.setVisibility(View.GONE);
                rvGrid.setVisibility(View.GONE);
                rvVertical.setVisibility(View.VISIBLE);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
