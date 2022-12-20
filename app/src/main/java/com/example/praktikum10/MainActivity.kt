package com.example.praktikum10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val ednim=findViewById<EditText>(R.id.edNIM)
        val ednama= findViewById<EditText>(R.id.edNama)
        val rgjurusan= findViewById<RadioGroup>(R.id.rgJurusan)
        val edasal=findViewById<EditText>(R.id.edAsal)
        val edalamt=findViewById<EditText>(R.id.edAlamat)

        btnSubmit.setOnClickListener {
            val NIM=ednim.text.toString()
            val Nama=ednama.text.toString()

            val cekjurusanRadioButton=rgjurusan.checkedRadioButtonId
            val xjurusan=findViewById<RadioButton>(cekjurusanRadioButton)
            val jurusan = xjurusan.text.toString()
            val asal=edasal.text.toString()
            val alamat=edalamt.text.toString()

            Intent(this,SecondActivity::class.java).also{
                it.putExtra("EXTRA_NIM",NIM)
                it.putExtra("EXTRA_NAMA",Nama)
                it.putExtra("EXTRA_JURUSAN",jurusan)
                it.putExtra("EXTRA_ASAL",asal)
                it.putExtra("EXTRA_ALAMAT",alamat)
                startActivity(it)

            }



        }

    }
}