package com.huda.submissionandroidpemula

object FoodData {
    private val foodNames = arrayOf(
        "Nasi Goreng Babat dan Babat Gongso",
        "Kuliner Ayam Kampung Maknyus - Nasi Ayam",
        "Gurihnya Kuliner Bumbu Petis - Tahu Gimbal",
        "Nikmatnya Hidangan Olahan Burung – Burung Belibis",
        "Kuliner Kuah Sedap dan Segar – Nasi Pindang",
        "Kuliner Olahan Kambing Istimewa – Sate Buntel",
        "Berburu Kuliner Hangat – Wedang Tahu",
        "Sedapnya Makanan Khas Semarang – Nasi Gandul",
        "Menikmati Kuliner Pedas Semarang – Mangut Welut",
        "Kuliner Baru Semarang – Sate Kalak"
    )

    private val foodDetails = arrayOf(
        "Babat merupakan salah satu bagian dari jeroan sapi yang dijadikan banyak olahan makanan di Indonesia, salah satunya adalah nasi goreng babat dan babat gongso khas Semarang ini. Warung Pak Sukarmin merupakan salah satu yang tertua di Semarang. ",
        "Jika di Jogja ada nasi gudeg, di Solo ada nasi liwet maka di Semarang ada nasi ayam. Nasi dengan kuah kuning opor ini dilengkapi sayur labu yang manis, suwiran ayam kampung serta telur, tahu dan krecek berbumbu khas.",
        "Mengingat posisi Semarang yang terletak di pesisir utara Jawa, tidak lengkap rasanya jika tidak mencicipi makanan berbumbu petis seperti di Surabaya, Lamongan dan Tuban. Di Semarang, makanan dengan bumbu petis yang terkenal adalah tahu gimbal.",
        "Olahan bebek dan ayam goreng sudah menjadi hal yang lumrah ditemui di wisata kuliner kota-kota di Indonesia. Namun pernahkah kamu mendengan tentang hidangan olahan burung? Di Warung Pak No ini kamu bisa menemukan berbagai macam olahan burung, salah satunya adalah burung belibis.",
        "Pindang di beberapa daerah merupakan nama sejenis ikan. Berbeda dengan di Semarang, nasi pindang merupakan olahan daging sapi yang dikombinasikan dengan kuah rempah kluwek dan daun melinjo. Secara penampilan, nasi pindang hampir mirip seperti rawon di Jawa Timur, namun tidak terlalu pekat dan lebih terasa segar.",
        "Para pecinta kambing wajib mampir ke rumah makan olahan kambing yang sudah berdiri sejak tahun 1945 Sate dan Gule Kambing 29. Banyak menu variatif yang ditawarkan oleh rumah makan spesialis kambing ini, seperti sate buntel dan pepes olor. ",
        "Kuliner unik ini sangat pas untuk kamu yang sedang berburu minuman hangat dan menyegarkan. Wedang tahu terbuat dari campuran gula jawa, jahe dan kembang tahu yang berasal dari sari kedelai. Rasa dari wedang tahu ini cenderung manis dan bersifat menghangatkan.",
        "Meski sejatinya kuliner ini berasal dari kota Pati, tetapi rasanya yang luar biasa telah membuat hidangan nasi gandul menyebar ke kota-kota lain termasuk Semarang. Secara penampilan, nasi gandul ini mirip dengan nasi yang diberi kuah gulai sapi. Namun dengan rasa yang berbeda.",
        "Belut merupakan hewan air tawar yang memiliki kandungan protein cukup tinggi. Selain itu, belut juga terkenal dengan rasanya yang gurih apalagi jika digoreng sampai kering. Mangut ikan air tawar mungkin sudah sering kita jumpai, namun mangut welut menjadi makanan khas semarang tidak bisa kita jumpai di sembarang tempat.",
        "Kuliner ini merupakan kuliner khas Semarang yang relatif baru. Sate Kalak berbahan dasar ayam meski tentunya bukan seperti sate ayam biasa. Sate Kalak memiliki rasa rempah yang unik dan bisa menjadi variasi kuliner tersendiri untuk kamu yang sering berkunjung ke Semarang."
    )

//    private val foodImages = intArrayOf(
//        R.drawable.nasi_goreng_babat,
//        R.drawable.nasi_ayam,
//        R.drawable.tahu_gimbal,
//        R.drawable.burung_belibis,
//        R.drawable.nasi_pindang,
//        R.drawable.sate_buntel,
//        R.drawable.wedang_tahu,
//        R.drawable.nasi_gandul,
//        R.drawable.magut_welut,
//        R.drawable.sate_kalak
//    )
    private val foodImages = arrayOf(
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204040000/babat-1024x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204040808/nasi-ayam-2-909x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204042222/tahu-gimbal-820x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204040303/iwak-1024x918.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204041313/nasi-pindang2-1024x576.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204041717/satebuntel-1024x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204042525/wedang-tahu-1024x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204041111/NASI-GANDUL-820x1024.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204042727/welut-1024x726.jpg",
        "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/04/020204041515/sate-kalak-1024x766.jpg"
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }

}