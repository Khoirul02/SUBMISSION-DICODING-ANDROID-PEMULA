package com.huda.submissionandroidpemula

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var namaMakanan: String
    lateinit var detailMakanan: String
    lateinit var photo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        namaMakanan = intent.getStringExtra("NAMA")
        detailMakanan = intent.getStringExtra("DETAIL")
        photo = intent.getStringExtra("POTO")

        tv_nama_makanan.text = namaMakanan
        tv_detail_makanan.text = detailMakanan

        iv_foto_detail?.let { Glide.with(this).load(photo).into(it) }

    }
}
