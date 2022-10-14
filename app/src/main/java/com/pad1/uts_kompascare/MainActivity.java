package com.pad1.uts_kompascare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<News> news= new ArrayList<>();
    private NewsAdapter newsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData(detailUser.umur,detailUser.kategori);

        newsAdapter = new NewsAdapter(this,news);
        recyclerView = findViewById(R.id.rv_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);
    }
    private void addData(int umur, String kategori){
        if (detailUser.kategori.equals("Teknologi")){
        news.add(new News("Bocoran Hasil Benchmark RTX 4090,Dua Kali Lebih Kencang dari RTX 3090?", "Teknologi",R.drawable.rtx,0,"29-07-2022","Belum bisa dipastikan apakah hasil benchmark ini akurat atau tidak. Sebab, pihak Nvidia saat ini memang belum mengumbar informasi apapun terkait GPU terbaru mereka dari seri RTX 4000 Series. Apabila mengacu pada rumor yang mengalir di internet, Nvidia sendiri dikabarkan bakal meluncurkan sejumlah GPU dari seri GeForce RTX 4000, yang terdiri dari RTX 4070, RTX 4080, dan RTX 4090 sekitar September-Oktober 2022 mendatang. Nvidia GeForce RTX 4090 merupakan model teratas yang disebut bakal memiliki nomor model \"AD102-300-A1\", sedangkan RTX 4080 disebut bakal memiliki model \"AD103-300-A1\", dan model RTX 4070 konon adalah \"AD104-275-Kx-A1\". Baca juga: GPU GeForce RTX 3050 Mulai Dijual di Indonesia, Harganya? Bocoran spesifikasi ketiga GPU tersebut bisa dilihat dalam informasi berikut ini, sebagaimana dirangkum KompasTekno dari Gizchina, Jumat (29/7/2022). Nvidia GeForce RTX 4070 16.384 FP32 Core GPU frequency hingga 2.750 MHz Video Memory 384-bit (24 GB/GDDR6X) dengan bandwidth 21 Gbps TDP 450W Nvidia GeForce RTX 4080 10.240 FP32 Core Video Memory 256-bit (16 GB/GDDR6X) dengan bandwidth 21 Gbps TDP 420W" ));
            news.add(new News("AMD Ryzen 7000 Emang Panas? | Review AMD Ryzen™ 5 7600X & Ryzen 9 7950X", "Teknologi",R.drawable.ryzen,0,"15-09-2022","SKU & Dimensi CPU\n" +
                    "Pertama soal SKU yang dibawa , di batch pertama ini AMD merilis total ada 4 SKU CPU yang terdiri dari Ryzen 5 7600X, Ryzen 7 7700X, Ryzen 9 7900X dan Ryzen 9 7950X. Bisa dilihat ya, CPU nya ini memang memiliki bentuk yang gak umum.\n" +
                    "\n" +
                    "Selain karena kali ini pake socket LGA, cover metal yang ada di bagian atasnya nih dibuat gak full mengotak gitu, jadi kesannya lebih compact sih dari sizenya, padahal secara fisik ya sebenernya sama ajah.\n"+"Clock Speed CPU. \n" +
                    "Nah versi terendahnya, yaitu Ryzen 5 7600X ini memiliki konfigurasi core yang masih sama dengan generasi sebelumnya. Yaitu 6 core 12 threads, tapi dengan clock yang jauh lebih kencang dengan boost sampai 5.3 GHz." ));
            news.add(new News("Intel Gen 13 Resmi Dirilis dengan Codename Intel Raptor Lake", "Teknologi",R.drawable.intelraptoplake,0,"29-07-2022","Sebagai perusahaan besar dibalik terciptanya banyak prosesor laptop terbaik, nama Intel memang tidak perlu diragukan lagi. Di mana, perusahaan teknologi ini selalu menawarkan prosesor terbaik dengan performa mumpuni dan inovasi dalam pengembangan teknologi yang dapat diandalkan. Baru-baru ini, Intel sukses menggelar event besar bertajuk Intel Innovation di San Jose, Amerika Serikat pada akhir September lalu.\n" +
                    "\n" +
                    "Pada acara tersebut, Intel kembali meluncurkan Intel Gen 13 dengan codename Intel Raptor Lake.  Mengusung nama resmi Intel Core Gen 13 yang diklaim dibekali sejumlah peningkatan untuk menghasilkan kinerja signifikan jika dibandingkan generasi sebelumnya yaitu Intel Core Generasi ke-12 . Lalu, seperti apa teknologi dan fitur canggih yang ditawarkan prosesor terbaik besutan Intel ini? Yuk, simak penjelasannya berikut ini. \n"+"Pada event Intel Innovation yang diselenggarakan pada bulan September lalu, perusahaan Intel resmi memperkenalkan 6 CPU Intel Core Gen 13 yang diklaim sebagai prosesor tercepat di dunia. Adapun jenis CPU terbaru dari Intel ini, antara lain sebagai berikut:\n" +
                    "\n" +
                    "Intel Core i9-13900K\n" +
                    "Intel Core i9-13900KF\n" +
                    "Intel Core i7-13700K\n" +
                    "Intel Core i7-13700KF\n" +
                    "Intel Core i5-13600K\n" +
                    "Intel Core i5-13600KF\n" +
                    "Di mana, keenam CPU canggih tersebut diklaim lebih mudah untuk di-overclock karena multiplier yang tidak dikunci. Sebelumnya pada Intel Innovation 2021, perusahaan teknologi ini juga melakukan hal serupa dengan meluncurkan 6 CPU utama Intel Core Generasi ke-12 dengan codename Intel Alder Lake dan seluruhnya merupakan prosesor dengan multiplier tidak terkunci. Varian CPU ini dibedakan menjadi 2 unit yaitu Varian K yang menyertakan grafis terintegrasi dan varian KF tidak dilengkapi unit pengolah grafis Intel UHD Graphic 770." ));
            news.add(new News("Apa Itu Dynamic Island di iPhone 14?", "Teknologi",R.drawable.dynamic,0,"25-09-2022","Peluncuran iPhone 14 Series menyita perhatian dari penggemar setianya tapi juga penggemar gadget yang menggunakan Android. Mereka penasaran dengan hal baru yang bakal dipamerkan Apple.\n" +
                    " \n" +
                    "Satu fitur yang mengundang perhatian adalah Dynamic Island yang ada di sisi bagian atas layar iPhone 14 Series. Apa itu Dynamic Island di iPhone 14? Jadi di seri terbaru, Apple tidak lagi menampilkan poni alias notch yang beberapa tahun lalu akhirnya ditiru para smartphone Android.\n" +
                    " \n" +
                    "Kini poni tersebut terpisah dari sisi bagian atas layar dan diberi nama sebagai Dynamic Island. Jadi kolom hitam yang memuat layar depan iPhone 14 Series bisa memanjang sekaligus menampilkan informasi dari aplikasi yang sedang berjalan atau kita butuhkan. \n"+"Misalnya, menampilkan informasi judul lagu atau musik yang sedang diputar maupun aplikasi lain yang bisa dengan mudah terpantau dari kolom fitur Dynamic Island. Bagian ini juga bisa menampilkan notifikasi dari aplikasi yang kita sudah atur.\n" +
                    " \n" +
                    "Ukuran panjang kolom Dynamic Island akan berubah sesuai dengan informasi yang ditampilkan atau saat sedang kita akses. Jadi fungsi Dynamic Island mirip seperti bar notifikasi yang harus ditarik dari sisi bagian atas layar pada sistem operasi Android.\n" +
                    " \n" +
                    "Meskipun diperkenalkan pada peluncuran iPhone 14 tapi fitur Dynamic Island hanya tersedia di versi iPhone 14 Pro dan iPhone Pro Max. Versi iPhone 14 atau reguler masih menggunakan poni seperti iPhone 13.\n" +
                    " \n" +
                    "Apakah fitur ini akan juga ditiru oleh smartphone Android seperti tren poni? Kemungkinan iya, kabarnya Xiaomi dan realme tengah mempertimbangkan fitur ini. Meskipun belum resmi tapi ada developer aplikasi yang sudah membuat aplikasi fitur Dynamic Island bisa digunakan di Android." ));
            news.add(new News("Samsung Smart Monitor Terbaru Tawarkan Kenyamanan Kerja dan Nikmati Hiburan di Rumah", "Teknologi",R.drawable.samsung,0,"15-10-2022","Samsung Electronics Co., Ltd. baru-baru ini meluncurkan secara global Smart Monitor terbaru, layar \"do-it-all\" dengan fleksibilitas untuk bekerja, belajar, dan menikmati hiburan di rumah.\n" +
                    "\n" +
                    "Samsung menyebutnya sebagai sebuah layar inovatif dan serba bisa yang menyatukan rangkaian fitur yang belum pernah ada sebelumnya untuk bekerja, belajar, dan hiburan dalam satu perangkat.\n" +
                    "\n" +
                    "Sesuai kebutuhan pengguna masa kini yang melakukan aktivitas bekerja, belajar, dan menikmati hiburan di rumah, Samsung Smart Monitor menghadirkan konektivitas mobile dan PC yang lengkap,  fitur remote office dan pembelajaran jarak jauh, serta Smart Hub. Smart Hub adalah sebuah portal hiburan komprehensif, serupa dengan platform Smart TV Samsung.\n" +
                    "\n" +
                    "“Di seluruh dunia, bekerja, pendidikan, dan hiburan telah berubah menjadi aktivitas yang terpusat di rumah,” ujar Hyesung Ha, Senior Vice President, Visual Display Business, Samsung Electronics. Menurut Hyesung Ha, di tengah kondisi new normal ini, sebagian besar indikator menunjukkan peningkatan aktivitas digital dan banyak yang memikirkan ulang penggunaan teknologi di rumah. \n" +
                    "\n" +
                    "\"Smart Monitor terbaru kami merupakan jawaban langsung dari kebutuhan tersebut. Konsumen tidak lagi harus memilih antara satu layar untuk keperluan tunggal atau layar lainnya karena layar ini menyatukan semuanya,\" imbuhnya.\n" +
                    "\n" +
                    "Samsung Smart Monitor terbaru menyediakan banyak pilihan konektivitas untuk PC dan smartphone. Pengguna dapat menghubungkan perangkat seluler pribadinya hanya dengan satu ketukan sederhana menggunakan Tap View, App Casting atau Apple AirPlay 2. Untuk pengalaman desktop yang lengkap menggunakan perangkat seluler, pengguna juga dapat terhubung ke monitor dengan fitur Samsung DeX.\n" +
                    "\n" +
                    "Untuk bekerja dan belajar dari rumah, layar ini dapat mengoperasikan aplikasi Microsoft Office 365 tanpa koneksi PC. Hal ini dimungkinkan berkat adanya Wi-Fi yang tertanam dalam perangkat, yang memungkinkan pengguna untuk membaca, menyunting, dan menyimpan dokumen di cloud secara langsung dari monitor. \n" +
                    "\n" +
                    "Remote Access juga memungkinkan pengguna mengakses file secara nirkabel dalam jarak jauh dari PC atau melihat konten laptop, ketika PC atau laptop tersebut berada di tempat lain di rumah, ataupun di kantor. Port USB Type-C memungkinkan data, tampilan, dan daya — hingga 65W — hanya dengan satu koneksi, menjaga area di sekitar monitor tetap bersih dan apik. Multi port USB dan Bluetooth 4.2 juga memungkinkan fleksibilitas koneksi tambahan, dan layar ini dilengkapi built-in speaker 2 channel." ));
            news.add(new News("Huawei Dukung Penerapan Solusi Teknologi di Institut Teknologi Del", "Teknologi",R.drawable.huawei,0,"28-09-2022","Huawei kemarin (19/05) menandatangani Nota Kesepahaman dengan Institut Teknologi Del (IT Del) untuk mendukung transformasi digital di perguruan tinggi yang berlokasi di tepi Danau Toba, Sumatra Utara tersebut.\n" +
                    "\n" +
                    "Di antara bentuk dukungan itu adalah program pelatihan dan alih pengetahuan bersertifikasi untuk membantu menyiapkan talenta-talenta TIK masa depan berkompetensi gobal serta mampu menjawab kebutuhan industri di era digital. Lebih luas lagi, kerja sama antara Huawei dan IT Del diharapkan dapat berkontribusi terhadap pengembangan dan peningkatan daya saing ekosistem TIK Indonesia baik di kancah nasional, regional, hingga dunia.\n" +
                    "\n" +
                    "Penerapan solusi TIK berbasis cloud dari Huawei yang dirancang untuk menjawab kebutuhan serta tantangan dunia pendidikan di era digital ini juga memiliki relevansi dengan situasi terkini di mana IT Del, sebagaimana lembaga pendidikan lainnya, harus menerapkan perkuliahan secara online. Dosen dan mahasiswa harus berinteraksi dari kediaman masing-masing sesuai dengan protokol pencegahan penyebaran Covid-19.\n" +
                    "\n" +
                    "Ken Qijian, Vice President Public Affairs and Communications Huawei Indonesia, mengatakan bahwa penyediaan solusi TIK untuk IT Del merupakan salah satu wujud dari komitmen global Huawei, #LearningNeverStops serta #TECH4ALL. Komitmen tersebut melandasi setiap upaya Huawei dalam memberikan dukungan terhadap keberlangsungan pendidikan di situasi apapun, serta meningkatkan literasi digital di semua sektor, termasuk sektor pendidikan.\n" +
                    "\n" +
                    "“Solusi TIK Huawei siap untuk didayagunakan oleh dunia pendidikan Indonesia. Huawei telah mengembangkan solusi yang ditujukan untuk menjawab berbagai tantangan yang dihadapi oleh sektor ini. Tidak hanya tantangan yang muncul akibat adanya pandemi COVID-19, namun juga tantangan-tantangan terkait tuntutan kompetensi global di era digital. Kami berharap, solusi yang kami hadirkan dapat memberikan dukungan optimal kepada IT Del sehingga proses perkuliahan terus berlangsung secara efektif dan efisien, dan kompetensi terus meningkat,” tutur Ken.\n" +
                    "\n" +
                    "Rektor IT Del Sumatera Utara, Prof. Ir. Togar M. Simatupang, M.Tech., Ph.D., memberikan tanggapan positif terhadap dukungan teknologi yang dikontribusikan oleh Huawei. Ia mengatakan, selain akan dimanfaatkan secara optimal untuk mendukung terselenggaranya edukasi online bagi 1.400 mahasiswa IT Del selama masa pandemi, solusi TIK dari Huawei juga akan dioptimalkan untuk mempercepat terselenggaranya transformasi digital di kampusnya.\n" +
                    "\n" +
                    "“Sebelum pandemi, kami sudah mulai mendigitalkan materi-materi perkuliahan dan mengunggahnya di platform IT Del agar dapat diakses oleh mahasiswa. Sementara penerapan kuliah online dengan livestreaming secara realtime, menjadi bagian dari penerapan transformasi digital yang rencananya baru akan diterapkan pada 3 hingga 5 tahun ke depan. Namun, situasi pandemi telah mendorong kami untuk mempercepat prosesnya. Terima kasih kepada Huawei yang telah membantu mengakselerasi visi kami dengan menyediakan solusi yang dapat kami dayagunakan selama 2 tahun,” ujar Tagor.\n" +
                    "\n" +
                    "Sementara itu, terkait dengan penyelenggaraan livestreaming secara realtime, Tagor mengungkapkan bahwa platform livestreaming Teachee yang menjadi bagian terintegrasi dari solusi yang dihadirkan Huawei dan telah diuji coba oleh pihaknya, dinilai mampu menjawab harapan kebutuhan pihaknya. Ia menginformasikan bahwa mayoritas mahasiswa IT Del mengharapkan adanya platform livestreaming yang memiliki User Interface yang akomodatif terhadap interaksi dua arah, praktis serta mudah untuk digunakan, ringan untuk diakses, lancar dan tidak patah-patah, tidak menggunakan pembatasan waktu, tidak boros paket data, dan aman." ));



    }
        else if (detailUser.kategori.equals("Politik")){
            if (detailUser.umur >= 18){
                news.add(new News("Demokrat Sebut Jalan NasDem Tak Mudah Usai Deklarasi Anies Baswedan Capres", "Politik",R.drawable.demokrat,18,"14-10-2022","Partai Demokrat menyebut Partai NasDem harus melewati jalan terjal usai mendeklarasikan Anies Baswedan sebagai Capres 2024. Juru Bicara DPP Partai Demokrat, Herzaky Mahendra Putra, mengatakan ancaman, intimidasi, dan tekanan semakin kencang.\n" +
                        "\n" +
                        "“Memang jalannya tidak bakal mudah. Seperti yang sudah dialami salah satu parpol sahabat kami, Nasdem, dalam dua minggu terakhir ini. Ancaman, intimidasi, tekanan, semakin kencang,” kata Herzaky kepada Tempo, Jumat, 14 Oktober 2022.\n" +
                        "\n" +
                        "Tak lama setelah NasDem mendeklarasikan Anies, Presiden Joko Widodo alias Jokowi memberi sinyal adanya kemungkinan reshuffle atau penggantian menteri di kabinet. Jokowi tidak menampik saat ditanya media ihwal hubungan reshuffle dengan deklarasi ini. Adapun partai pengusung Jokowi, PDIP, kerap melontarkan kritik keras baik kepada NasDem maupun Anies.\n" +
                        "\n" +
                        "Herzaky mengatakan deklarasi Anies oleh NasDem merupakan bagian dari hak parpol sebagai entitas yang berdaulat. Menurutnya, sah-sah saja jika ada pihak status quo yang merasa terancam.\n" +
                        "\n" +
                        "“Apalagi jika merasa kinerjanya selama ini jauh dari harapan rakyat. Bagaimanapun, angin perubahan semakin kencang berhembus, dan Demokrat bakal terus konsisten bersama rakyat memperjuangkannya,” kata dia.\n" +
                        "\n" +
                        "Tiga partai masih matangkan koalisi \n" +
                        "\n" +
                        "Ia menegaskan partainya bersama NasDem dan Partai Keadilan Sejahtera (PKS) bakal tetap berfokus mematangkan rencana kolisi. Dia menyebut continuity and change menjadi dasar rencana koalisi ini.\n" +
                        "\n" +
                        "“Kami fokus komunikasi secara intens dan konsolidasi terus, mematangkan rencana untuk berkoalisi. Bagaimana semangat perubahan dan perbaikan untuk rakyat, bisa kita usung dan wujudkan,” ujarnya.\n" +
                        "\n" ));
                news.add(new News("Top Nasional: Sinyal Reshuffle Usai Nasdem Deklarasi Anies Capres, Kata PDIP soal Lawatan Ganjar", "Politik",R.drawable.nasdem,18,"14-10-2022","TEMPO.CO, Jakarta - Berita yang menarik perhatian pembaca hingga pagi ini di antaranya Presiden Joko Widodo atau Jokowi berkomentar soal kemungkinan adanya reshuffle usai NasDem deklarasi Anies Baswedan capres. Kemudian, tanggapan PDIP soal Gubernur Jawa Tengah Ganjar Pranowo telah melakukan lawatan ke empat provinsi. Berikut ringkasannya:\n" +
                        "\n" +
                        "1. Sinyal Reshuffle dari Jokowi Usai NasDem Usung Anies Capres\n" +
                        "\n" +
                        "Presiden Joko Widodo atau Jokowi berkomentar soal kemungkinan adanya reshuffle atau pergantian menteri di kabinet. Jokowi tidak membantah ketika ditanya media soal apakah ada rencana reshuffle usai Partai NasDem mengumumkan Anies Baswedan calon presiden.\n" +
                        "\n" +
                        "\"Rencana selalu ada,\" kata Jokowi saat meninjau proyek Kereta Cepat Jakarta Bandung di Kecamatan Cileunyi, Kabupaten Bandung, Jawa Barat, Kamis, 13 Oktober 2022. \n" +
                        "\n" +
                        "\"Pelaksanaan nanti diputuskan,\" kata mantan Wali Kota Solo ini. Walau demikian, Jokowi tidak merinci lebih lanjut soal rencana tersebut akan menyasar menteri mana dan partai apa.\n" +
                        "\n" +
                        "Pada 3 Oktober, NasDem yang merupakan partai koalisi pendukung pemerintah resmi mengusung Anies Baswedan sebagai calon presiden untuk Pilpres 2024. Berbagai reaksi muncul setelahnya.\n" +
                        "\n" +
                        "Pada 10 Oktober, Sekretaris Jenderal Partai Demokrasi Indonesia Perjuagan atau PDIP Hasto Kristyanto mengkritik langsung NasDem. PDIP, kata dia, tidak akan mencampuri kedaulatan partai politik lain untuk mencalonkan siapapun.\n" +
                        "\n" +
                        "\"Hanya untuk partai politik pengusung Presiden Jokowi - Wakil Presiden Maruf Amin kan terikat etika politik,\" kata Hasto di kampus UGM Yogyakarta.\n" +
                        "\n" +
                        "Di hari yang sama, sejumlah orang yang mengaku sebagai relawan Jokowi tiba-tiba berkumpul dan memprotes dukungan NasDem terhadap Anies. Mereka berkumpul dan membuat surat terbuka untuk Jokowi di N Hotel, yang hanya berjarak beberapa meter saja di depan Kompleks Istana Kepresidenan.\n" +
                        "\n" +
                        "\"Saudara Anies Baswedan adalah salah satu figur yang diketahui publik sangat kental dengan politik identitas,\" kata Fredi Moses Ulemlem, advokat yang juga salah satu relawan yang hadir saat membacakan surat terbuka, Senin, 10 Oktober 2022.\n" +
                        "\n" +
                        "Sejumlah pihak menuntut Jokowi agar mencopot partai dari NasDem di kabinet. Ada tiga menteri dari NasDem yaitu Menteri Komunikasi Johnny Gerard Plate, Menteri Kehutanan Siti Nurbaya Bakar, dan Menteri Pertanian Syahrul Yasin Limpo.\n" +
                        "\n" +
                        "Pada 11 Oktober, Johnny tidak mau menanggapi serius adanya gerakan relawan yang meminta Jokowi mencopot menteri NasDem.\n" +
                        "\n" +
                        "\"Mari kita urus hal-hal yang substantif, bukan hal yang remeh temeh, yang substantif. Itu apa? Yang seuai Undang-Undang, yang menjaga demokrasi kita yang berkualtias, yang mengikuti semua tahapan-tahapan,\" ujar Johnny saat ditemui di Istana Kepresidenan.\n" +
                        "\n" +
                        "2. Kata PDIP soal Lawatan Ganjar ke Empat Provinsi\n" +
                        "\n" +
                        "Gubernur Jawa Tengah Ganjar Pranowo telah melakukan lawatan ke empat provinsi. Ketua DPP PDIP Bidang Ideologi dan Kaderisasi Djarot Saiful Hidayat mengatakan kunjungan Ganjar merupakan bagian dari perintah Ketua Umum PDIP Megawati Soekarnoputri yang meminta semua kader turun ke bawah memastikan keberhasilan program pemerintahan Jokowi.\n" +
                        "\n" +
                        "\"Pak Jokowi adalah kader yang diusung PDIP, kami setia di situ. Mereka turun ke bawah, semua kader turun ke bawah dalam rangka menjamin keberhasilan atau ketuntasan program Jokowi, terutama program strategis nasional,\" katanya di Makassar Rabu 12 Oktober 2022. \n" +
                        "\n" +
                        "Kendati demikian, Djarot tidak memungkiri kunjungan Ganjar Pranowo ke Sulsel untuk kepentingan daerah Jawa Tengah, walaupun ada rangkaian safari politik.\n" +
                        "\n" +
                        "\"Pak Ganjar itu ada dalam rangka safari politik. Tapi, ia kerja-kerja sebagai Gubernur Jawa Tengah, di Sulsel dalam rangka untuk (organisasi) Kagama sama Bank Jateng,\" ujarnya. \n" +
                        "\n" +
                        "Soal peluang Ganjar menjadi capres PDIP, Djarot menyebut hingga kini PDIP meminta mantan anggota DPR RI itu untuk menyelesaikan tugasnya menjadi Gubernur Jawa Tengah. \"Jadi, fokus ke situ. Semuanya berujung bagaimana kami memback up secara penuh,\" katanya.\n" +
                        "\n" +
                        "Adapun soal kehadiran Puan, Djarot mengatakan putri Megawati itu juga mendapat tugas untuk turun ke bawah. \"Karena beliau sebagai Ketua DPR RI sekaligus menyerap aspirasi masyarakat di bawah,\" ujarnya.\n" +
                        "\n" +
                        "Soal banyaknya poster Puan Maharani terpampang dalam arena Rapat Kerja Daerah (Rakerda) DPW PDIP Sulsel di Hotel Claro Makassar, apakah menunjukkan sinyal usungan PDIP akan mengerucut pada Puan Maharani pada pilpres nanti, Ketua DPW PDIP Sulsel Andi Ridwan Wittiri mengatakan Puan merupakan simbol partai.\n" +
                        "\n" +
                        "\"Ibu Puan itu simbol kami DPP PDI Perjuangan. Bahwa Ibu Puan Ketua DPP partai, Ketua DPR RI, sekaligus Ketua Fraksi  PDIP di DPR RI. Menjadi kebanggaan kami, salah satu kader terbaik adalah Puan Maharani menjadi ketua DPP, perempuan pertama, itu adalah simbol dari partai kami,\" katanya kepada wartawan.\n" +
                        "\n"
                        ));
                news.add(new News("Anggota DPR Sebut Pengolahan dan Penjualan Barang Bukti Narkoba Sudah Jadi Rahasia Umum", "Politik",R.drawable.dpr,18,"15-10-2022"," Anggota Komisi Hukum DPR Nasir Djamil menanggapi penangkapan Kapolda Sumatera Barat yang baru dimutasi menjadi Kapolda Jawa Timur Irjen Teddy Minahasa. Teddy dinyatakan sebagai terduga pelanggar dalam kasus narkoba .\n" +
                        "\n" +
                        "Menurut Nasir, kondisi ini mesti segera diatasi. Jika tidak, kata dia, soliditas institusi Polri bakal terancam. Adapun jika Teddy terbukti melakukan perbuatan melanggar hukum, maka moralitas polisi disebut Nasir seperti orang terjun bebas tanpa parasut. \"Apa yang terjadi ini juga semakin menyulitkan Polri mengembalikan kepercayaan publik terhadap institusinya,\" kata Nasir saat dihubungi, Jumat, 14 Oktober 2022.\n" +
                        "\n" +
                        "Nasir menyebut sudah menjadi rahasia umum bahwa bahwa barang bukti narkoba sering diolah dan dijual kembali oleh oknum penegak hukum. Karenanya, Nasir mengatakan Komisi Hukum DPR membentuk Panitia Kerja (panja) Barang Bukti ihwal penangkapan sabu-sabu dan barang lainnya. \n" +
                        "\n" +
                        "\"Itu sebabnya Komisi III DPR RI juga telah lama membentuk Panja Barang Bukti terkait penangkapan sabu-sabu dan barang lainnya. Kami menduga, apa yang dimusnahkan dalam kegiatan seremonial, kadang hanya sedikit,” ujar dia.\n" +
                        "\n" +
                        "Nasir berharap kasus ini bisa diusut hingga ke akarnya. Menurutnya, Polri mesti bisa menjawab apakah Teddy turut menerima aliran dana hingga motif di balik diamnya Teddy saat mengetahui barang bukti narkoba dikurangi dan diselundupkan." ));
                news.add(new News("Profil Zulfan Lindan dari PDIP ke Nasdem, Politisi Kawakan yang Dinonaktifkan Surya Paloh", "Politik",R.drawable.paloh,18,"14-10-2022"," Zulfan Lindan belakangan menjadi sorotan publik. Politisi Partai Nasional Demokrat atau NasDem ini telah dinonaktifkan sebagai pengurus melalui surat yang ditandatangani secara langsung Ketua Umum Surya Paloh dan Sekretaris Jenderal Johnny G. Plate.\n" +
                        "\n" +
                        "Namun, Zulfan Lindan justru mengaku baru mengetahui ihwal surat tersebut dari media dan menilainya sebagai surat salah alamat. “Pertama, surat itu salah alamat. Saya sudah sejak dua tahun lalu bukan lagi sebagai pengurus DPP NasDem karena diangkat sebagai Wakil Komisaris Jasa Marga,” kata Zulfan saat dihubungi Tempo pada 13 Oktober 2022.\n" +
                        "\n" +
                        "Dalam surat yang diteken pada 13 Oktober itu, Zulfan dinilai telah memberikan sejumlah pernyataan tidak produktif kepada media dan terkesan menurunkan citra Partai Nasional Demokrat sebagai salah satu partai di kabinet saat ini.\n" +
                        "\n" +
                        "“DPP Partai Nasdem kemudian memberikan peringatan keras kepada Saudara Zulfan Lindan berupa; Pertama, menonaktifkan dari kepengurusan DPP Partai NasDem. Kedua, melarang keras untuk memberikan pernyataan di media massa dan media sosial atas nama fungsionaris Partai Nasdem,” potongan dari bunyi surat peringatan tersebut. Lantas, bagaimana profil Zulfan Lindan dalam dunia politik sejauh ini?" ));
                news.add(new News("Profil Zulfan Lindan dari PDIP ke Nasdem, Politisi Kawakan yang Dinonaktifkan Surya Paloh", "Politik",R.drawable.dpr,18,"15-10-2022"," Anggota Komisi Hukum DPR Nasir Djamil menanggapi penangkapan Kapolda Sumatera Barat yang baru dimutasi menjadi Kapolda Jawa Timur Irjen Teddy Minahasa. Teddy dinyatakan sebagai terduga pelanggar dalam kasus narkoba .\n" +
                        "\n" +
                        "Menurut Nasir, kondisi ini mesti segera diatasi. Jika tidak, kata dia, soliditas institusi Polri bakal terancam. Adapun jika Teddy terbukti melakukan perbuatan melanggar hukum, maka moralitas polisi disebut Nasir seperti orang terjun bebas tanpa parasut. \"Apa yang terjadi ini juga semakin menyulitkan Polri mengembalikan kepercayaan publik terhadap institusinya,\" kata Nasir saat dihubungi, Jumat, 14 Oktober 2022.\n" +
                        "\n" +
                        "Nasir menyebut sudah menjadi rahasia umum bahwa bahwa barang bukti narkoba sering diolah dan dijual kembali oleh oknum penegak hukum. Karenanya, Nasir mengatakan Komisi Hukum DPR membentuk Panitia Kerja (panja) Barang Bukti ihwal penangkapan sabu-sabu dan barang lainnya. \n" +
                        "\n" +
                        "\"Itu sebabnya Komisi III DPR RI juga telah lama membentuk Panja Barang Bukti terkait penangkapan sabu-sabu dan barang lainnya. Kami menduga, apa yang dimusnahkan dalam kegiatan seremonial, kadang hanya sedikit,” ujar dia.\n" +
                        "\n" +
                        "Nasir berharap kasus ini bisa diusut hingga ke akarnya. Menurutnya, Polri mesti bisa menjawab apakah Teddy turut menerima aliran dana hingga motif di balik diamnya Teddy saat mengetahui barang bukti narkoba dikurangi dan diselundupkan." ));



            }
            else{
                news.add(new News("Perempuan Iran Menuntut Perubahan Politik", "Teknologi",R.drawable.iran,0,"13-10-2022","Para perempuan berada di garis depan protes yang meletus di pemakaman Mahsa Amini, yang meninggal di tahanan polisi Iran pada bulan lalu. Sejak itu, aksi protes menyebar di negara itu dan menjadi tantangan bagi republik Islam itu sejak revolusi 1979.\n" +
                        "\n" +
                        "Salah seorang perempuan yang merasakan tekanan akibat pelaksanaan hukum Islam di negeri itu adalah pensiunan guru Somayyeh. Namun ia merasa terlalu takut untuk melawan ulama yang berkuasa sampai pada kematian Amini.\n" +
                        "\n" +
                        "Baca: Ikut Demo Mahsa Amini, Putri Eks Presiden Iran Didakwa Lakukan Propaganda\n" +
                        "\n" +
                        "Kematian Amini telah menjadi titik temu yang belum pernah terjadi sebelumnya bagi perempuan yang mengambil risiko besar untuk memperjuangkan kebebasan, menyerukan kejatuhan ulama berkuasa dalam masyarakat yang didominasi laki-laki. Namun para analis percaya peluang untuk perubahan politik di Iran tipis.\n" +
                        "\n" +
                        "Menurut Somayyeh, kematian Amini adalah serangkaian hal buruk yang terjadi pada perempuan. “Ini adalah hasil dari penindasan selama bertahun-tahun terhadap perempuan Iran,” kata Somayyeh. “Kami bosan dengan Undang-Undang yang diskriminatif, dipandang sebagai warga negara kelas dua. Sekarang, kami menginginkan perubahan politik.”\n" +
                        "\n" +
                        "Somayyeh mengatakan tidak bisa hidup dengan ketakutan bahwa putrinya dapat dilanggar oleh polisi moral dan dibunuh. “Kematian Mahsa menunjukkan bahwa kita harus berjuang melawan aturan ini,” kata dia seperti dikutip Reuters, Kamis, 13 Oktober 2022." ));
                news.add(new News("4 Fakta PM Malaysia Bubarkan Parlemen, Ada Apa Politik Malaysia?", "Teknologi",R.drawable.pmmalay,0,"13-10-2022","Pada Senin, 10 Oktober 2022 pukul 3 sore kemarin, Perdana Menteri atau PM Malaysia Ismail Sabri Yaakob secara resmi mengumumkan pembubaran parlemen atas izin dari Raja Al-Sultan Abdullah Ri'ayatuddin Al-Mustafa Billah Shah.\n" +
                        "\n" +
                        "\"Saya mendorong semua pemerintah negara bagian, kecuali pemerintah Sabah, Sarawak, Johor dan Melaka untuk membubarkan majelis negara bagian masing-masing pada tanggal yang sama dengan Pemilihan Umum di tingkat federal, meskipun beberapa negara bagian telah memutuskan untuk tidak membubarkan diri,\" ujarnya dalam siaran televisi lokal Malaysia.\n" +
                        "\n" +
                        "4 Fakta PM Malaysia Bubarkan Parlemen \n" +
                        "1. Agar bisa menyelenggarakan pemilu lebih cepat\n" +
                        "\n" +
                        "Ismail mengatakan keputusan ini diambil guna membuka jalan bagi pemilihan nasional yang akan diadakan sebelum akhir tahun. Hal ini juga dapat memungkinkan pemungutan suara negara dan nasional dapat diadakan pada waktu yang bersamaan sehingga rakyat tidak terbebani, serta memastikan proses demokrasi berjalan lancar dan biaya berkurang.\n" +
                        "\n" +
                        "Ia mengatakan bahwa tanggal yang ditentukan untuk hari pencalonan, hari pemungutan suara dan hal-hal terkait lainnya akan ditentukan oleh Komisi Pemilihan. “Dengan pengumuman ini, amanah dikembalikan kepada rakyat,” katanya.\n" +
                        "\n" +
                        "\"Mandat rakyat adalah penangkal ampuh bagi negara untuk mencapai stabilitas politik dan menciptakan pemerintahan yang kuat, stabil dan dihormati setelah GE15 (Pemilu ke-15).\" \n" +
                        "\n" +
                        "2. Gelontorkan anggaran jumbo\n" +
                        "\n" +
                        "Terdapat  spekulasi kuat terkait pembubaran parlemen yang akan membuka jalan bagi pemilihan umum ke-15. Jumat lalu, pemerintah Ismail Sabri mengumumkan anggaran jumbo senilai RM 372,3 miliar atau setara Rp 1,2 triliun pada 2023. Ini adalah salah satu anggaran terbesar dalam sejarah Malaysia.\n" +
                        "\n" +
                        "Pemilihan tidak akan dilakukan sampai September 2023. Namun Ismail Sabri telah berada di bawah tekanan dari beberapa faksi dari koalisi yang berkuasa untuk mengadakan pemungutan suara lebih awal.\n" +
                        "\n" +
                        "Baca juga :  Raja Malaysia Kecewa Parlemen Dibubarkan, Tak Punya Pilihan Selain Setuju\n" +
                        "\n" +
                        "3. Tekanan dari UMNO dan kekhawatiran akan banjir\n" +
                        "\n" +
                        "Pada 30 September 2022, partai berkuasa di Malaysia, yakni Organisasi Nasional Melayu Bersatu (UMNO) memutuskan bahwa parlemen mesti segera dibubarkan agar pemilu bisa segera digelar tahun ini. Presiden UMNO Ahmad Zahid Hamidi, yang menghadapi 47 dakwaan pidana pelanggaran kepercayaan, korupsi dan pencucian uang, sangat vokal dalam mendorong jajak pendapat, seolah-olah untuk mencari mandat baru dari rakyat.\n" +
                        "\n" ));
                news.add(new News("Jejak Kamp Tahanan Politik di Indonesia", "Teknologi",R.drawable.rodi,0,"13-10-2022"," Setelah Gerakan 30 September 1965 meletus, pengurus dan simpatisan Partai Komunis Indonesia (PKI) diburu dan ditangkap. Pemerintahan Orde Baru menganggap PKI sebagai dalang percobaan kudeta itu. Korban perburuan itu diperkirakan 500 ribu hingga 3 juta jiwa. Mereka dibunuh atau dipenjarakan di kamp tahanan politik yang tersebar di seluruh Indonesia.\n" +
                        "\n" +
                        "Tak hanya disiksa, para tahanan politik peristiwa 1965 ini menjalani kerja paksa di Pulau Buru, Maluku, Plantungan di Jawa Tengah, hingga penjara Tangerang di Banten.\n" +
                        "\n" +
                        "Kamp-kamp tahanan itu kini nyaris tak dikenali lagi. Semuanya telah beralih fungsi. Ada yang menjadi permukiman dengan bangunan baru, markas tentara, tempat wisata, juga kompleks pusat belanja. Kami menelusuri sejumlah bekas kamp yang berfungsi seperti gulag, kamp kerja paksa era komunisme di Uni Soviet.\n" +
                        "\n" +
                        "Kami menemui sejumlah tahanan politik yang menjalani kerja paksa di kamp-kamp tahanan itu. Kami meminta mereka menceritakan pengalaman mereka selama menghuni kamp tahanan.\n" +
                        "\n" +
                        "Edisi ini kami terbitkan sebagai edisi rutin tiap September-Oktober. Peristiwa 1965 menjadi sejarah gelap Indonesia yang selalu membebani kita. Pemerintah tak kunjung mengungkap kebenaran di baliknya untuk kemudian mengakui ada pelanggaran hak asasi manusia di sana. Pengakuan akan kebenaran peristiwa 1965 penting sebagai langkah selanjutnya dalam rekonsiliasi." ));
                news.add(new News("Turki Marah dengan Ucapan Politikus Jerman Menghina Erdogan", "Teknologi",R.drawable.erdogan,0,"28-09-2022"," Turki memperlihatkan kemarahannya atas ucapan Wakil Presiden German Bundestag Wolfgang Kubicki terhadap Presiden Turki Recep Tayyip Erdogan. Duta Besar Jerman untuk Turki pada Selasa, 27 September 2022, dipanggil untuk menerima nota protes atas ucapan Kubicki.\n" +
                        "\n" +
                        "Kementerian Luar Negeri Turki tidak mempublikasi pernyataan Kubicki yang mana yang mambuat Turki berang. Namun sejumlah media menyebut Kubicki menyebut Presiden Erdogan dengan sebutan tikus got. Erdogan juga disalahkan karena dianggap telah menyebabkan krisis migran di Eropa.\n" +
                        "\n" + "Kantor berita Anadolu mewartakan Juru bicara Kementerian Luar Negeri Turki Tanju Bilgic mengutuk pernyataan Kubicki karena dianggap menghina, yang disampaikan Kubicki saat berkampanye di Lower Saxony.\n" +
                        "\n" +
                        "Menurut Bilgic, ucapan Kubicki tidak bisa diterima dan politikus itu tidak pantas dengan posisinya di parlemen.\n" +
                        "\n" +
                        "“Dia sama sekali tidak memiliki moralitas dan tanggung jawab,” kata Bilgic, merujuk pada ucapan Kubicki.\n" +
                        "\n" +
                        "Saat dikonfirmasi Reuters, Kubicki mengakui dia menyebut Presiden Erdogan dengan sebutan tikus got saat berpidato di sebuah kampanye. Kubicki adalah politikus yang berasal dari Partai Kebebasan Demokrat, yakni salah satu partai yang berkuasa di Jerman.\n" +
                        "\n" +
                        "Kubicki mengatakan dia mencoba menarik perhatian warga, dengan menyoroti naiknya jumlah pengungsi ilegal yang pindah ke Jerman dari Turki, di mana hal ini diyakini Kubicki bisa memicu krisis migran.\n" +
                        "\n" ));


            }
        }
        else if(detailUser.kategori.equals("Kesehatan")){
            if (detailUser.umur >= 18){
                news.add(new News("Perlunya Interaksi Sosial secara Langsung di Era Digital Demi Kesehatan Mental", "Kesehatan",R.drawable.mental,18,"14-10-2022"," Kemajuan di era digital membuat banyak hal lebih praktis dan mudah, termasuk komunikasi yang bisa dilakukan lewat media sosial atau aplikasi pesan singkat. Namun, interaksi sosial secara langsung tetap diperlukan demi kesehatan mental di tengah kemudahan berinteraksi antarindividu lewat internet. Begitu kata spesialis kedokteran jiwa Zulvia Oktanida Syarif dari Universitas Indonesia.\n" +
                        "\n" +
                        "\"Kemudahan untuk berinteraksi melalui internet sering kali membuat interaksi sosial secara langsung dilupakan. Padahal, keduanya memiliki dampak yang berbeda,\" kata salah satu pengurus pusat Perhimpunan Dokter Spesialis Kedokteran Jiwa Indonesia (PDSKJ) itu.\n" +
                        "\n" +
                        "Dokter yang akrab disapa Vivi ini menjelaskan media sosial mengubah cara orang memandang diri, bentuk tubuh, pencapaian, dan lain sebagainya. Padahal, apa yang ditampilkan di media sosial belum tentu sesuai dengan apa yang terjadi di dunia nyata. Hal itu meningkatkan kecenderungan orang membandingkan diri dengan apa yang dilihat sempurna di media sosial.\n" +
                        "\n" +
                        "\"Cyberbullying dan cybercrime juga rentan terjadi di masa ini. Berbagai hal yang telah disebutkan tadi dapat mempengaruhi kesehatan mental seseorang,\" ujarnya.\n" +
                        "\n" +
                        "Jangan lupakan komunikasi langsung\n" +
                        "Untuk mengatasi permasalahan tersebut, dia mengimbau masyarakat tidak melupakan komunikasi dan interaksi sosial secara langsung serta membatasi diri dalam mengakses internet serta media sosial.\n" +
                        "\n" ));
                news.add(new News("Kaitan Pemakaian Bra degan Kesehatan Payudara", "Politik",R.drawable.bra,18,"15-10-2022","Bra berfungsi sebagai penopang payudara. Tapi banyak yang mengaitkan penggunaan bra dengan kesehatan payudara. Padahal, bra takkan memberikan masalah bila bahannya nyaman dan ukurannya sesuai.\n" +
                        "\n" +
                        "Demikian diungkapkan dokter spesialis bedah onkologi dari Universitas Indonesia, Farida Briani Sobri. \"Tidak masalah merek atau warna, tapi pilih yang nyaman, ukuran sesuai karena bra itu tujuannya menopang,\" kata Farida dilansir dari Antara, Kamis, 13 Oktober 2022. \n" +
                        "\n" +
                        "Terkait Hari Tanpa Bra pada 13 Oktober yang berlangsung di tengah bulan kesadaran kanker payudara, dia mengatakan kebiasaan tidak memakai bra bisa saja dilakukan untuk pemilik payudara berukuran kecil.\n" +
                        "\n" +
                        "Sebaliknya, perempuan yang memiliki payudara berukuran sangat besar akan merasa lebih nyaman saat memakai bra. Sebab, mereka bisa merasa nyeri bila buah dadanya tidak ditopang dengan bra.\n" +
                        "\n" +
                        "\"Karena akan membebani otot di belakang payudara, namanya otot pektoralis,\" katanya.\n" +
                        "\n" +
                        "Dia meyakinkan pemakaian bra takkan mempengaruhi munculnya masalah kulit atau sirkulasi darah bila bahannya nyaman dan menyerap keringat serta ukuran sudah sesuai.\n" +
                        "\n" +
                        "\"Selama bra tidak terlalu ketat, sirkulasi takkan terganggu,\" katanya.\n" +
                        "\n" +
                        "Penting juga untuk menjaga kebersihan dengan cara rajin mengganti bra agar tidak menimbulkan masalah di kulit.\n" +
                        "\n" +
                        "Mengenai pemakaian bra saat tidur, Farida mengatakan boleh saja tidur tanpa bra bila hal itu dirasa lebih nyaman.\n" +
                        "\n" +
                        "\"BH itu kan menopang payudara saat aktivitas dan ada gravitasi agar bisa beraktivitas dengan nyaman,\" katanya.\n" +
                        "\n" +
                        "Jadi, wajar bila ada perempuan yang memilih untuk tidur tanpa bra demi kenyamanan. Namun, semua kembali lagi kepada tiap individu. Ada juga perempuan yang punya buah dada berukuran besar dan merasa lebih nyaman menggunakan bra agar payudara tidak menggelambir saat berbaring.\n" +
                        "\n" +
                        "\"Jadi ada yang nyaman pakai bra saat tidur,\" katanya.\n" +
                        "\n" +
                        "Payudara padat\n" +
                        "\n" +
                        "Mengenai tampilan payudara, ada banyak faktor yang mempengaruhi bentuk payudara, salah satunya nutrisi. Gizi yang bagus mempengaruhi jaringan ikat, yang mempertahankan struktur anatomi payudara, agar lebih sehat.\n" +
                        "\n" +
                        "\"Ketika perempuan menua dan payudara sudah kendur, lebih ke jaringan ikat sudah berkurang,\" jelas dia.\n" +
                        "\n" +
                        "Faktor-faktor yang mempengaruhi meliputi nutrisi, genetik, penopang seperti bra, pola hidup sehat serta postur tubuh juga kesehatan seseorang. Ia menambahkan hamil dan melahirkan bukan faktor penentu yang menyebabkan payudara menjadi kendur.\n" +
                        "\n" +
                        "\"Ada banyak orang yang setelah melahirkan payudaranya juga tetap bagus,\" kata dia.\n" +
                        "\n" +
                        "Di tengah maraknya makanan yang diklaim mengandung kolagen, dia mengatakan belum ada penelitian apakah asupan kolagen dari makanan akan menyokong kolagen di jaringan ikat payudara.\n" +
                        "\n" +
                        "Ada penelitian yang menyatakan asupan oral kolagen dalam jangka pendek dan panjang mungkin mempengaruhi penyembuhan luka serta mengurangi kecepatan penuaan kulit. Suplemen oral kolagen juga disebut dapat menghidrasi kulit dan meningkatkan elastisitas.\n" +
                        "\n" +
                        "Namun, belum ada penelitian yang mengaitkan asupan kolagen dan kepadatan payudara.\n" +
                        "\n" +
                        "\"Kalau mau ngomong payudara, jaringan yang bikin melorot dan tegak itu bukan semata kulit, tapi jaringan ikat yang ada di dalam kulit,\" kata Farida.\n" +
                        "\n" +
                        "Hari Tanpa Bra, kata dia, dibuat untuk mendorong kesadaran terhadap kanker payudara. Para perempuan diajak untuk mengenali payudara mereka saat tanpa bra, memeriksa payudara sendiri untuk mendeteksi bila ada gejala-gejala yang patut diwaspadai seperti benjolan atau cairan abnormal dari puting." ));
                news.add(new News("Ibu Hamil dengan Diabetes, Penting Lakukan Cek Kesehatan Mata Sejak Dini", "Kesehatan",R.drawable.hamil,18,"13-10-2022"," CANTIKA.COM, Jakarta - Dokter Spesialis Mata Konsultan RSCM Gitalisa Andayani mengimbau agar para ibu hamil yang juga pasien diabetes untuk segera memeriksa kesehatan mata mereka sejak dini. Hal ini untuk mengetahui apakah ada gangguan seperti retinopati diabetik, sehingga bisa diatasi sejak awal.\n" +
                        "\n" +
                        "Retinopati diabetik adalah salah satu komplikasi pada mata yang terjadi pada penderita diabetes. Ini adalah penyakit pada pembuluh darah kecil, penyebab utama kebutaan pada populasi usia kerja.\n" +
                        "\n" +
                        "\"Sebaiknya sebelum hamil atau saat trimester pertama, gangguan retina sudah terdeteksi,\" kata Gitalisa dalam konferensi pers daring bertajuk World Sight Day 2022: Hindari, Cegah, dan Kontrol Komplikasi Mata pada Pasien Diabetes Melitus, Selasa 11 Okotber 2022.\n" +
                        "\n" +
                        "Jika memang ada gangguan, segera tangani sejak awal agar retinopati diabetik dapat diobati. Sebab, gangguan kesehatan mata ini pada ibu hamil berisiko mengancam penglihatan.\n" +
                        "\n" +
                        "Menurut Gitalisa, kondisi kesehatan juga tetap harus dimonitor secara ketat setelah melahirkan. Ia menambahkan retinopati diabetik tidak diturunkan kepada janin yang dilahirkan. \"Kecuali kalau anak diabetes, setelah beberapa tahun bisa berisiko retinopati,\" katanya.\n" +
                        "\n" +
                        "Sebanyak satu dari tiga orang dengan diabetes akan berkembang retinopati pada mata dalam hidupnya di dunia, kata dia.\n" +
                        "\n" +
                        "Retinopati diabetik disebabkan tingginya kadar gula dalam darah yang merusak pembuluh darah pemberi suplai darah ke retina di belakang mata.\n" +
                        "\n" +
                        "Akibatnya, pembuluh darah retina melemah, mudah bocor, serta menyebabkan pembengkakan dan penebalan retina.\n" +
                        "\n" +
                        "Pembengkakan yang terjadi di makula, bagian tengah retina yang penting untuk pusat penglihatan jelas, disebut Diabetik Makula Edema (DME).\n" +
                        "\n" +
                        "Kehilangan penglihatan akibat komplikasi diabetes akan mengganggu kualitas hidup, dapat menimbulkan depresi, rasa cemas hingga mempengaruhi pekerjaan bila sehari-hari bergantung kepada penglihatan.\n" +
                        "\n" +
                        "Risiko DME semakin besar pada pasien yang menderita diabetes dalam waktu lama. Jika tidak diobati, pasien bisa mengalami kebutaan.\n" +
                        "\n" +
                        "Oleh karena itu, Gitalisa mengajak masyarakat untuk mencegah risiko diabetes melitus dengan cara menjaga pola hidup sehat, diet makanan penuh gizi juga olahraga secara teratur.\n" +
                        "\n" +
                        "Jika sudah terlanjur terkena diabetes, jangan berkecil hati karena risiko komplikasi dapat ditekan dengan menjalankan gaya hidup sehat dan mengendalikan penyakit dengan cara disiplin minum obat. Kendalikan juga penyakit penyerta seperti hipertensi dan kolesterol.\n" +
                        "\n" +
                        "Pasien yang sudah terkena diabetes melitus diimbau untuk memeriksakan mata setidaknya setahun sekali di fasilitas kesehatan sekunder atau tersier yang peralatannya lebih lengkap, sehingga gangguan mata bisa dideteksi sejak dini." ));
                news.add(new News("Masalah Finansial Bisa Jadi Faktor Gangguan Kesehatan Mental", "Kesehatan",R.drawable.faktor,18,"15-10-2022"," CANTIKA.COM, Jakarta - Gangguan kesehatan mental saat ini masih menjadi salah satu isu kesehatan yang sangat diperhatikan di seluruh dunia.\n" +
                        "\n" +
                        "Organisasi Kesehatan Dunia (WHO) bahkan menyatakan bahwa pandemi COVID-19 telah memperburuk kondisi kesehatan mental dunia dan menciptakan krisis global untuk kesehatan mental jangka pendek dan jangka panjang.\n" +
                        "\n" +
                        "Riset Kesehatan Dasar (Riskesdas) 2018, menunjukkan lebih dari 19 juta penduduk berusia lebih dari 15 tahun mengalami gangguan mental emosional, dan lebih dari 12 juta penduduk berusia lebih dari 15 tahun mengalami depresi.\n" +
                        "\n" +
                        "Berdasarkan survei, Populix menyimpulkan bahwa masalah finansial (59 persen) dan merasa kesepian (46 persen) merupakan faktor utama yang memicu munculnya gejala-gejala gangguan kesehatan mental. \"Berbagai masalah seperti kondisi perekonomian yang tidak menentu, rasa kesepian setelah sekian lama menjalani pembatasan sosial, tuntutan pekerjaan, hingga permasalahan hubungan yang timbul di masa-masa transisi endemi ini, tentunya turut mempengaruhi kesehatan mental banyak orang,\" kata Co-Founder dan COO Populix Eileen Kamtawijoyo dalam siaran resmi, Senin 11 Oktober 2022.\n" +
                        "\n" +
                        "Survei dilakukan terhadap 1.005 laki-laki dan perempuan berusia 18 hingga 54 tahun di Indonesia dan terangkum dalam laporan “Indonesia’s Mental Health State and Access to Medical Assistance”.\n" +
                        "\n" +
                        "Ia menyatakan survei menunjukkan bahwa 52 persen masyarakat Indonesia, terutama perempuan berusia 18-24 tahun, menyadari bahwa mereka memiliki gejala gangguan kesehatan mental, baik dalam bentuk gejala ringan maupun berat. Mayoritas dari para responden juga menyadari bahwa telah mengalami gejala tersebut dalam 6 bulan terakhir.\n" +
                        "\n" +
                        "1. Gejala gangguan kesehatan mental\n" +
                        "Hasil survei menemukan bahwa perubahan suasana hati yang cepat adalah gejala yang paling sering dialami 57 persen responden dalam 6 bulan terakhir, diikuti perubahan kualitas tidur atau nafsu makan (56 persen), rasa lelah yang signifikan, energi menurun (42 persen), ketakutan atau kegelisahan yang berlebihan (40 persen), merasa bingung, pelupa, sering marah, mudah tersinggung, cemas, kesal, khawatir, dan ketakutan yang tidak normal (37 persen).\n" +
                        "\n" +
                        "Gejala lainnya adalah kehilangan kemampuan untuk berkonsentrasi (35 persen), penarikan diri dari lingkungan sosial (30 persen), serta ketidakmampuan untuk mengatasi stres atau masalah sehari-hari (26 persen).\n" +
                        "\n" +
                        "Beberapa responden juga merasakan gejala dalam tingkat yang lebih parah seperti mengalami nyeri yang tidak dapat dijelaskan (13 persen), marah berlebihan dan rentan melakukan kekerasan (10 persen), berteriak atau berkelahi dengan keluarga dan teman-teman (9 persen), dan ingin melukai diri sendiri (9 persen), dan mencoba bunuh diri (6 persen).\n" +
                        "\n" +
                        "Dari berbagai gejala gangguan kesehatan mental tersebut, survei memperlihatkan sebagian responden mengalami gejala-gejala tersebut setidaknya 2 hingga 3 kali dalam seminggu (42 persen).\n" +
                        "\n" +
                        "Bahkan, 16 persen responden menyatakan mengalami gejala tersebut setiap hari. Apabila terus dibiarkan, gejala-gejala tersebut dapat berpotensi mengganggu aktivitas dan produktivitas sehari-hari, bahkan dalam kasus yang lebih parah, mengancam keselamatan jiwa seseorang.\n" +
                        "\n" +
                        "2. Faktor pemicu dan cara mengatasi\n" +
                        "Masalah finansial (59 persen) dan merasa kesepian (46 persen) merupakan faktor utama yang memicu munculnya gejala-gejala gangguan kesehatan mental tersebut. Selain itu, masih terdapat juga beberapa faktor lainnya seperti tekanan pekerjaan (37 persen), trauma masa lalu (28 persen), tekanan dari pasangan (17 persen), tinggal di lingkungan yang buruk (13 persen), serta mengalami diskriminasi dan stigma (10 persen).\n" +
                        "\n" +
                        "Untuk mengurangi gejala gangguan kesehatan mental yang dirasakan, 73 persen masyarakat mengatakan mereka akan lebih mendekatkan diri kepada Tuhan, menjaga kecukupan tidur dan istirahat (55 persen), rekreasi (46 persen), melakukan aktivitas fisik agar tetap aktif (36 persen), bercerita kepada sahabat (34 persen), menjaga hubungan baik dengan orang lain (32 persen), membantu orang lain dengan tulus (27 persen), dan melakukan meditasi (19 persen).\n" +
                        "\n" +
                        "Di tengah meningkatnya berbagai akses dan layanan kesehatan mental akhir-akhir ini, survei menunjukkan bahwa 69 persen masyarakat yang mengalami gejala gangguan kesehatan mental tidak pernah menggunakan layanan tersebut karena berbagai alasan.\n" +
                        "\n" +
                        "Beberapa alasan utama yang mereka sampaikan adalah merasa tidak perlu untuk melakukan konsultasi (45 persen), meyakini bisa mencari jalan keluar sendiri (42 persen), biaya mahal (41 persen), dan malu untuk bercerita kepada orang tidak dikenal (33 persen). Namun demikian, sebagian masyarakat juga mengaku bahwa mereka tidak tahu adanya layanan kesehatan mental (27 persen).\n" +
                        "\n" +
                        "Selanjutnya, dari 31 persen masyarakat yang pernah mencoba layanan kesehatan mental mengatakan bahwa mereka mencoba layanan tersebut karena mudah diakses (63 persen), tenaga kesehatannya mempunyai kemampuan berkomunikasi yang baik (59 persen), biaya terjangkau (57 persen), mempunyai reputasi pelayanan yang baik (47 persen), serta mengikuti rekomendasi dari teman, keluarga, pemengaruh (37 persen).\n" +
                        "\n" +
                        "Tipe layanan kesehatan yang dipilih adalah konsultasi dengan psikolog/psikiater di klinik kesehatan terdekat (61 persen), mengakses telemedisin melalui aplikasi daring (54 persen), bergabung dengan komunitas sosial yang peduli dengan kesehatan mental (38 persen), dan konsultasi dengan pemuka agama (36 persen).\n" +
                        "\n" +
                        "\"Selain meratakan akses terhadap fasilitas dan dukungan kesehatan mental, edukasi dari berbagai pihak juga masih diperlukan guna menghapus stigma negatif terhadap gangguan kesehatan mental,” kata Eileen.\n" +
                        "\n" +
                        "Berbagai kenyataan dari survei di atas diharapkan bisa menjadi referensi dan memotivasi masyarakat untuk lebih peduli dengan kesehatan mentalnya, dan memiliki kesadaran penuh untuk memperbaiki dan meningkatkan kesehatan jiwanya." ));
                news.add(new News("Didanai Kemendikbud, Mahasiswa Unesa Gagas Program Kesehatan di Eks Lokalisasi Dolly", "Kesehatan",R.drawable.dolly,18,"14-10-2022","TEMPO.CO, Jakarta -  Himpunan Mahasiswa Jurusan Pendidikan Kesehatan dan Rekreasi (HMJ Penkesrek) Fakultas Ilmu Olahraga (FIO) Universitas Negeri Surabaya (Unesa) menggagas program ”Healthy and Inclusive Community”. Program tersebut adalah upaya penguatan kesehatan dan pemberdayaan masyarakat di kawasan eks lokalisasi Dolly, Putat Jaya, Surabaya.\n" +
                        "\n" +
                        "Program ini mendapat pendanaan dari Direktorat Jenderal Pendidikan Tinggi, Riset, dan Teknologi  Kementerian Pendidikan. Dosen pembimbing Yetty Septiani Mustar menjelaskan program ‘Healthy and Inclusive Community’ ini terdiri dari program pengembangan olahraga masyarakat (Kembang Gamas) dengan tujuan mengajak masyarakat aktif bergerak dalam melakukan aktifitas fisik di dalam maupun luar rumah.\n" +
                        "\n" +
                        "Ini dilakukan melalui beberapa kegiatan yaitu sosialisasi mengenai bidang olahraga usia dini, remaja, lansia, dan anak berkebutuhan khusus. Edukasi dan pengajaran olahraga usia dini di TK diselenggarakan di RW 08 Kelurahan Putat Jaya dan monitoring kebugaran jasmani masyarakat setempat. Selain itu juga penerapan olahraga rutin seperti senam aerobik, yoga, dan jalan sehat.\n" +
                        "\n" +
                        "\"Program lainnya berupa kampung bersih, sehat dan asri atau Kampung Berseri dengan mengadakan kegiatan sosialisasi tentang menjaga kebersihan lingkungan, pelatihan pengelolaan sampah (bank sampah) dan penghijauan dan penanaman tanaman obat keluarga serta sosialisasi pos binaan terpadu,\" ujarnya dilansir dari laman resmi Unesa pada Ahad, 9 Oktober 2022.\n" +
                        "\n" ));
                news.add(new News("Cek Tarif iuran BPJS Kesehatan Kelas 1, 2, dan 3 Terbaru 2022", "Kesehatan",R.drawable.bpjs,18,"14-10-2022","\n" +
                        "TEMPO.CO, Jakarta - Besaran iuran BPJS Kesehatan kelas 1, 2, dan 3 masih menjadi pertanyaan masyarakat apakah ada perubahan per Oktober 2022. Lantaran, pemerintah sebelumnya berencana menghapus kelas-kelas tersebut menjadi KRIS (Kelas Rawat Inap Standar). Uji coba KRIS sudah diwacanakan sejak 1 Juli 2022 lalu.\n" +
                        "\n" +
                        "Iuran BPJS Kesehatan\n" +
                        "Iuran BPJS Kesehatan adalah sejumlah uang yang harus disetorkan peserta supaya dapat menikmati layanan. Layanan kesehatan yang dimaksud meliputi penanganan penyakit yang ditanggung BPJS Kesehatan, perawatan, pemberian obat, dan banyak lainnya. Sehingga dengan mengikuti keanggotaan BPJS Kesehatan, negara menjamin pengobatan medis masyarakat.\n" +
                        "\n" +
                        "Pelaksanaan uji coba KRIS baru diterapkan di 5 rumah sakit milik pemerintah. Selanjutnya, 2.800 rumah sakit yang tersebar di penjuru Indonesia juga akan melaksanakan KRIS secara bertahap. Pasalnya, rumah-rumah sakit tersebut melayani peserta Jaminan Kesehatan Nasional pula.\n" +
                        "\n" +
                        "Baca: Apakah Iuran BPJS Kesehatan Terpengaruh oleh Kenaikan Tarif INA CBGs? Ini Penjelasan Direktur BPJS\n" +
                        "\n" +
                        "Untuk saat ini, skema dan nominal iuran BPJS Kesehatan masih sama dengan peraturan sebelumnya. Berdasarkan Peraturan Presiden (Perpres) No. 64 tahun 2020 mengenai perubahan kedua dari Perpres No. 82 tahun 2018 tentang iuran ditentukan oleh jenis kepesertaan.\n" +
                        "\n" +
                        "Tarif Iuran BPJS Kesehatan Kelas 1, 2, dan 3\n" +
                        "Bagi peserta BPJS Kesehatan dari kelompok Pekerja Penerima Upah (PPU), seperti ASN, POLRI, dan TNI memiliki besaran iuran yang berbeda. Biaya iuran yang dibebankan sebesar 5 persen dari gaji dengan rincian 4 persen dibayarkan instansi dan 1 persen dari pemotongan upah. Serta berlaku batas maksimal upah, yakni 12 juta rupiah.\n" +
                        "\n" +
                        "Sementara itu, golongan peserta informal yang dibagi menjadi Pekerja Bukan Penerima Upah (PBPU) dan masyarakat Bukan Pekerja (BP) mempunyai ketentuan pembayaran iuran BPJS Kesehatan yang berbeda. Adapun uraiannya sebagai berikut.\n" +
                        "\n" +
                        "-  Kelas 1 senilai Rp 150.000 untuk setiap peserta per bulan.\n" +
                        "\n" +
                        "-  Kelas 2 senilai Rp 100.000 untuk setiap peserta per bulan.\n" +
                        "\n" +
                        "-  Kelas 3 senilai Rp 35.000 untuk setiap peserta per bulan. Bagi kelas 3, mendapatkan subsidi sebesar Rp 7.000, dari tarif sebelumnya, yaitu Rp 42.000.\n" +
                        "\n" +
                        "Untuk masyarakat yang tidak memiliki pendapatan dapat memilih peserta PBPU kelas 1, 2, maupun 3. Atau apabila tergolong miskin didasarkan Data Terpadu Kesejahteraan Sosial (DTKS) bisa mendaftar BPJS Kesehatan kelas 3 dengan iuran dibayarkan oleh pemerintah.\n" +
                        "\n" +
                        "Fasilitas dan Pelayanan BPJS Kesehatan\n" +
                        "Setelah mengetahui tarif iuran BPJS Kesehatan kelas 1, 2, dan 3. Kini saatnya peserta perlu memahami pemberian layanan rawat inap yang juga masih tetap berpatokan pada ketentuan kelas sebelumnya, meliputi:\n" +
                        "\n" +
                        "-       Kelas 1 memperoleh ruang rawat inap sekitar 2-4 orang dalam satu ruangan.\n" +
                        "\n" +
                        "-       Kelas 2 memperoleh ruang rawat inap sekitar 3-5 orang dalam satu ruangan.\n" +
                        "\n" +
                        "-       Kelas 3 memperoleh ruang rawat inap sekitar 4-6 orang dalam satu ruangan.\n" +
                        "\n" +
                        "Selain itu, setiap peserta BPJS Kesehatan juga berhak mendapatkan pelayanan dari faskes yang bermitra dengan JKN. Pelayanan tersebut terdiri dari konsultasi tenaga kesehatan, pemeriksaan laboratorium, radiologi, obat formularium nasional, dan obat non formularium nasional." ));
            }
            else{
                news.add(new News("4 Efek Negatif Melewatkan Makan Siang bagi Kesehatan", "Kesehatan",R.drawable.empat,0,"14-10-2022","TEMPO.CO, Jakarta - Tidak sedikit orang kerap melewatkan jam makan, salah satunya makan siang. Padahal makan siang menyimpan segudang manfaat, mulai dari memberiikan kebutuhan nutrisi dan kalori hingga bahan bakar untuk beraktivitas hingga petang.\n" +
                        "\n" +
                        "Kebiasaan melewatkan makan siang yang dilakukan secara konsisten dalam jangka waktu lama memberikan efek buruk bagi kesehatan. Tidak makan siang menyebabkan stres ketika memasuki waktu malam hari.\n" +
                        "\n" +
                        "Melansir eatthis.com, makan siang merupakan komponen kunci yang membentuk sepertiga atau lebih dari makanan harian. Lantas, apa bahaya melewatkan makan siang bagi tubuh?\n" +
                        "\n" +
                        "1. Turunkan produktivitas\n" +
                        "\n" +
                        "Makan siang merupakan bahan bakar penting bagi tubuh untuk tetap beraktivitas hingga sore dan memberikan rasa relaks pada malam hari. Namun ketika melewatkan jam makan siang, tubuh akan menyebabkan tubuh tidak fokus ketika menjalankan aktivitas. Selain itu, menu makan siang turut memengaruhi kemampuan tubuh untuk fokus sehingga penting memilih menu makan siang yang benar.\n" +
                        "\n" +
                        "2. Obesitas\n" +
                        "\n" +
                        "Tidak makan siang membuat tubuh lebih mudah lapar, terutama ketika menjelang malam hari. Hal ini berarti asupan kalori pun lebih banyak sehingga berpotensi menyebabkan obesitas yang berpotensi mengalami obesitas. Selain itu, hal tersebut juga bisa mengganggu ritme tidur pada malam hari\n" +
                        "\n" +
                        "3. Timbulkan rasa cemas\n" +
                        "\n" +
                        "Melewatkan maka siang dapat mempengaruhi kesehatan mental. Melansir piedmont.org, ketika tubuh tidak diisi makananan dalam jangka waktu yang lama, menyebabkan gula darah tubuh menurun. Kondiai ini mendorong tubuh mmemproduksi kortisol atau 'hormon stres’. Hormon ini dilepaskan untuk membantu mengatur penurunan gula darah. Namun di sisi lain, hormin ini juga menciptakan respons stres dalam tubuh. Hal ini membuat tubuh tidak hanya mengalami kecemasan atau tertekan, tetapi juga murung, mudah tersinggung, dan letih.\n" +
                        "\n" +
                        "4. Gangguan pencernaan\n" +
                        "\n" +
                        "Melansir eatingwell.com, gangguan pencernaan bisa terjadi apabila memiliki kebiasaan melewatkan makan siang. Gangguan pencernaan yang terjadi, mulai dari mual, diare, hingga sembelit. Hal ini karena tubuh mengeluarkan hormon kortisol yang berfungsi menormalkan gula darah ketika lapar. Efek lain dari produksi hormon kortisol oleh tubuh adalah respons stres yang dihasilkan tubuh makin tinggi yang bisa mengganggu sistem perncernaan." ));
                news.add(new News("5 Manfaat Kacang Macadamia untuk Tubuh, Jaga Kesehatan Usus dan Tulang", "Kesehatan",R.drawable.kacang,0,"14-10-2022","" ));
                news.add(new News("Didanai Kemendikbud, Mahasiswa Unesa Gagas Program Kesehatan di Eks Lokalisasi Dolly", "Kesehatan",R.drawable.dolly,0,"13-10-2022","CANTIKA.COM, Jakarta - Mengonsumsi kacang secara teratur jadi tren pola makan sehat akhir-akhir ini. Tapi sayangnya, manfaat kacang macadamia tak terlalu besar gaungnya di antara jenis kacang populer yang di masyarakat seperti kacang almond, kenari, hingga mete. Padahal, kacang yang berasal dari Australia ini kaya nutrisi untuk kesehatan tubuh.\n" +
                        "\n" +
                        "Berkat kandungan antioksidan, serat, hingga kalsium, kacang macadamia bisa bantu menurunkan berat badan hingga menyehatkan tulang. Untuk lebih lengkapnya, berikut sederet manfaat kacang macadamia untuk kesehatan tubuh yang sayang untuk dilewatkan.\n" +
                        "\n" +
                        "1. Melawan Radikal Bebas\n" +
                        "Kacang yang juga dapat ditemukan di beberapa bagian Amerika Latin, Asia, dan Afrika ini kaya antioksidan. Radikal bebas, bahan kimia yang dapat merusak sel-sel sehat dan dianggap bertanggung jawab atas apa pun mulai dari penuaan hingga masalah jantung, dapat dinetralkan oleh antioksidan.\n" +
                        "\n" +
                        "2. Bantu Menurunkan Berat Badan\n" +
                        "Kacang macadamia juga kaya serat dan protein, sehingga dapat membuat Anda kenyang lebih lama dan membantu Anda berhenti ngemil. Selain itu, kacang macadamia mengandung lemak tak jenuh tunggal, khususnya asam palmitoleat omega-7. Lemak tersebut telah ditunjukkan dalam uji coba pada hewan untuk mencegah penambahan berat badan yang tidak diinginkan. Kacang macadamia tampaknya menjadi suplemen yang berguna dalam upaya Anda menurunkan berat badan.\n" +
                        "\n" +
                        "3. Kaya Nutrisi\n" +
                        "Kacang macadamia merupakan sumber vitamin, mineral, dan nutrisi penting lainnya. Mengonsumsi kacang macadamia adalah pendekatan cepat dan sederhana untuk meningkatkan konsumsi nutrisi spesifik Anda, jika Anda perlu menebus defisit dalam sistem Anda.\n" +
                        "\n" +
                        "4. Memperkuat Tulang\n" +
                        "Macadamia juga kaya kalsium, magnesium, dan potasium, tiga nutrisi penting untuk tulang yang kuat. Selain itu, kandungan fosfor di dalamnya dapat mendorong mineralisasi tulang dan gigi.\n" +
                        "\n" +
                        "5. Mengoptimalkan Kesehatan Usus\n" +
                        "Salah satu manfaat kacang macadamia adalah dapat menjaga kesehatan usus. Kacang ini kaya akan serat, baik untuk pencernaan sekaligus mendukung bakteri usus yang sehat. Tak hanya itu, juga dapat mengurangi peradangan di seluruh tubuh Anda dan melindungi Anda dari gangguan perut." ));
                news.add(new News("Tips Menjaga Kesehatan Mental di Media Sosial, Jangan Oversharing", "Kesehatan",R.drawable.sosmed,0,"12-10-2022","CANTIKA.COM, Jakarta - Hari Kesehatan Jiwa Sedunia yang jatuh pada 10 Oktober lalu merupakan momen yang tepat untuk mengingatkan semua orang di seluruh dunia untuk menjaga kesehatan mental terutama di era media sosial.\n" +
                        "\n" +
                        "Pasalnya, di samping memiliki banyak manfaat untuk kehidupan sehari-hari, media sosial juga memiliki sisi negatif seperti menimbulkan kecemasan, ketakutan akan kehilangan, stres, cyberbullying, dan lain sebagainya.\n" +
                        "\n" +
                        "Untuk mencegah hal-hal negatif tersebut, berikut ini ada beberapa tips yang bisa Anda lakukan, dikutip dari siaran pers Kaspersky.\n" +
                        "\n" +
                        "1. Jangan oversharing\n" +
                        "Oversharing atau berbagi secara berlebihan dapat membuat Anda lebih rentan terhadap kritik dari orang lain, yang dapat memperburuk kecemasan.\n" +
                        "\n" +
                        "Alasan lainnya, adalah untuk melindungi data pribadi dari orang asing. Misalnya, pengguna dapat secara tidak sengaja meninggalkan detail tiket penerbangan atau data lain seperti alamat pribadi pada foto liburan, yang memberikan kesempatan bagi para penipu untuk menggunakan data pribadi Anda.\n" +
                        "\n" +
                        "2. Pelajari cara menghadapi komentar ekstrem\n" +
                        "Tak bisa dipungkiri bahwa Anda bisa saja menghadapi orang-orang yang mengganggu atau membenci Anda jika Anda mengunggah banyak konten di media sosial.\n" +
                        "\n" +
                        "Para ahli pun menyarankan untuk tidak menanggapi komentar buruk atau menyakitkan ke dalam hati. Selain itu, Anda juga bisa menghapus komentar negatif, melaporkan komentar tersebut, atau bahkan menonaktifkan komentar jika diperlukan.\n" +
                        "\n" +
                        "Bantuan tambahan bisa berupa istirahat sejenak dan detoks digital untuk menjauhkan diri dari jejaring sosial, sehingga Anda dapat bersantai dan fokus pada diri sendiri.\n" +
                        "\n" +
                        "3. Jadikan akun media sosial Anda sebagai akun pribadi\n" +
                        "Untuk mengurangi risiko bertemu pembenci atau berbagi informasi sensitif, pertahanan yang baik adalah dengan meningkatkan tingkat privasi akun. Sehingga, menjadikan akun media sosial Anda sebagai akun pribadi bisa jadi salah satu pilihan tepat.\n" +
                        "\n" +
                        "Perlu dicatat juga bahwa setiap jejaring sosial memiliki pengaturan privasi yang berbeda, sehingga Anda harus meluangkan waktu untuk mempelajari dan memahami kebijakan-kebijakan yang berlaku di aplikasi media sosial yang Anda gunakan." ));
                news.add(new News("Jangan Buang Kulit Lemon, Ketahui 5 Khasiatnya untuk Menjaga Kesehatan", "Kesehatan",R.drawable.lemon,0,"14-10-2022","TEMPO.CO, Jakarta - Lemon termasuk salah satu buah yang hampir selalu ada di dapur, Jus asamnya sering menjadi bagian dari bahan makanan atau minuman. Lemon dikenal mengandung elektrolit dan 90 persen air. Tapi pernahkan berpikir bahwa bagian yang paling bermanfaat dare lemon adalah kulitnya? Secara nutrisi, kulit lemon lebih manjur daripada seluruh buah terutama untuk detoksifikasi.\n" +
                        "\n" +
                        "Inilah khasiat kulit lemon yang sayang jika dihilangkan. \n" +
                        "\n" +
                        "1. Menyehatkan mulut\n" +
                        "\n" +
                        "Lemon sangat bagus untuk menjaga kebersihan mulut dan kesehatan gigi. Kekurangan vitamin C dikaitkan dengan penyakit kudis, radang gusi, dan gusi berdarah. Namun, karena kulitnya mengandung banyak vitamin C, mengonsumsinya dalam berbagai bentuk, termasuk teh atau air kulit lemon, dapat membantu mencegah masalah gigi seperti gigi berlubang dan abses.\n" +
                        "\n" +
                        "2. Meningkatkan kesehatan tulang \n" +
                        "\n" +
                        "Karena kandungan kalsium dan vitamin C yang tinggi, yang merupakan komponen penting dari tulang dan sistem kerangka tubuh, kulit lemon membantu meningkatkan kesehatan tulang. Kulit buah ini tinggi asam askorbat sehingga memiliki kemampuan untuk mengobati dan mencegah masalah tulang.\n" +
                        "\n" +
                        "3. Detoksifikasi tubuh dan obati stres oksidatif\n" +
                        "\n" +
                        "Vitamin C yang berlimpah dalam kulit lemon membantu mengatasi radikal bebas atau racun yang tercipta selama stres atau proses biologis tertentu yang terkait dengan kematian sel dan penuaan. Vitamin C sebagai antioksidan untuk mencegah kerusakan sel, membantu detoksifikasi metabolik dan pengurangan stres. Manfaat lain dari bioflavonoid sitrus termasuk menurunkan stres oksidatif, yang jika tidak diobati, dapat menyebabkan kanker.\n" +
                        "\n" +
                        "4. Menurunkan kolesterol dan mencegah penyakit jantung\n" +
                        "\n" +
                        "Karena adanya flavonoid, vitamin C, dan pektin, kulit lemon dapat membantu mengelola penyakit kardiovaskular dengan mencegah diabetes, penyakit jantung, dan meningkatkan sirkulasi darah. Kalium di dalamnya juga diperlukan untuk mengontrol tekanan darah.\n" +
                        "\n" +
                        "5. Diduga memiliki sifat antikanker\n" +
                        "\n" +
                        "Karena zat yang dikandungnya, termasuk salvestrol Q40 dan limonene, kulit lemon telah dikaitkan dengan pencegahan kanker. D-limonene dilaporkan membantu mencegah penyebaran sel kanker. Selanjutnya, flavonoid adalah senyawa antikanker lain yang dapat ditemukan di kulit lemon. Makan flavonoid menurunkan kemungkinan terkena kanker payudara dan perut. " ));
                news.add(new News("Jaga Kesehatan Jiwa Remaja dengan Cara Berikut", "Kesehatan",R.drawable.dolly,0,"10-10-2022","TEMPO.CO, Jakarta - Kesehatan jiwa remaja juga bisa terdampak pandemi COVID-19. Selama pandemi, ada berbagai masalah yang kerap muncul pada remaja, seperti penurunan melakukan minat, kehilangan motivasi pada kegiatan atau pembelajaran. \n" +
                        "\n" +
                        "Selain itu, kurang berkembangnya keterampilan sosial yang seharusnya sudah dimiliki oleh anak pada usianya, di mana hal ini juga dapat mempengaruhi kondisi emosional. Orang dewasa yang ada di sekitar, entah itu orang tua atau kerabat terdekat lain, punya andil dalam membantu menjaga kesehatan jiwa remaja dengan bermodal kepekaan dalam melihat gerak-geriknya.\n" +
                        "\n" +
                        "\"Sebagai keluarga atau orang dewasa yang ada di sekeliling anak, kita perlu lebih peka terhadap perubahan yang terjadi pada anak atau remaja,\" kata psikolog klinis anak dan remaja Winny Suryania.\n" +
                        "\n" +
                        "Psikolog yang bekerja di Sekolah Cikal ini mengatakan orang tua atau orang dewasa di sekitar perlu lebih peka dalam mendeteksi adanya perubahan yang terjadi pada anak atau remaja. Contoh, perubahan sikap anak yang tadinya bersemangat dalam beraktivitas menjadi ingin tidur-tiduran saja atau bermain game di komputer dan ponsel.\n" +
                        "\n" +
                        "Contoh lain adalah perubahan suasana hati, anak atau remaja tampak mudah marah atau sedih. Perubahan juga bisa terlihat dari cara berkomunikasi anak. \n" +
                        "\n" +
                        "\"Misalnya juga dari senang bercerita menjadi lebih tertutup dan lebih memilih untuk menyendiri terus menerus,\" kata psikolog dari Universitas Indonesia itu.\n" +
                        "\n" +
                        "Bangun komunikasi\n" +
                        "Ketika orang dewasa atau orang tua sudah peka terhadap perubahan, langkah selanjutnya adalah membangun komunikasi yang sehat dengan anak atau remaja. Menurut Winny, perlu ada waktu khusus untuk bercerita dengan anak. Topiknya apa saja, mulai dari kehidupan anak, keseharian orang tua, hingga berita yang ada di lingkungan sekitar.\n" +
                        "\n" +
                        "\"Komunikasi ini tentunya perlu dijaga terus menerus dan tidak hanya dilakukan satu atau dua kali saja,\" ujarnya.\n" +
                        "\n" +
                        "Meluangkan waktu untuk bercengkerama saja tidak cukup. Winny mengajak orang tua atau orang dewasa di sekitar anak dan remaja untuk mengajak mereka melakukan aktivitas yang melibatkan motorik.\n" +
                        "\n" +
                        "\"Misalnya olahraga bersama, jalan, piknik, dan sebagainya karena kesehatan mental juga dijaga melalui kegiatan fisik yang dilakukan secara teratur,\" ujarnya." ));


            }
        }
    }}