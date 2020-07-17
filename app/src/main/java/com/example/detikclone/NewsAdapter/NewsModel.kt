package com.example.detikclone.NewsAdapter

import android.icu.text.CaseMap
import com.example.detikclone.R

data class news(var title: String, var desc: String,var deskripsi : String,var photo: Int)

object NewsModel {
    val newslist = listOf<news>(
        news("Sah! Vivo Rilis X50 dan X50 Pro, Professional Photography Flagship Smartphone",
            "Detikcom | 8 Jam yang lalu", "Jakarta - Vivo Indonesia sah merilis Vivo X50 Series yang terdiri dari Vivo X50 dan X50 Pro ke Indonesia. Smartphone tersebut merupakan professional photography flagship smartphone pertama yang dipasarkan Vivo di Tanah Air.\n" +
                    "Acara peluncurannya ditayangkan secara langsung via Youtube, Facebook dan Twitter Vivo Indonesia. Diungkapkan Senior Brand Director Vivo Indonesia Edy Kusuma, Vivo X50 Series merupakan komitmen Vivo dalam pengembangan produk yang konsumen-sentris, baik pada teknologi maupun desainnya.\n" +
                    "\"Stabilitas dan kapabilitas kamera pada Vivo X50 Series didukung dengan lensa dan sensor terkini, serta keseluruhan sistem kamera yang canggih memungkinkan pengguna untuk menangkap lebih banyak cerita dan pengalaman berkesan dalam hidup yang lebih stabil di berbagai skenario,\" ujar Edy dalam keterangan tertulis, Kamis (16/7/2020).",
            R.drawable.img_news1),

        news("Konimex Dukung Masyarakat Siapkan Diri Hadapi Pandemi & New Normal",
            "Jakarta - Pandemi COVID-19 telah memberikan dampak yang sangat memukul masyarakat di Indonesia. Namun musibah ini pun telah membangkitkan solidaritas dalam masyarakat.\n" +
                    "Ada banyak pihak yang memberikan bantuan kepada masyarakat yang terdampak pandemi. Salah satunya yaitu perusahaan consumer health care & consumer goods lokal sekaligus terbesar di Indonesia, PT Konimex.\n" +
                    "\n" +
                    "Konimex selalu memperhatikan dan menjaga kebutuhan konsumen melalui produk-produk yang berkualitas. Dalam melawan pandemi ini, Konimex ikut berkontribusi melalui pendistribusian alat kesehatan, obat-obatan, dan makanan bagi tim medis dan masyarakat di berbagai daerah di Indonesia.\n" +
                    "\n" +
                    "\"Sejalan dengan visi dan misi kami untuk ikut menyehatkan bangsa, kami bertekad untuk ikut ambil peran dalam upaya menanggulangi dan mencegah penyebaran virus COVID-19 lebih jauh, dimulai dari daerah di mana kantor pusat kami beroperasi dan terus meluas hingga wilayah lain di Indonesia,\" jelas Presiden Direktur PT Konimex, Rachmadi Joesoef, dalam keterangan tertulis.",
            "Detikcom | 2 Jam yang lalu",
            R.drawable.img_news2),

        news("RUU BPIP dan RUU HIP, Apa Bedanya?",
            "Jakarta - RUU BPIP mencuat setelah diajukan oleh pemerintah sebagai pengganti RUU Haluan Ideologi Pancasila (RUU HIP) yang ramai menuai penolakan. Kedua RUU itu disebut memiliki sejumlah perbedaan. Apa saja?\n" +
                    "Konsep baru RUU Badan Pembinaan Ideologi Pancasila (RUU BPIP) diberikan pemerintah kepada DPR pada Kamis (16/7/2020), di Gedung Nusantara, kompleks gedung MPR/DPR, Senayan, Jakarta. Hadir saat itu Ketua DPR Puan Maharani dan Menko Polhukam Mahfud Md yang mewakili pemerintah.\"Kami pimpinan DPR baru saja menerima wakil pemerintah atau utusan dari Presiden yang dipimpin Pak Menko Polhukam untuk bisa menyerahkan konsep BPIP, Badan Pembinaan Ideologi Pancasila sebagai masukan kepada DPR untuk membahas dan menampung konsep-konsep yang akan dibahas bersama atau mendapatkan masukan dari masyarakat,\" kata Puan.",
            "Detikcom | 4 Jam yang lalu",
            R.drawable.img_news3),

        news("BNPB Jelaskan Penyebab Banjir Masamba Luwu Utara yang Tewaskan 30 Jiwa",
            "Jakarta - Banjir Bandang Masamba, Luwu Utara, Sulawesi Selatan, mengakibatkan 30 orang meninggal hingga Kamis kemarin. Ada beberapa faktor yang menyebabkan banjir itu.\n" +
                    "\"Hasil analisis sementara Direktorat Jenderal Pengendalian DAS dan Hutan Lindung Kementerian Lingkungan Hidup dan Kehutanan (KLHK) mencatat dua faktor penyebab banjir bandang Luwu Utara, yakni alam dan manusia,\" kata Kepala Pusat Data, Informasi dan Komunikasi Kebencanaan BNPB Raditya Jati dalam keterangannya, Jumat (17/7/2020)\n" +
                    "\n" +
                    "Raditya Jati menjelaskan salah satunya faktor cuaca. Curah hujan dengan intensitas tinggi di daerah aliran sungai (DAS) Balease menjadi salah satu pemicu banjir bandang tersebut.",
            "Detikcom | 9 Jam yang lalu",
            R.drawable.img_news4),

        news("Kerja Sama Museum MACAN, OPPO Bakal Hadirkan Seni Lewat Teknologi",
            "Jakarta - Setelah dua ronde program Arisan Karya sukses sejak Mei lalu, Museum MACAN siap menggelar edisi ketiga dan terakhir yang dijadwalkan pada 28 Juli-2 Agustus 2020. Menariknya, kali ini Museum MACAN akan menggandeng OPPO Indonesia sebagai presenting partner dalam menampilkan seni lewat teknologi.\n" +
                    "Arisan Karya adalah sebuah usaha untuk menggugah semangat jejaring dan komunitas yang berkaitan dengan museum pada masa krisis ini.\n" +
                    "\n" +
                    "Chief Creative Officer OPPO Patrick Owen mengatakan, sebagai bintang baru dalam teknologi gawai, OPPO melihat teknologi sebagai bagian dari kesenian. Kolaborasi ini terjalin sejalan dengan komitmen OPPO untuk berkontribusi terhadap kualitas hidup masyarakat yang lebih baik.\n" +
                    "\n" +
                    "\"Sebagai perusahaan teknologi yang terus berkembang, kami terus-menerus berusaha untuk melampaui berbagai batasan demi menciptakan kehidupan yang lebih baik. OPPO, melalui seri OPPO Find X2 flagship, bangga untuk berkolaborasi dengan Museum MACAN yang dikenal sebagai pusat seni modern dan kontemporer di Indonesia,\" ujarnya dalam keterangan tertulis, Jumat (17/7/2020).",
            "Detikcom | 1 Jam yang lalu",
            R.drawable.img_news5),

        news("Utang Luar Negeri RI Tembus Rp 5.908 T",
            "Jakarta - Utang Luar Negeri (ULN) Indonesia pada akhir Mei 2020 tercatat US\$ 404,7 miliar atau setara dengan Rp 5.908 triliun tumbuh 4,8%. ULN ini tercatat lebih tinggi dibandingkan dengan pertumbuhan pada April 2020 sebesar 2,9%.\n" +
                    "Data Bank Indonesia (BI) menyebutkan peningkatan ini dipengaruhi oleh transaksi penarikan neto ULN, baik ULN pemerintah maupun swasta. Selain itu penguatan nilai tukar rupiah terhadap dolar AS juga berkontribusi pada peningkatan ULN berdenominasi rupiah.\n" +
                    "\n" +
                    "Disebutkan komposisi ULN ini terdiri dari ULN sektor publik (termasuk pemerintah dan bank sentral) sebesar US\$ 194,9 miliar dan ULN swasta (termasuk BUMN) sebesar US\$ 209,9 miliar.",
            "Detikcom | 13 Jam yang lalu",
            R.drawable.img_news6)

//        news("Banjir keritik ke trump yang kerahkan militer usai demo georgeo floyd",
//            "Detikcom | 8 Jam yang lalu",
//            R.drawable.img_news7),
//
//        news("Mengapa aksi damai kasus georgeo floyd bisa bisa berubah jadi kerusuhan",
//            "Detikcom | 7 Jam yang lalu",
//            R.drawable.img_news8),
//
//        news("2 opsi bagi calon jemaah haji yang tidak jadi berangkat tahun ini",
//            "Detikcom | 3 Jam yang lalu",
//            R.drawable.img_news9)
    )
}