package id.co.blogspot.abdullahxcreator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuTutorial extends AppCompatActivity {

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

    private String[] cara ={
            "Bahan Kue Black Forest:\n" +
                    "* 100 gram tepung terigu protein sedang\n" +
                    "* 8 butir telur\n" +
                    "* 200 gram gula pasir\n" +
                    "* 60 gram coklat bubuk\n" +
                    "* 100 gram mentega, lelehkan\n" +
                    "* 40 gram tepung maizena\n" +
                    "* 1/4 sendok teh vanili\n" +
                    "* 1 sendok makan emulsifier\n" +
                    "Bahan Untuk Garnish:" +
                    "* 500 gram krim kocok / butter cream\n" +
                    "* 1 kaleng cherry hitam\n" +
                    "* 100 gram Dark Cooking Chocolate (DCC)\n" +
                    "* 10 buah cherry merah\n" +
                    "Tips Mempersiapkan Bahan dan Peralatan Untuk Kue:\n" +
                    "* Untuk yang pertama, kita akan lakukan terlebih dahulu dengan mempersiapkan peralatan yang akan digunakan untuk membuat adonan kue. Hal ini penting sekali, karena beberapa peralatan tersebut akan dapat menunjang anda untuk membuat bahan kue dengan lebih nyaman. Adapun beberapa peralatan tersebut diantaranya adalah loyang kue dengan ukuran 22x22x4 sebanyak 3 buah, oven, mixer, baskom dan beberapa wadah yang akan digunakan untuk menampung bahan-bahan kue. Nah, dengan mempersiapkan beberapa peralatan ini, maka nantinya kegiatan membuat adonan kue akan bisa anda lakukan dengan lebih tenang. Dengan demikian, anda tak perlu pergi bulak-balik ke dapur hanya untuk menjangkau peralatan-peralatan tersebut.\n" +
                    "* Setelah peralatan diatas dipersiapkan, lanjutkan dengan mengolesi loyang yang anda siapkan dengan menggunakan mentega atau butter. Olesi loyang secara merata dan taburi dengan tepung terigu, taburkan dengan merata sampai tepung melapisi olesan mentega dengan tipis. Lalu setelah itu, sisihkan sementara.\n" +
                    "* Selanjutnya, baru persiapkan beberapa bahan yang akan anda gunakan seperti halnya untuk mentega. Masukkan mentega dalam wajan dan lelehkan dengan menggunakan api yang sedang. Aduk-aduk bahan ini sampai anda bisa melihat bahwa kini mentega telah meleleh secara merata. Angkat sajian ini dan sisihkan sementara.\n" +
                    "* Sementara itu, untuk cherry hitam, silahkan masukkan cherry dalam wadah dan saring airnya untuk kemudian pisahkan airnya dan masukkan cherry kedalam wadah untuk kemudian sisihkan sementara.\n" +
                    "Cara Membuat Kue Blackforest Sederhana:\n" +
                    "* Untuk membuat adonan kue, silahkan siapkan baskom dekat dengan jangkauan anda dan masukkan tepung terigu bersama dengan tepung mazeina dan juga coklat bubuk. Aduk-aduk bahan ini secara merata dan ayak dengan menggunakan saringan. Sisihkan sementara.\n" +
                    "* Setelah tu, kita akan buat adonan basah untuk kue. Caranya, siapkan wadah atau baskom yang baru dan kocok telur bersama dengan emulsifier sampai mengembang dan mengental selama kurang lebih 10-15 menit. Gunakan kecepatan paling tinggi pada mixer dan kocok terus.\n" +
                    "* Masukkan campuran tepung terigu dan coklat bubuk yang telah diayak, kemudian masukkan mentega yang telah dicairkan. Aduk-aduk bahan ini secara merata sampai tercampur merata.\n" +
                    "* Nah, setelah semua bahan dicampur secara merata, silahkan bagi adonan kedalam 3 buah loyang yang sudah dipersiapkan dan ratakan bagian atasnya dengan menggunakan pisau.\n" +
                    "* Masukkan adonan dalam loyang kedalam oven dengan suhu 180 derajat dan biarkan selama kurang lebih 25 menit. Angkat kue dan dinginkan.\n" +
                    "* Basahi cherry hitam dan letakan satu lapisan kue, kemudian olesi dengan butter cream dan tempatkan cherry dibagian atasnya. Lakukan hal yang sama sampai lapisan kue terususun dengan cantik.\n" +
                    "Terakhir, silahkan lumuri bagian permukaan kue dengan menggunakan buttercream dan hiasi dengan potongan coklat serut sampai terutupi. Lalu hidangkan."

            ,"Bahan kue cheese cake:\n" +
            "* 125 gram tepung terigu\n" +
            "* 125 gram gula pasir\n" +
            "* 100 gram margarin\n" +
            "* 3 butir telur ayam (suhu ruang)\n" +
            "* 1 sdt emulsifier (SP/ovalet/TBM)\n" +
            "* 1 sachet susu kental manis\n" +
            "* 1 sachet susu bubuk\n" +
            "* 75 gram kedu cheddar parut\n" +
            "Cara Membuat:\n" +
            "* 1. Lelehkan margarin bersama keju cheddar parut, aduk sampai rata. Sisihkan.\n" +
            "* 2. Gula, telur dan emulsifier di-mixer sampai kaku, putih dan berjejak.\n" +
            "* 3. Tambahkan terigu, susu bubuk, dan susu kental manis. Aduk dengan teknik aduk balik. \n" +
            "* 4. Masukkan margarin dan keju yang sudah dilelehkan, aduk balik sampai tercampur rata.\n" +
            "* 5. Siapkan loyang yang sudah diolesi margarin, masukkan adonan. Panaskan dulu kukusan.\n" +
            "* 6. Kukus sekitar 30 menit, lakukan tes tusuk untuk memastikan kematangannya."

            ,"Bahan Kue Dorayaki :\n" +
            "* 150 gram tepung terigu\n" +
            "* 2 butir telur ayam\n" +
            "* ½ sendok makan baking powder\n" +
            "* 100 gram gula pasir\n" +
            "* 50 ml susu cair\n" +
            "* ½ sendok teh garam\n" +
            "Selai coklat secukupnya\n" +
            "Cara Membuat Dorayaki isi Coklat Enak dan Lembut :\n" +
            "* Kocok telur dan gula pasir menggunakan mixer hingga halus dan mengembang.\n" +
            "* Setelah itu tambahkan tepung terigu, dan baking powder sambil dikocok sampai rata dan mengembang.\n" +
            "* Lalu kita tuang campuran susu cair, gula cair, dan garam sambil diaduk  sampai rata.\n" +
            "* Setelah itu kita diamkan terlebih dahulu adonan selama 15 menit dalam lemari es.\n" +
            "* Aduk sampai rata. Lalu tuang sedikit adonan di pan dadar / wajan anti lengket.\n" +
            "* Masak hingga warnanya berubah menjadi kecoklatan. Bolak balik dorayaki agar kedua sisi matang sempurna.\n" +
            "* Ulangi hingga seluruh adonan dorayaki habis.\n" +
            "Setelah selesai membuat kulitnya, saatnya kita isi dengan isian coklat yang telah dipersiapkan sebelumnya.\n" +
            "* Oleskan isian dengan selai coklat pada salah satu sisi dorayaki kemudian tumpuk dengan dorayaki lain.\n" +
            "* Tambahkan cokelat leleh dan susu kental manis sebagai topping.\n" +
            "* Dorayaki khas jepang isi coklat yang enak dan lembut siap disantap."

            ,"Bahan Kue Kaiserschmarrn :\n" +
            "* 450 ml susu cair\n" +
            "* 150 gram tepung terigu\n" +
            "* 100 gram kismis\n" +
            "* 4 butir telur\n" +
            "* 2 sendok makan margarin untuk olesan\n" +
            "* 2 sendok makan gula pasir\n" +
            "* 1 sendok teh garam\n" +
            "* 1-2 sendok makan gula halus\n" +
            "Cara Membuat Kue Kaiserschmarrn :\n" +
            "* Kocok kuning telur dan gula pasir sampai putih kemudian tambahkan sedikit demi sedikit tepung, gula, garam dan kismis.\n" +
            "* Kocok putih telur hingga mengeras, kemudian tuang kedalam adonan dan aduk hingga merata.\n" +
            "* Panaskan setengah bagian mentega dengan api sedang, kemudian tuang adonan hingga bagian bawah adonan berubah warna menjadi kecoklatan. Kemudian sisa margarin untuk masak sisi lainnya. Jika sudah berubah warna angkat dan sajikan.\n" +
            "* Sajikan kue kaiserschmarrn ke piring saji kemudian ditambah dengan gula halus sebagai pemanis."

            ,"Bahan kue kransekake:\n" +
            "* 500g / 1lb 2oz kacang almond tanah\n" +
            "* 500g / 1lb 2oz gula icing , diayak\n" +
            "* 4 putih telur rentang bebas , ringan dibawa\n" +
            "* 1 sdt ekstrak almond\n" +
            "* minyak sayur , untuk greasing\n" +
            "* semolina , untuk debu\n" +
            "* tepung terigu , untuk debu\n" +
            "Untuk lapisan gula:\n" +
            "* 3 putih telur rentang bebas\n" +
            "* 600g / 1lb 5oz gula icing , diayak\n" +
            "* Beberapa tetes pewarna makanan merah , atau pasta pewarna makanan berwarna kacang polong\n" +
            "* glitter merah, hijau dan perak yang dapat dimakan (tersedia secara online atau dari pengecer spesialis)\n" +
            "cara membuat:\n" +
            "* Letakkan kacang almond tanah dan gula icing ke dalam mixer listrik yang besar. Tambahkan putih telur dan ekstrak almond dan aduk rata dengan adonan. Ini bisa dilakukan dengan tangan tapi lebih mudah dengan mixer karena jumlahnya banyak. Tutup mangkuk dengan cling film dan dinginkan di lemari es selama minimal dua jam, atau sebaiknya semalam.\n" +
            "* Panaskan oven sampai 200C / 400G / Gas 6.\n" +
            "* Sikat ringan bagian dalam cetakan kransekake dengan minyak sayur. Taburkan semolina kecil ke dalam setiap cetakan dan ujung cetakan untuk mendistribusikan semolina secara merata di sekitar bagian dalam, sambil mengeluarkan kelebihan apapun.\n" +
            "* Bagi adonan dingin menjadi enam bagian berukuran sama.\n" +
            "* Bagi salah satu potongan adonan menjadi tiga potongan berukuran berbeda: satu kecil, satu medium dan satu besar. Debu permukaan kerja ringan dengan tepung dan gulung setiap potongannya ke lebar jari yang cukup panjang untuk membungkus cetakan kransekake.\n" +
            "* Sesuaikan potongan adonan terpanjang di dalam cincin kransekake terbesar, tekan ujungnya untuk menutup. Lakukan hal yang sama dengan potongan adonan berukuran sedang dan terkecil. Ulangi proses ini dengan sisa lima potong adonan.\n" +
            "* Panggang kransekakes di oven selama 8-10 menit, atau sampai berwarna cokelat keemasan, lalu angkat dari oven dan sisihkan hingga mendingin di cetakannya sampai mengeras. Transfer ke rak kawat untuk mendinginkan sepenuhnya.\n" +
            "* Sementara untuk icing, kocok putih telur dalam mangkuk besar sampai berbusa. Perlahan-lahan kocok gula pasir sesendok pada satu waktu, sampai puncak yang kaku dan mengilap saat kocokan dilepas.\n" +
            "* Sendok setengah dari lapisan gula ke dalam mangkuk terpisah dan tambahkan pewarna makanan merah. Kocok hingga lapisan gula merah cerah, lalu masukkan es ke dalam kantong pipa yang dilengkapi nosel tulisan biasa. Sendokkan es putih ke dalam kantong pipa terpisah yang dilengkapi nosel tulisan biasa.\n" +
            "* Untuk merakit kransekake, urutkan cincin yang dimasak menjadi ukuran.\n" +
            "* Pipa beberapa titik icing putih ke dasar cincin terbesar dan tempelkan ke piring saji besar.\n" +
            "* Pola zig-zag pipa ke cincin terbesar menggunakan yang pertama berwarna putih, lalu icing merah, tumpang tindih keduanya. Taburi dengan glitter merah, hijau dan perak yang dapat dimakan.\n" +
            "* Tempatkan cincin terbesar kedua di atas ring terbesar dan ulangi proses icing dan decorating.\n" +
            "* Lanjutkan untuk menumpuk cincin dalam menurunkan urutan ukuran sampai Anda memiliki menara 18 cincin es dan berkilauan. Biarkan icing untuk mengatur (ini akan menempel cincin satu sama lain)"

            ,"Bahan Kue Lamington :\n" +
            "* 200 gr mentega tawar dingin\n" +
            "* 175 gr gula pasir halus\n" +
            "* 4 btr telur\n" +
            "* 150 gr tepung terigu protein sedang\n" +
            "* 1 sdt baking powdern\n" +
            "* 30 gr coklat bubuk larutkan dalam 100 ml air hangat\n" +
            "* ¼ sdt coklat pasta\n" +
            "Bahan Toping :\n" +
            " 100 ml susu cair\n" +
            " 200 gr dark cooking chocolate,\n" +
            " 1 sdm mentega tawar\n" +
            "Bahan Pelapis :\n" +
            "* 50 gr kelapa kering siapa pakai (kelapa yang sudah disangrai hingga kering)\n" +
            "Cara membuat lamington cake :\n" +
            "* Kocok mentega dan gula pasir halus sampai lembut. Masukkan satu per satu telur sambil terus di kocok rata sambil bergantian dengan sebagian tepung terigu.\n" +
            "* Masukkan sisa tepung terigu dan baking powder sambil diayak dan dikocok rata bergantian dengan larutan cokelat bubuk dan cokelat pasta.\n" +
            "* Tuang ke loyang yang sudah diolesi margarin dan dialasi dengan kertas roti.\n" +
            "* Oven selama 30 menit dengan api bawah bertemperatur 180 derajat Celcius sampai matang. Lalu dinginkan.\n" +
            "* Potong cake dengan ukuran 2x2x2 cm kemudian sisihkan.\n" +
            "Cara membuat toping lamington cake:\n" +
            "* Panaskan susu cair dengan api sedang. Matikan api. Lalu masukkan potongan dark cooking chocolate. Aduk sampai larut.\n" +
            "* Tambahkan mentega. Aduk rata.\n" +
            "* Oleskan bahan topping ke seluruh permukaan cake. beri taburan atau Guling-gulingkan ke kelapa "

            ,"Bahan Kue lapis :\n" +
            "* 200 gr margarin\n" +
            "* 2 1/2 sdm Susu Kental Manis\n" +
            "* 40 gr susu bubuk\n" +
            "* 8 butir telur\n" +
            "* 200 gr gula pasir\n" +
            "* 1 sdm emulsifier (Sp/ Ovalet/ TBM)\n" +
            "* 200 gr tepung terigu protein sedang\n" +
            "* 1/2 sdt BP\n" +
            "* 1/2 sdt essen vanila\n" +
            "* BUMBU TABURAN:\n" +
            "* 1 sdm bumbu spekuk\n" +
            "* 1/2 sdm coklat bubuk\n" +
            "cara membuat:\n" +
            "* Kocok margarin hingga lembut, tambahkan SKM kocok rata, sisihkan\n" +
            "* Di wadah lain kocok gula pasir, telur dan emulsifier hingga mengembang. Masukan terigu, susu bubuk dan BP sambil diayak dan aduk rata. Tambahkan essen vanila aduk rata.\n" +
            "* Tuang adonan no (2) ke adonan no (1) sambil diaduk pelan.\n" +
            "* Ambil 1 sendok sayur adonan tuang kedalam loyang yang sudah diolesi margarin, ayak tipis bahan taburan diatasnya.\n" +
            "* Kukus 5 menit dengan api sedang. Ulangi step no (4) sampai adonan habis.\n" +
            "* Terakir kukus 10 menit atau sampai matang"

            ,"Bahan biang:\n" +
            "* 1 1/2 sendok makan gula pasir\n" +
            "* 100 ml air hangat\n" +
            "* 1 sendok teh ragi instan (pastikanfresh, cek masa kedaluarsa. Saya memakai merk Fermipan)\n" +
            "* 150 gram tepung terigu berprotein tinggi\n" +
            "Bahan kue malaigo:\n" +
            "* Bahan biang yang telah jadi\n" +
            "* 40 gram tepung terigu protein tinggi\n" +
            "* 1 sendok makan susu bubuk\n" +
            "* 1 1/2 sendok makan tepung custard, bisa diganti dengan maizena\n" +
            "* 200 gram gula pasir\n" +
            "* 1 1/2 sendok teh baking powder – 1/2 sendok teh baking soda\n" +
            "* 5 butir telur ayam ukuran besar\n" +
            "* 150 ml minyak goreng\n" +
            "* 1/2  s/d 1  sendok teh pewarna hijau aroma pandan\n" +
            "Cara membuat :\n" +
            "* Siapkan mangkuk, masukkan air hangat dan ragi instan ke dalamnya. Aduk hingga ragi larut dan diamkan selama 10 menit. Tambahkan gula pasir dan tepung terigu, uleni menggunakan tangan hingga terbentuk gumpalan adonan yang kasar. Tutup mangkuk denganplastic wrap dan diamkan selama 12 jam.\n" +
            "\n" +
            "* Setelah 12 jam, siapkan mangkuk besar. Masukkan tepung terigu, susu bubuk, tepung custard, gula pasir, baking powder dan baking soda, aduk rata. Potong-potongstarter menggunakan jari tangan hingga menjadi ukuran kecil, masukkan ke dalam campuran tepung.\n" +
            "\n" +
            "* kemudian aduk dan uleni campuranstarter dan tepung dengan menggunakan tangan sampai campuran akan menjadi lembab dan mudah tercampur dengan baik. Lakukan proses ini hingga semua bahan tercampur baik.\n" +
            "\n" +
            "* Kemudian Tambahkan telur dan minyak goreng kocok adonan menggunakan mikser dengan speed paling rendah hingga menjadi halus dan tercampur baik. Pada kondisi ini adonan akan membentuk gumpalan-gumpalan yang sulit hancur, jika adonan masih membentuk gumpalan maka adonan lantas di saring menggunakan saringan kawat dengan lubang-lubang yang agak besar, tekan-tekan adonan di saringan dengan sendok sehingga adonan menjadi halus.\n" +
            "\n" +
            "* Lalu Tutup permukaan mangkuk denganplastic wrap dan diamkan adonan selama 2 – 3 jam hingga adonan mengembang dan membentuk gelembung-gelembung halus.\n" +
            "\n" +
            "* Selanjutnya, Siapkan loyang bulat diameter 23 cm atau bisa juga menggunakan loyang segi empat. Olesi dengan margarine dan alasi permukaannya dengan kertas baking. Olesi permukaan kertas dengan margarine. Tuangkan adonan ke dalam loyang dan istirahatkan kembali selama 1 jam.\n" +
            "\n" +
            "* Setelah itu, Kukus adonan di dalam dandang kukusan yang telah dipanaskan sebelumnya menggunakan api besar. Tutup permukaan kukusan dengan kain bersih yang menyerap air. Kukus selama 45 menit. Jangan buka penutup kukusan selama cake di kukus.\n" +
            "\n" +
            "* Jika cake telah matang, keluarkan dari kukusan, lepaskan dari loyang. Potong-potong sesuai selera Anda.\n" +
            "\n" +
            "* Ma Lai Gao Spesial Lembut dan Enak siap dihidangkan."

            ,"Bahan Kue Tiramisu Cake :\n" +
            "* 100 gram tepung terigu protein sedang\n" +
            "* 1/2 sdt baking powder\n" +
            "* 125 gram gula pasir\n" +
            "* 1/2 sdm emulsifier (SP/TBM)\n" +
            "* 4 butir garam\n" +
            "* 1/4 sdt garam\n" +
            "Bahan Kopi :\n" +
            "* 25 gram white chocolate cooking (dipotong-potong jadi kecil)\n" +
            "* 15 gram margarin (lelehkan)\n" +
            "* 2 sdt kopi (1/2 sdt kopi instan dilarutkan dengan 2 sdt air matang)\n" +
            "* 1/4 sdt pasta mocca\n" +
            "* Bahan Keju :\n" +
            "* 25 gram white chocolate cooking (potong-potong jadi kecil)\n" +
            "* 15 gram margarin (lelehkan)\n" +
            "* 2 sdt susu cair\n" +
            "* 15 gram keju cheddar (parut)\n" +
            "* Bahan Topping (dikocok)\n" +
            "* 50 gram krim bubuk\n" +
            "* 100 ml air es\n" +
            "* Bahan Taburan\n" +
            "* 1/2 sdt coklat bubuk\n" +
            "Peralatan yang diperlukan untuk membuat tiramisu cake :\n" +
            "* Loyang ukuran 24x10x7cm yang telah dialasi dengan kertas roti\n" +
            "Cara Membuat  :\n" +
            "* Langkah pertama, aduk telur beserta emulsifier dan gula pasir sampai mengembang. Kemudian masukkan tepung terigu dan baking powder sambil anda ayak – ayak dan diaduk dengan rata. Setelah itu bagi adonan menjadi 2 bagian.\n" +
            "\n" +
            "* Langkah kedua,untuk bahan kopi : lelehkan margarin beserta kopi, white cooking chocolate. dengan api takaran kecil.Lalu aduk hingga larut dan tambahkan pasta mocca. Kemudian aduk sampai warnanya berubah. Setelah itu matikan api.\n" +
            "\n" +
            "* Langkah ketiga, masukkan adonan kopi perlahan sedikit demi sedikit ke dalam adonan 1 sambil anda aduk aduk perlahan. Kemudian tuang adonan 1 ke dalam loyang yang sebelumnya telah dipersiapkan. Setelah itu kukus selama kurang lebih 15 menit di atas api takaran sedang.\n" +
            "\n" +
            "* Selanjutnya membuat bahan keju : lelehkan margarin beserta white cooking chocolate dan keju cheddar yang sebelumnya sudah diparut. Lalu aduk hingga larut. Kemudian anda tambahkan susu cair. Setelah itu matikan api.\n" +
            "\n" +
            "* Berikutnya, masukkan adonan keju secara perlahan ke dalam adonan 2 sambil anda aduk rata. Lalu buka kukusan dan tuangkan adonan keju pada bagian atas adonan kopi. Kemudian kukus kembali kurang lebih 15 menit di atas api takaran sedang hingga matang.\n" +
            "\n" +
            "* Terakhir, setelah matang, kemudian angkat dan diamkan sejenak. Lalu semprot topping di atas kue tiramisu cake dan jangan lupa taburkan cokelat bubuk pada bagian atasnya. Setelah itu kue tiramisu cake buatan anda siap untuk dihidangkan."

            ,"Bahan kue victoria sponge\n" +
            "* 225 gr butter\n" +
            "* 225 gr gula kastor (caster sugar)\n" +
            "* 4 butir telur ukuran besar\n" +
            "* 225 gr terigu, dimodif 200gr terigu, 25gr susu bubuk)\n" +
            "* 100 gr selai strawberry\n" +
            "* Sandwich pelapis :\n" +
            "* 200 gr krim kental\n" +
            "* Secukupnya Strawberry segar\n" +
            "* 2 sdm gula halus\n" +
            "* 100 gr selai strawberry/rasberry\n" +
            "cara membuat :\n" +
            "* Kocok butter dan gula hingga pucat dan lembut\n" +
            "\n" +
            "* Tambahkan telur, kocok hingga mengembang\n" +
            "\n" +
            "* Tambahkan terigu yg sdh diayak, aduk rata menggunakan spatula. Beri susu cair untuk mengencerkan adonan (bila perlu)\n" +
            "\n" +
            "* Tuang dlm loyang bulat ukuran 18 yg sdh dilapisi kertas roti/baking paper. Panggang dengan api 180dercel hingga matang (lakukan tes tusuk)\n" +
            "\n" +
            "* Krim: Kocok krim dengan kecepatan tinggi dan tambahkan gula halus.\n" +
            "\n" +
            "* Finishing, oleskan strawberry jam dan krim dan hias dengan strawberry segar dan taburan gula halus."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tutorial);

        ListView lvs = (ListView) findViewById(R.id.lvtutorial);

        Adaptertutorial adaptertutor = new Adaptertutorial (this,namacake,gambarcake,asalcake);

        lvs.setAdapter(adaptertutor);

        lvs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent bantu = new Intent(MenuTutorial.this,DetailTutorial.class);

                bantu.putExtra("nama",namacake[position]);
                bantu.putExtra("gambar",gambarcake[position]);
                bantu.putExtra("asal",asalcake[position]);
                bantu.putExtra("cara",cara[position]);

                startActivity(bantu);
            }
        });
    }
}
