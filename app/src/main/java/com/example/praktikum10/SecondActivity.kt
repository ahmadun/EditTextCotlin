package com.example.praktikum10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val Hasil = findViewById<TextView> (R.id.tvhasil)

        val NIM= intent.getStringExtra("EXTRA_NIM")
        val Nama = intent.getStringExtra( "EXTRA_NAMA")
        val Jurusan = intent.getStringExtra( "EXTRA_JURUSAN")
        val Asal = intent.getStringExtra( "EXTRA_ASAL")
        val Alamat = intent.getStringExtra( "EXTRA_ALAMAT")
        val hasildata = "NIM SNIM : \n" +
                "Nama: $Nama \n" +
                "Jurusan : $Jurusan \n" +
                "Asal Sekolah : $Asal \n" +
                "Alamat: $Alamat \n"
        Hasil.text = hasildata
        val btnkembali = findViewById<Button>(R.id.btnBack)
        btnkembali.setOnClickListener {
            finish()
        }
    }
}