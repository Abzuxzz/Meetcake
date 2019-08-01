package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuCake extends AppCompatActivity {
    private String[] namacake = {
            "Black Forest"
            ,"Cheesecake"
            ,"Dorayaki"
            ,"Kaiserschmarrn"
            ,"Kransekake"
            ,"Lamington"
            ,"Lapis Legit"
            ,"Ma Lai Go"
            ,"Tiramisu"
            ,"Victoria Sponge"
    };

    private  Integer[] gambarcake = {
            R.drawable.blackforest
            ,R.drawable.cheesecake
            ,R.drawable.dorayaki
            ,R.drawable.kaiserschmarrn
            ,R.drawable.kransekage
            ,R.drawable.lamington
            ,R.drawable.lapislegit
            ,R.drawable.malaigo
            ,R.drawable.tiramisu
            ,R.drawable.victoriasponge
    };

    private  String[] asalcake = {
            "Jerman"
            ,"Amerika Serikat"
            ,"Jepang"
            ,"Austria"
            ,"Denmark/Norwegia"
            ,"Australia"
            ,"Indonesia"
            ,"Hongkong"
            ,"Italia"
            ,"Inggris Raya"
    };

    private String[] deskCake = {
            "Mendengar namanya mungkin orang berpikir bahwa kue yang satu ini berasal dari Inggris atau Amerika, namun ternyata nama ini adalah nama lain dari Schwarzwalder Kirschtorte yang berasal dari Jerman.\n" +
                    " Nama tersebut berasal dari nama sebuah liquor di daerah pegunungan Barat Laut di Jerman yang dibuat dari hasil suling buah Ceri.\n" +
                    " Itu sebabnya Black Forest dengan cita rasa asli umumnya mengandung alkohol.\n" +
                    " Kue ini terdiri dari beberapa lapis kue bolu cokela dan dilapisi dengan krim gula."

            ,"Amerika mungkin dikenal sebagai surganya kue penutup makan. Namun sampai saat ini Cheesecake yang dianggap paling enak dan memiliki nilai historis.\n" +
            " Cheesecake dahulu hanya merupakan gumpalan keju manis yang sudah ada sejak Yunani Kuno. \n" +
            "Namun saat ini yang populer adalah kue keju dingin yang baru ada semenjak munculnya krim keju pada tahun 1872 di Amerika Serikat. Sejak saat itu cheesecake menjadi jadi sangat populer."

            ,"Pada mulanya, kue ini hanya kudapan sederhana di Jeoang.\n" +
            " Namun dorayaki kemudian sangat populer di Jepang akibat karakter anime bernama Doraemon, seekor kucing robot, amat menggemari kue ini.\n" +
            " Dorayaki sebenarnya adalah kue bolu yang berbentuk bulat yang didalamnya berisi pasta kacang merah yang rasanya manis."

            ,"Kisah dari kue ini cukup unik sebab penamaannya didasarkan dari kue kesukaan Kaisar Konfederasi Jerman. Kaisar bernama Franz Joseph I dari Austria diceritakan sangat menyukai fluffy pancake.\n" +
            " Namun, sang kaisar lebih suka memakannya dalam keadaan terpotong-potong kecil dengan saus buah kue manis itulah yang disebut sebagai Kaiserschmarrn."

            ,"Kue yang umum disajikan saat pesta-pesta spesial seperti pernikahan atau perayaan tahun baru di Denmark dan Norwegia ini terkenal dengan penampilannya yang menarik. Terdiri dari beberapa tingkat, kue ini menjulang tinggi seperti menara.\n" +
            " Biasanya kue ini dibuat dari adonan telur, gula dan almond.\n"

            ,"Lamington adalah ikon kue nasional Australia.\n" +
            " Kue bolu yang namanya diambil dari Lord Lamington yang menjadi Gubernur Queensland pada akhir abad 19 ini dilapisi cokelat dan taburan kelapa.\n" +
            " Sedangkan kue Lamington modern memiliki punya beragam isian seperti raspberry dan mudah ditemui di supermarket-supermarket di Australia."

            ,"Ini dia yang ditunggu-tunggu, kue khas Indonesia yang termasuk kue terenak di dunia, Lapis Legit.\n" +
            " Kue ini memang sejstinya bukan asli kekayaan kultur asli Indonesia. Namun merupakan kue hasil penyerapan budaya dari kolonial Belanda yang membekas di Indonesia seperti layaknya kue spikoe.'n" +
            " Beberapa bahkan menganggap antara spikoe dan lapis legit adalahbkue yang sama.\n" +
            " Meski begitu, Lapis Legit memang salah satu kue Indonesia yang tidak dapat ditolak kelezatannya."

            ,"Ma Lai Go adalah kue ikon Hong Kong yang sepintas mirip seperti Kue Bika di Indonesia sebab wjjudnya berupa kue berongga mirip seperti spons.\n" +
            " Hanya saja, Ma Lai Go dimasak dengan dikukus di dalam keranjang bambu layaknya dimsum.\n" +
            " Kue yang biasanya dibuat dengan tepung, telur, gula merah dan lemak babi ini memiliki rasa karamel yang kuat hasil dari melumernya gula saat dikukus dan umumnya Ma Lai Go disajikan di pagi hari."

            ,"Kue yang dikenal mulai muncul di tahun 1960 ini sangat terkenal di Italia.\n" +
            " Hampir setiap toko kue di negara tersebut menyajikan Tiramisu.\n" +
            " Tiramisu merupakan kue berkafein bercampur cokelat yang kerap menjadi hidangan pencuci mulut dengan kesan menyenangkan.\n" +
            " Mungkin karena kandungan kafeinnya yang memang mampilu membuat orang kembali merasa bersemangat.\n" +
            " Tiramisu sendiri memangg bermakna bersemangat ataupun membangunkan."

            ,"Melihat namanya saja sudah sangat kentara bahwa kue ini diberi nama berdasarkan nama ratu Inggris, Ratu Victoria.\n" +
            " Menurut cerita, Ratu Victoria diketahui sangat menyenangi mengudap sepotong kue bolu sembari menikmati teh hangat di sore hari.\n" +
            " Bukan hanya budaya teh di sore hari saja ternyata yang menjadi populer tetapi juga kue bolu yang di nikmati oleh sang ratu. Kue bolu victoria biasanya dibuat dari tepung, telur dan gula.\n" +
            " Kemudian di sajikan dengan selai rasberi dan krim vanila."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cake);
        ListView lv = (ListView) findViewById(R.id.lvcake);

        Adaptercake adaptercake = new Adaptercake (this,namacake,gambarcake,asalcake);

        lv.setAdapter(adaptercake);

//        final detailCake deskcake = new detailCake();

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent tolong = new Intent(MenuCake.this,DetailCake.class);

                tolong.putExtra("cake",namacake[position]);
                tolong.putExtra("caker",gambarcake[position]);
                tolong.putExtra("cakel",asalcake[position]);
                tolong.putExtra("details",deskCake[position]);

                startActivity(tolong);
            }
        });
    }
}
