package com.example.movies_app.horrorMovieList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.movies_app.Movie;
import com.example.movies_app.R;

public class HororMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horor_movie);

        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);

        button11.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Exoricist");
            movie.setSinopsys("Kehidupan fotografer Victor (Leslie Odom Jr) semula terasa sempurna. Istrinya yang cantik, Sorenne (Tracey Graves), hamil anak pertama mereka. Liburan mereka ke Haiti pada 2010 pun terasa begitu menyenangkan.\n" +
                    "\n" +
                    "Namun gempa bumi hebat terjadi. Hotel yang sedang ditempati oleh Sorenne runtuh sementara Victor tengah berada di luar bangunan. Saat berhasil menemukan Sorenne, Victor menghadapi pilihan sulit menyelamatkan satu di antara dua nyawa: istrinya atau anak mereka, Angela.\n" +
                    "\n" +
                    "13 tahun berlalu. Angela (Lidya Jewett) tumbuh sebagai remaja yang bersemangat. Meski ia kerap kali merindukan ibunya dan hanya bisa memandang dari barang peninggalan mendiang, ia memiliki Victor yang tekun merawatnya dan posesif terhadapnya.\n" +
                    "\n" +
                    "Selain itu, di sekolah, Angela memiliki sahabat bernama Katherine (Olivia Marcum). Orang tua Katherine, Miranda (Jennifer Nettles) dan Tony (Norbert Leo Butz), sangat ketat soal agama dan aktif dalam kegiatan gereja.\n" +
                    "\n" +
                    "Pada hari itu, Angela sengaja meminta izin kepada Victor untuk bisa mengerjakan tugas bersama Katherine di rumah temannya itu. Victor semula enggan memberikan izin. Namun rasa sayangnya terhadap anak perempuan piatu itu mengalahkan kekhawatirannya.\n" +
                    "\n" +
                    "Di sekolah, Angela meminta temannya dan Katherine untuk mengarang cerita bila orang tua mereka menghubungi orang tuanya karena mencari kedua remaja itu. Selepas sekolah, Angela dan Katherine sengaja masuk ke hutan untuk melakukan rencana mereka.\n" +
                    "\n" +
                    "Hingga ketika malam tiba, Victor menemukan Angela belum pulang ke rumah. Ia kemudian menghubungi orang tua Katherine. Namun Victor tidak menemukan Angela di sana, dan anaknya bersama Katherine pun tak ditemukan di rumah teman mereka.\n" +
                    "\n" +
                    "Teman sekolah mereka mengatakan kepada Victor, Tony, dan Miranda, bahwa ia melihat Katherine dan Angela masuk ke hutan selepas pulang sekolah.\n" +
                    "\n" +
                    "Ketiganya pun mencari Katherine dan Angela ke hutan samping sekolah. Polisi pun dihubungi dan pencarian dilakukan dengan banyak personel. Namun mereka hanya menemukan barang-barang kedua anak tersebut, tanpa ada jejak di mana mereka berada.");
            movie.setDirector("William Friedkin");
            movie.setBudget("90,3 Juta USD");
            movie.setNomination("-");
            movie.setDistribution("");
            movie.setDate("28 Agustus 1973");

            Intent intent = new Intent(this, Exorcist.class);
            intent.putExtra(Exorcist.keyObj, movie);
            startActivity(intent);
        });

        button12.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Friday The 13th ");
            movie.setSinopsys("\n" +
                    "Film pertama Friday the 13th berawal dengan latar waktu 1958, ketika sekelompok remaja tengah berkemah di Camp Crystal Lake. Ternyata, seorang anak kecil tenggelam di danau dekat tempat kemping tersebut satu tahun sebelumnya.\n" +
                    "\n" +
                    "Berniat untuk bersenang-senang, mereka tak menyadari ancaman besar yang sudah di depan mata. Ancaman pertama dihadapi Barry (Willie Adams) dan Claudette (Debra S. Hayes).\n" +
                    "\n" +
                    "Mereka memisahkan diri dari teman-temannya yang sedang berkumpul di api unggun. Keduanya pergi ke sebuah kabin. Ketika di kabin, keduanya malah bertemu seorang pembunuh yang menghabiskan nyawa mereka berdua.\n" +
                    "\n" +
                    "Film berlanjut ke Jumat, 13 Juni 1980. Annie Phillips (Robbi Morgan) memasuki tempat makan kecil dan menanyakan arah ke Camp Crystal Lake. Orang-orang di rumah makan itu bingung dan ketakutan.\n" +
                    "\n" +
                    "Enos (Rex Everhart), seorang sopir tempat makan itu, setuju untuk memberikannya tumpangan karena kebetulan akan melewati lokasi itu. Namun, ia memperingatkan Annie tentang keanehan-keanehan di tempat tersebut.\n" +
                    "\n" +
                    "Ia menceritakan banyak kisah, mulai dari seorang anak lelaki tenggelam di Crystal Lake di 1957, kemudian pembunuhan dua orang yang terjadi setahun setelahnya, hingga kebakaran dan air beracun.\n" +
                    "\n" +
                    "Setelah turun dari mobil itu, Enos mendapatkan tumpangan lagi dari seseorang yang tak begitu jelas terlihat dan berujung menghabisi nyawanya.\n" +
                    "\n" +
                    "Sementara itu, di tempat kamping, beberapa anak muda, yakni Ned (Mark Nelson), Jack (Kevin Bacon), Bill (Harry Crosby), Marcie (Jeannine Taylor), Brenda (Laurie Bartram), dan Alice (Adrienne King) tengah merenovasi fasilitas di sana bersama sang pemilik, Steve Christy (Peter Brouwer).\n" +
                    "\n" +
                    "Ketika malam tiba, mereka satu per satu mulai menghadapi ancaman menyeramkan, sama seperti yang terjadi bertahun-tahun yang lalu.\n" +
                    "\n" +
                    "Hingga akhirnya, Alice bertemu dengan Mrs. Voorhees (Betsy Palmer) yang mengaku bahwa ia adalah ibu dari Jason Voorhees, anak yang tenggelam pada 1957.\n" +
                    "\n" +
                    "Pertemuan tersebut menjadi kunci dari misteri banyak nyawa yang hilang di Camp Crystal Lake selama beberapa dekade. Tak hanya itu, Alice juga mengetahui fakta mengejutkan lainnya yang bisa membahayakan nyawanya.");
            movie.setDirector("Marcus Nispel");
            movie.setBudget("$19 juta");
            movie.setNomination("-");
            movie.setDistribution("Warner Bros. Pictures (United States and Canada)[1]\n" +
                    "Paramount Pictures (Other territories)");
            movie.setDate("9 Februari 2009");

            Intent intent = new Intent(this, Friday.class);
            intent.putExtra(Friday.keyObj, movie);
            startActivity(intent);
        });

        button13.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Rings");
            movie.setSinopsys("The Ring mengawali kisah dari Rachel Keller (Naomi Watts). Sebelumnya ia sempat menonton sebuah rekaman video horor yang menyeramkan.\n" +
                    "\n" +
                    "Awalnya Rachel mengira video tersebut hanya rekaman biasa, namun siapa sangka bahwa setelah menonton itu mulai muncul kejadian-kejadian aneh dalam kesehariannya.\n" +
                    "\n" +
                    "Kejadian ganjil pertama adalah kematian Katie (Amber Tamblyn) yaitu keponakan Rachel yang tewas secara misterius. Tewasnya Katie ini berlangsung selang 7 hari dari waktu Rachel selesai menonton rekaman video horor.\n" +
                    "\n" +
                    "Dalam sinopsis The Ring dikisahkan bahwa selain Katie, beberapa teman Rachel lain pun ada yang secara tiba-tiba meninggal setelah menonton video yang sama dengannya.\n" +
                    "\n" +
                    "Yang lebih menakutkan adalah kematian teman-temannya itu berlangsung secara bersamaan bahkan tanpa sebab-sebab yang jelas.\n" +
                    "\n" +
                    "Rachel sendiri dibuat bingung dan ketakutan sehingga ia berniat mengusut tuntas apa yang sebenarnya terjadi dengan melakukan serangkaian investigasi.\n" +
                    "\n" +
                    "Video horor tersebut menampilkan beberapa rekaman menyeramkan dan mengerikan. Tapi dari sana Rachel memutuskan pergi ke Shelter Mountain Inn untuk mencari petunjuk.\n" +
                    "\n" +
                    "Setelah 7 hari berlalu, tiba saatnya Rachel yang merasakan sendiri teror menyeramkan. Bermula dari sebuah panggilan telepon misterius yang memberitahu bahwa ajal kematiannya akan tiba 7 hari lagi.\n" +
                    "\n" +
                    "Parahnya, Aidan (David Dorfman) yaitu putra Rachel secara tidak sengaja juga menonton video tersebut dan langsung mengalami kejadian ganjil.\n" +
                    "\n" +
                    "Serangkaian teror menyeramkan kini terus mengikuti keseharian Rachel. Terlebih ia diancam bahwa nyawanya dalam bahaya karena sebentar lagi dirinya bisa segera mati.");
            movie.setDirector("F. Javier Gutiérrez");
            movie.setBudget("40 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("1 Februari 2017");

            Intent intent = new Intent(this, Rings.class);
            intent.putExtra(Rings.keyObj, movie);
            startActivity(intent);
        });

        button14.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Paranormal Activity");
            movie.setSinopsys("Pasangan muda, Katie dan Micah, pindah ke rumah baru dan Micah merekam aktivitas mereka di kamera videonya. Setelah kejadian aneh di malam hari, Katie mengakui saat masih kecil, dia pernah mengalami kehadiran hantu di kamarnya. Dia merasakan dan sekarang khawatir itu mungkin telah mengikutinya ke tempat baru mereka. Micah skeptis dan memasang kameranya di kamar mereka untuk merekam aktivitas semalam. Setelah beberapa hari, mereka melihat pintu kamar tidur mereka bergerak dan jelas ada kehadiran di rumah mereka. Dan itu semakin memburuk.");
            movie.setDirector("Oren Peli, Gregory Plotkin, William Eubank, Ariel Schulman, Tod Williams, Henry Joost, Christopher B. Landon");
            movie.setBudget("50 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("23 Maret 20007");

            Intent intent = new Intent(this, Paranormal.class);
            intent.putExtra(Paranormal.keyObj, movie);
            startActivity(intent);
        });

        button15.setOnClickListener(click -> {
            Movie movie = new Movie();
            movie.setName("Insidious");
            movie.setSinopsys("Seorang guru Josh Lambert (Patrick Wilson) dan istrinya Renai (Rose Byrne) pindah bersama ketiga anak mereka, Dalton (Ty Simpkins), Foster (Andrew Astor), dan bayinya Cali, ke sebuah rumah besar. Ketika Dalton menjelajahi loteng, dia jatuh dari tangga dan kepalanya terbentur lantai. Keesokan paginya, Dalton tidak bangun dan tetap koma, tetapi dokter tidak dapat mendiagnosis masalahnya.\n" +
                    "\n" +
                    "Tiga bulan kemudian, hal-hal aneh terjadi di dalam rumah dan Renai melihat penampakan. Dia yakin rumah itu berhantu dan meyakinkan Josh untuk pindah ke rumah lain. Renai semakin sering melihat hantu di rumah baru itu, tetapi Josh tidak percaya pada istrinya. Namun ibunya, Lorraine Lambert (Barbara Hershey), justru mengatakan kepadanya bahwa dia juga mendapat penglihatan tentang iblis di kamar Dalton.\n" +
                    "\n" +
                    "Mereka lalu mengundang medium dan teman lama Lorraine, Elise Rainier (Lin Shaye), yang membawa tim Spek pemburu hantu dan Tucker (Angus Sampson) untuk menyelidiki fenomena supernatural tersebut. Elise menjelaskan bahwa Dalton adalah seorang musafir dengan kemampuan meninggalkan tubuh fisiknya dan melakukan perjalanan dalam proyeksi astral. Sekarang tubuh spiritualnya hilang di tempat yang dinamakan The More yang bukan untuk makhluk hidup, di sana para entitas berkumpul mencoba masuk ke dalam tubuh fisik Dalton yang kosong. Di antara entitas ini, ada iblis yang membutuhkan tubuh Dalton untuk menyebabkan rasa sakit bagi yang lain.\n" +
                    "\n" +
                    "Lebih lanjut, Lorraine mengungkapkan bahwa Josh juga seorang musafir berbakat dan harus mencari Dalton di alam The More serta membawanya kembali.");
            movie.setDirector("James Wan");
            movie.setBudget("1.5 juta USD");
            movie.setNomination("-");
            movie.setDistribution("-");
            movie.setDate("14 September 2010");

            Intent intent = new Intent(this, Insidious.class);
            intent.putExtra(Insidious.keyObj, movie);
            startActivity(intent);
        });
    }
}