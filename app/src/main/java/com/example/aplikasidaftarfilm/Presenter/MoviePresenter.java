package com.example.aplikasidaftarfilm.Presenter;

import android.content.Context;

import com.example.aplikasidaftarfilm.Model.MovieModel;
import com.example.aplikasidaftarfilm.R;
import com.example.aplikasidaftarfilm.View.MainView;

import java.util.ArrayList;
import java.util.List;

public class MoviePresenter {
    Context context;
    List<MovieModel> movieModels = new ArrayList<>();
    MainView view;

    public MoviePresenter(MainView view, Context context) {
        this.view = view;
        this.context = context;
    }

    public void setData() {
        MovieModel movie;
        movie = new MovieModel("Spider-Man: Far From Home", R.drawable.spiderman, "Spider-Man: Far From Home adalah film superhero Amerika yang akan datang berdasarkan karakter Marvel Comics Spider-Man, diproduksi oleh Columbia Pictures dan Marvel Studios, dan didistribusikan oleh Sony Pictures Releasing. Film ini akan menjadi sekuel Spider-Man: Homecoming (2017) dan film ke dua puluh tiga di Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Jon Watts, ditulis oleh Chris McKenna dan Erik Sommers, dan dibintangi Tom Holland sebagai Peter Parker / Spider-Man, bersama Samuel L. Jackson, Zendaya, Cobie Smulders, Jon Favreau, Smoove JB, Smoove, Jacob Batalon, Martin Starr , Marisa Tomei, dan Jake Gyllenhaal. Ini mengikuti Parker dan teman-temannya saat mereka melakukan perjalanan sekolah ke Eropa.");
        movieModels.add(movie);
        movie = new MovieModel("Avengers : Endgame", R.drawable.endgame, "Avengers: Endgame adalah film superhero Amerika yang akan datang yang didasarkan pada tim superhero Marvel Comics the Avengers, diproduksi oleh Marvel Studios dan akan didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini akan menjadi sekuel langsung dari Avengers: Infinity War 2018, sekuel Marvel's The Avengers 2012 dan Avengers 2015: Age of Ultron, dan film ke-22 di Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo dengan skenario oleh Christopher Markus dan Stephen McFeely dan menampilkan aktor aktor dari film MCU sebelumnya. Dalam film tersebut, anggota Avengers yang masih hidup bekerja untuk memperbaiki kerusakan yang disebabkan oleh Thanos dalam Infinity War.");
        movieModels.add(movie);
        movie = new MovieModel("Captain Marvel", R.drawable.marvel, "Captain Marvel adalah film superhero Amerika Serikat tahun 2019 yang disutradarai oleh Anna Boden dan Ryan Fleck dan diproduseri oleh Kevin Feige. Pada tahun 1995, Carol Danvers (Brie Larson), mantan pilot Angkatan Udara Amerika Serikat, berubah menjadi salah satu pahlawan terkuat galaksi dan bergabung dengan Starforce, sebuah tim elit militer Kree, sebelum kembali ke rumahnya di Bumi dengan pertanyaan baru tentang masa lalu dan identitasnya ketika Bumi terjebak di pusat konflik galaksi antara dua dunia asing.");
        movieModels.add(movie);
        movie = new MovieModel("Spider-Man: Into the Spider-Verse", R.drawable.spiderverse, "Spider-Man: Into the Spider-Verse adalah film pahlawan super animasi komputer Amerika Serikat tahun 2018 yang diangkat dari tokoh Marvel Comics, Miles Morales / Spider-Man. Film ini mengambil latar di multisemesta bersama bernama \"Spider-Verse\" yang memiliki banyak semesta alternatif.Film ini disutradarai oleh Bob Persichetti, Peter Ramsey, dan Rodney Rothman. Naskahnya ditulis oleh Phil Lord dan Rothman. Film ini dibintangi Shameik Moore yang memerankan Morales, Jake Johnson, Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry, Lily Tomlin, Luna Lauren Velez, John Mulaney, Kimiko Glenn, Nicolas Cage, dan Liev Schreiber. Di Spider-Man: Into the Spider-Verse, Miles Morales adalah satu dari beberapa Spider-Man yang bersatu untuk menyelamatkan New York City dari Kingpin.");
        movieModels.add(movie);
        movie = new MovieModel("Avengers: Infinity War", R.drawable.infinity, "Avengers: Infinity War adalah film superhero yang berasal dari Amerika Serikat tahun 2018 beranggotakan tim superhero Avengers yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini adalah sekuel dari The Avengers dan Avengers: Age of Ultron, serta merupakan film kesembilan belas dalam Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo, dengan naskah ditulis oleh Christopher Markus & Stephen McFeely, dan menampilkan para pemeran seperti Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Paul Bettany, Elizabeth Olsen, Anthony Mackie, Sebastian Stan, Danai Gurira, Letitia Wright, Dave Bautista, Zoe Saldana, Josh Brolin, dan Chris Pratt. Dalam Avengers: Infinity War, Avengers bekerjasama dengan Guardians of the Galaxy untuk melawan Thanos, yang sedang berusaha mengumpulkan Batu Infinity.");
        movieModels.add(movie);
        movie = new MovieModel("Deadpool 2", R.drawable.deadpool, "Deadpool 2 adalah sebuah film pahlawan super Amerika yang berdasarkan pada karakter Marvel Comics Deadpool, yang didistribusikan oleh 20th Century Fox. Film tersebut merupakan installment kedua belas dalam serial film X-Men, dan sebuah sekuel dari film tahun 2016 Deadpool. Film tersebut disutradarai oleh David Leitch dari sebuah naskah karya Rhett Reese dan Paul Wernick, dengan Ryan Reynolds membintangi peran utamanya bersama dengan Morena Baccarin, T. J. Miller, Leslie Uggams, Brianna Hildebrand, Stefan Kapičić, Zazie Beetz, Josh Brolin, dan Jack Kesy.");
        movieModels.add(movie);
        movie = new MovieModel("Black Panther", R.drawable.panther, "Black Panther adalah film pahlawan super Amerika berdasarkan karakter Marvel Comics dengan nama sama. Diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures, film ini merupakan film kedelapan belas dari Marvel Cinematic Universe. Film ini disutradarai oleh Ryan Coogler yang juga bertindak sebagai penulis skenario bersama Joe Robert Cole, dan dibintangi oleh Chadwick Boseman sebagai T'Challa / Black Panther, berdampingan dengan Michael B. Jordan, Lupita Nyong'o, Danai Gurira, Martin Freeman, Daniel Kaluuya, Angela Bassett, Forest Whitaker, dan Andy Serkis. Dalam Black Panther, T'Challa kembali ke Wakanda untuk memerintah sebagai raja, namun mendapati kekuasaannya ditentang oleh seorang musuh lama dalam konflik yang memiliki konsekuensi mendunia.");
        movieModels.add(movie);

        view.onSuccess(movieModels);
    }
}
