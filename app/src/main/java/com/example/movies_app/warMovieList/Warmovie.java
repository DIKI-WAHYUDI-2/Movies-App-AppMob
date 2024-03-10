package com.example.movies_app.warMovieList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.movies_app.Movie;
import com.example.movies_app.R;
import com.example.movies_app.warMovieList.Dunkirk;
import com.example.movies_app.warMovieList.Greyhound;
import com.example.movies_app.warMovieList.HacksawRidge;
import com.example.movies_app.warMovieList.Midway;
import com.example.movies_app.warMovieList.WesternFront;

public class Warmovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmovie);

        Button button = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        button.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("GREYHOUND");
            movie.setSinopsys("Sinopsis: Greyhound mengambil latar saat Perang Dunia II. Kisahnya diadaptasi dari novel berjudul The Good Shepherd karya C. S. Foster yang dirilis pada 1955 silam.\n" +
                    "\n" +
                    "Cerita berawal saat komandan kapal perang Angkatan Laut, Kapten Ernest Krause (Tom Hanks), ditugaskan memimpin 37 kapal sekutu melewati Atlantik Utara. Konvoi yang dipimpin Kapten Krause akhirnya memasuki kawasan perbatasan. Sayangnya, kawasan tersebut lepas dari perlindungan udara Amerika.\n" +
                    "\n" +
                    "Di situlah deretan kapal sekutu yang dipimpin Kapten Krause disergap kapal selam U-boat dari Angkatan Laut Jerman. Ganasnya lautan sering menyulitkan kapal Kapten Krause. Sebaliknya, pergerakan kapal selam Jerman jadi lebih gesit dan keberadaan mereka sulit dideteksi.\n" +
                    "\n" +
                    "Meski begitu, Kapten Krause berhasil mengamankan posisi di atas kapal selam Jerman dan meluncurkan tembakan. Pertempuran sengit pun terjadi di perairan tersebut. Kapten Krause harus bertahan menghalau pasukan Nazi yang terus berdatangan dengan jumlah semakin banyak.");
            movie.setDirector("Aaron Schneider");
            movie.setBudget("50,3 Juta USD");
            movie.setNomination("Academy Award untuk penata suara terbaik");
            movie.setDistribution("Apple TV+, Sony Pictures");
            movie.setDate("10 Juli 2020");

            Intent intent = new Intent(this, Greyhound.class);
            intent.putExtra(Greyhound.keyObj, movie);
            startActivity(intent);
        });

        button2.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Dunkirk");
            movie.setSinopsys("Film ini menghadirkan sudut pandang dari tiga perspektif yang berbeda: The Mole (darat), The Sea (laut), dan The Air (udara), dengan rentang waktu masing-masing satu minggu, satu hari, dan satu jam. Dalam sudut pandang darat, kita mengikuti perjuangan Tommy, seorang tentara Inggris, untuk bertahan hidup dan mencari evakuasi. Dia bergabung dengan dua tentara lainnya, Gibson dan Alex, untuk menemukan cara keluar dari situasi yang mencekam.\n" +
                    "\n" +
                    "Sementara itu, sudut pandang laut menceritakan tentang Dawson, seorang marinir, yang bersama anaknya Peter, berlayar menggunakan kapal pribadinya untuk menyelamatkan para tentara. Mereka membutuhkan satu hari untuk mencapai Dunkirk dan melakukan penyelamatan.\n" +
                    "\n" +
                    "Di sudut pandang udara, pilot RAF Farrier dan Collins terlibat dalam pertempuran udara melawan pesawat musuh. Meskipun terpisah karena Farrier dilumpuhkan, mereka berjuang sendiri untuk mengalahkan musuh dalam satu jam pertempuran.\n" +
                    "\n" +
                    "Pada akhirnya, cerita dari ketiga sudut pandang ini saling terhubung ketika para pemeran dari sudut pandang yang berbeda bertemu di laut, di mana usaha penyelamatan mencapai puncaknya.\n" +
                    "\n" +
                    "Film ini dikenal karena penyutradaraannya yang brilian oleh Christopher Nolan, sinematografinya yang spektakuler, dan penggunaan suara yang intens. Selain itu, penampilan para pemainnya, termasuk Tom Hardy dan aktor baru Fionn Whitehead serta Harry Styles dari One Direction, juga mendapat banyak pujian.\n" +
                    "\n" +
                    "\"Dunkirk\" merupakan film produksi dari empat negara, yakni Inggris, Amerika, Belanda, dan Perancis, dan berhasil masuk dalam beberapa nominasi penghargaan di berbagai ajang perfilman.");
            movie.setDirector("Christopher Nolan");
            movie.setBudget("$100 juta");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("20 Juli 2017");

            Intent intent = new Intent(this, Dunkirk.class);
            intent.putExtra(Dunkirk.keyObj, movie);
            startActivity(intent);
        });

        button4.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Midway");
            movie.setSinopsys("Film dimulai dengan serangan Jepang terhadap Pangkalan Angkatan Laut Amerika Serikat di Pearl Harbor pada 7 Desember 1941. Setelah serangan mematikan ini, Amerika Serikat bersiap untuk membalas dendam. Kita mengikuti kisah beberapa tokoh kunci, termasuk Dick Best (diperankan oleh Ed Skrein), seorang penerbang tempur yang pemberani, dan Edwin Layton (diperankan oleh Patrick Wilson), seorang perwira intelijen Angkatan Laut.\n" +
                    "\n" +
                    "Pertempuran Midway menjadi puncak dari balas dendam Amerika Serikat. Intelijen Amerika Serikat, yang dipimpin oleh Layton, berhasil memecahkan kode Jepang, memberikan keuntungan taktis yang besar kepada pasukan Amerika Serikat. Sementara itu, Dick Best dan para penerbang tempur lainnya bersiap untuk menghadapi armada udara Jepang yang kuat.\n" +
                    "\n" +
                    "\n" +
                    "Pertempuran epik ini melibatkan serangkaian serangan udara dan laut yang dramatis dan penuh tekanan. Kedua belah pihak mengalami kerugian besar, tetapi akhirnya Amerika Serikat keluar sebagai pemenang. Kemenangan ini membalikkan keadaan di Pasifik dan menjadi titik balik penting dalam Perang Dunia II.\n" +
                    "\n" +
                    "“Midway” tidak hanya menggambarkan pertempuran itu sendiri, tetapi juga menyoroti tekad, keberanian, dan pengorbanan para prajurit yang terlibat dalam konflik ini. Dengan efek khusus yang mengesankan dan skala produksi yang besar, film ini memberikan penghormatan kepada sejarah heroik Pertempuran Midway dan mereka yang terlibat dalam memenangkannya.");
            movie.setDirector("Roland Emmerich");
            movie.setBudget("100 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("8 November 2019");

            Intent intent = new Intent(this, Midway.class);
            intent.putExtra(Midway.keyObj, movie);
            startActivity(intent);
        });

        button3.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Hacksaw Ridge");
            movie.setSinopsys("Film Hacksaw Ridge diangkat berdasarkan kejadian nyata pengalaman Perang Dunia II dari Desmond Doss , seorang petugas medis perang pasifik Amerika yang menolak untuk membawa atau menggunakan senjata atau senjata api dalam bentuk apapun selama Pertempuran Okinawa.\n" +
                    "\n" +
                    "Desmond T. Doss adalah seorang dokter tentara Amerika Serikat yang menolak membawa satu pun senjata dalam pertempuran Okinawa di era Perang Dunia II. Desmond berhasil mengevakuasi 75 orang tentara sendirian, tanpa satu pun peluru ia tembakkan.\n" +
                    "\n" +
                    "Keyakinan Desmond untuk tidak membawa senjata diawali dari pengalamannya pada tahun 1925 di Lynchburg, Virginia, Amerika Serikat, Desmond Doss (Andrew Garfield) muda hampir membunuh saudaranya saat melakukan kekerasan. Akibat peristiwa itu, dan pendidikannya di Geraja Masehi Advent Hari Ketujuh, memperkuat keyakinan Desmond untuk tidak mau membunuh siapapun.\n" +
                    "\n" +
                    "Lima belas tahun kemudian, Doss membawa seorang pria yang terluka ke rumah sakit dan bertemu dengan seorang perawat bernama Dorothy Schutte (Teresa Palmer). Mereka menjalin hubungan asmara, dan Doss memberi tahu Dorothy tentang minatnya pada pekerjaan medis." +
                    "Setelah serangan Jepang di Pearl Harbor, Doss mendaftar di Angkatan Darat AS untuk bertugas sebagai tenaga medis tempur . Ayahnya, Tom (Hugo Weaving), seorang veteran Perang Besar, sangat kecewa dengan keputusan tersebut. Sebelum berangkat ke Fort Jackson, Desmond meminta Dorothy untuk menikah, dan dia menerimanya.\n" +
                    "\n" +
                    "Karena hal itu, Howell dan Kapten Glover (Sam Worthington) berusaha membawa Doss ke psikiater, tetapi ditolak. Sebab keyakinan agama Doss bukan merupakan penyakit mental .\n" +
                    "\n" +
                    "\n" +
                    "Mereka kemudian menyiksa Doss dengan membuatnya melalui kerja yang melelahkan, berniat untuk membuat Doss pergi atas kemauannya sendiri. Namun, keyakinan Doss tidak runtuh. Film Hacksaw Ridge digarap oleh sutradara Mel Gibson, dan dibintangi oleh Andrew Garfield, Sam Worthington , Luke Bracey, Teresa Palmer, Hugo Weaving, Rachel Griffiths, dan Vince Vaughn.");
            movie.setDirector("Mel Gibson");
            movie.setBudget("100 juta USD");
            movie.setNomination("Academy Award untuk Aktor Terbaik");
            movie.setDistribution("-");
            movie.setDate("4 November 2016");

            Intent intent = new Intent(this, HacksawRidge.class);
            intent.putExtra(HacksawRidge.keyObj, movie);
            startActivity(intent);
        });

        button5.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("All Quiet On The Western Front");
            movie.setSinopsys("Menceritakan tentang kelamnya kehidupan di parit saat perang, yang dirasakan oleh Paul, saat bertugas di Front Barat di Perang Dunia I.\n" +
                    "\n" +
                    "Gambaran akan perjuangan dan semangat patriotik sirna saat Paul benar-benar berhadapan dengan kenyataan hidup yang brutal di garis depan.\n" +
                    "\n" +
                    "Paul bersama dua orang temannya, Albert dan Muller, secara sukarela mendaftar sebagai tentara Jerman atas bimbingan gurunya yang menghidupkan semangat bela tanah air dalam diri mereka.\n" +
                    "\n" +
                    "Pandangan Paul akan musuh, siapa yang benar, dan siapa yang salah dalam konflik itu langsung runtuh.\n" +
                    "\n" +
                    "Meski tak mendapat banyak latihan, persenjataan yang minim, dan seragam bekas pakai, Paul harus bertahan hidup sampai perang berakhir.\n" +
                    "\n" +
                    "Mengandalkan nasihat dari seorang veteran yang lebih tua, mencegah Paul masuk dalam hitungan korban perang.\n" +
                    "\n" +
                    "Tapi, akankah Paul benar-benar dapat melihat perang berakhir?");
            movie.setDirector("Edward Berger");
            movie.setBudget("120 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("29 September 2022");

            Intent intent = new Intent(this, WesternFront.class);
            intent.putExtra(WesternFront.keyObj, movie);
            startActivity(intent);
        });
    }
}