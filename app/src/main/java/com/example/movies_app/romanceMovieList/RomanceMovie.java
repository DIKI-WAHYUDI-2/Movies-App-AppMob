package com.example.movies_app.romanceMovieList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.movies_app.Movie;
import com.example.movies_app.R;
import com.example.movies_app.romanceMovieList.BeWithYou;
import com.example.movies_app.romanceMovieList.DearNathan;
import com.example.movies_app.romanceMovieList.Ditto;
import com.example.movies_app.romanceMovieList.LaLaLand;
import com.example.movies_app.romanceMovieList.TuneInForLove;
import com.example.movies_app.warMovieList.Dunkirk;
import com.example.movies_app.warMovieList.Greyhound;
import com.example.movies_app.warMovieList.HacksawRidge;
import com.example.movies_app.warMovieList.Midway;
import com.example.movies_app.warMovieList.WesternFront;

public class RomanceMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romance_movie);

        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);

        button6.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Tune In For Love");
            movie.setSinopsys("\"Tune In For Love\" mengisahkan kisah cinta dua anak muda, Mi Soo (Kim Go Eun) dan Hyun Woo (Jung Hae In), yang terpaksa putus-nyambung karena keadaan. Awalnya, mereka bertemu di toko kue warisan ibu Mi Soo dan menjadi akrab karena keduanya yatim piatu. Namun, krisis ekonomi membuat toko kue Mi Soo harus ditutup, memaksa mereka berpisah. Beberapa tahun kemudian, Mi Soo telah menjadi penyiar radio dan menemui kembali Hyun Woo di toko kue lamanya. Mereka kembali dekat, tetapi harus berpisah lagi karena Hyun Woo harus menjalani wajib militer. Setelah dua tahun, Hyun Woo mencoba mengontak Mi Soo melalui email untuk memulai kembali hubungan mereka. Namun, pertanyaan tentang masa lalu Hyun Woo yang membuatnya pernah dipenjara tetap menjadi misteri. Bisakah kisah cinta mereka berlanjut kali ini?");
            movie.setDirector("Jung Ji-woo");
            movie.setBudget("70,3 Juta USD");
            movie.setNomination("-");
            movie.setDistribution("");
            movie.setDate("28 Agustus 2019");

            Intent intent = new Intent(this, TuneInForLove.class);
            intent.putExtra(TuneInForLove.keyObj, movie);
            startActivity(intent);
        });

        button7.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Be With You");
            movie.setSinopsys("Drama ini mengisahkan keluarga yang dulunya bahagia dengan Soo Ah, Woo Jin, dan putra mereka Ji Hoo. Setelah kematian Soo Ah, Woo Jin, sebagai orang tua tunggal, berjuang mengisi kekosongan itu. Ji Hoo, yang tidak menerima kepergian ibunya, percaya bahwa ibunya akan kembali sebagai ibu penguin saat musim hujan tiba. Meski Ayahnya berusaha meyakinkannya, Ji Hoo tetap menantikan kedatangan ibunya.\n" +
                    "\n" +
                    "Dalam perjalanan pulang, mereka menemukan seorang perempuan yang mirip Soo Ah pingsan di sebuah terowongan. Ji Hoo yakin itu ibunya kembali. Woo Jin membawa pulang perempuan itu yang mengalami amnesia, berharap bahwa kebahagiaan keluarganya akan kembali bersamanya. Ji Hoo senang, tapi Woo Jin merasa takut karena meragukan identitas perempuan itu.\n" +
                    "\n" +
                    "Meski berbagai hal aneh terjadi, termasuk kehilangan ingatan tentang keluarga dan pernikahan, perempuan itu tetap bersama Woo Jin untuk mengembalikan kebahagiaan keluarganya.");
            movie.setDirector("Lee Jang-hoon");
            movie.setBudget("$90 juta");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("14 Maret 2018");

            Intent intent = new Intent(this, BeWithYou.class);
            intent.putExtra(BeWithYou.keyObj, movie);
            startActivity(intent);
        });

        button8.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("La La Land");
            movie.setSinopsys("Berlatar di kemegahan Los Angeles yang penuh kemacetan, Mia (Emma Stone), seorang barista dengan ambisi menjadi artis terkenal, tanpa sengaja bertemu dengan Sebastian (Ryan Gosling). Pertemuan mereka tidak menyenangkan bagi Mia karena Sebastian mengganggunya saat berkendara.\n" +
                    "\n" +
                    "Sebastian, seorang pianis jazz terkenal yang mengalami kesulitan finansial, sedang berselisih dengan adiknya, Laura (Rosemarie DeWitt). Suatu malam, ia tampil di sebuah restoran, tetapi diminta untuk tidak memainkan musik jazz oleh pemilik restoran, Bill (J.K Simmons).\n" +
                    "\n" +
                    "Mia, terpukau dengan penampilan Sebastian, ingin memuji namun malah mendapat perlakuan buruk karena Sebastian kesal atas pemecatan dirinya. Setelah dipecat, Sebastian bermimpi membuka klub jazz.\n" +
                    "\n" +
                    "Tak disangka, Mia dan Sebastian bertemu lagi di klub jazz itu. Meskipun punya mimpi yang sama, mereka menyadari bahwa mengejarnya tidak mudah.");
            movie.setDirector("");
            movie.setBudget("150 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("9 Desember 2016");

            Intent intent = new Intent(this, LaLaLand.class);
            intent.putExtra(LaLaLand.keyObj, movie);
            startActivity(intent);
        });

        button9.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Dear Nathan");
            movie.setSinopsys("Cerita dimulai dengan kedatangan Salma (Amanda Rawles) ke SMA Garuda, di mana ia terlambat pada hari pertamanya dan bertemu dengan Nathan (Jefri Nichol), seorang siswa berandalan.\n" +
                    "\n" +
                    "Awalnya, Salma mencoba menjauhi Nathan karena ia selektif dalam memilih teman. Namun, Nathan justru menunjukkan ketertarikannya pada Salma dan berusaha untuk mendekatinya.\n" +
                    "\n" +
                    "Salma mulai melunak saat melihat sisi baik Nathan. Meskipun kepribadian mereka bertolak belakang, Salma jatuh cinta pada Nathan.\n" +
                    "\n" +
                    "Dengan perjuangan, Salma berusaha mengubah Nathan menjadi lebih baik, dan Nathan juga bertekad untuk memperbaiki perilakunya demi Salma. Namun, hubungan mereka dihadapkan pada banyak rintangan, termasuk masalah Nathan dengan keluarganya dan kehadiran mantan Nathan, Aurora.\n" +
                    "\n" +
                    "Kisah cinta mereka menjadi semakin rumit. Bagaimana kelanjutan hubungan mereka akan berakhir?");
            movie.setDirector("Indra Gunawan");
            movie.setBudget("50 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("23 Maret 2017");

            Intent intent = new Intent(this, DearNathan.class);
            intent.putExtra(DearNathan.keyObj, movie);
            startActivity(intent);
        });

        button10.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Ditto");
            movie.setSinopsys("Kim Yong, seorang mahasiswa senior jurusan teknik mesin tahun 1999, dan Kim Mu Nee, mahasiswi jurusan sosiologi tahun 2022, secara kebetulan bisa berkomunikasi melalui sebuah walkie talkie. Percakapan malam hari mereka membuat mereka menjadi sahabat yang akrab. Tanpa disadari, mereka menjadi mak comblang satu sama lain dalam urusan percintaan.\n" +
                    "\n" +
                    "Kim Yong menceritakan tentang gadis yang ditaksirnya, Seo Han Sol, kepada Kim Mu Nee, dan mendapatkan saran darinya untuk mendekati Han Sol. Sebaliknya, Kim Mu Nee juga mengungkapkan perasaannya terhadap sahabatnya, Oh Young Ji, kepada Kim Yong, yang juga memberikan saran agar Mu Nee menyatakan perasaannya kepada Young Ji.\n" +
                    "\n" +
                    "Premis persahabatan lintas zaman ini sederhana namun menggemaskan. Hangatnya persahabatan dan gejolak cinta masa muda mereka dapat disaksikan dalam drama ini mulai tanggal 16 November 2022, dengan Yeo Jin Go, Cho Yi Hyun, Kim Hye Yoon, dan Na In Woo sebagai pemeran utama.");
            movie.setDirector("Edward Berger");
            movie.setBudget("70 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("16 November 2022");

            Intent intent = new Intent(this, Ditto.class);
            intent.putExtra(Ditto.keyObj, movie);
            startActivity(intent);
        });
    }
}