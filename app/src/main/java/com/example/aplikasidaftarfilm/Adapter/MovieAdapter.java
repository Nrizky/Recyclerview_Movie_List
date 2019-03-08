package com.example.aplikasidaftarfilm.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aplikasidaftarfilm.Model.MovieModel;
import com.example.aplikasidaftarfilm.R;
import com.example.aplikasidaftarfilm.View.DetailMovieActivity;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    Context context;
    List<MovieModel> movieModels = new ArrayList<>();

    public MovieAdapter(Context context, List<MovieModel> movieModels){
        this.context = context;
        this.movieModels = movieModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_recycler, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvJudul.setText(movieModels.get(i).getMovieTitle());
        viewHolder.imageView.setImageResource(movieModels.get(i).getMoviePoster());
        viewHolder.overview.setText(movieModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMovieActivity.class);
                intent.putExtra("Title", movieModels.get(i).getMovieTitle());
                intent.putExtra("Overview", movieModels.get(i).getOverview());
                intent.putExtra("Poster", movieModels.get(i).getMoviePoster());
                context.startActivity(intent);
                Toast.makeText(context,movieModels.get(i).getMovieTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return movieModels.size();
    }
        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView tvJudul;
            ImageView imageView;
            TextView overview;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                tvJudul = itemView.findViewById(R.id.tv_movieTitle);
                imageView = itemView.findViewById(R.id.moviePoster);
                overview = itemView.findViewById(R.id.tv_overview);

        }
    }
}


