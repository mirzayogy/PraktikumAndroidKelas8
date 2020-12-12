package com.mirzayogy.praktikumandroidkelas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class IntentResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_result)

        val tvNpm = findViewById<TextView>(R.id.tvNpm)
        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvIpk = findViewById<TextView>(R.id.tvIpk)
        val tvJumlahMatakuliah = findViewById<TextView>(R.id.tvJumlahMatakuliah)

        if(intent.getStringExtra("npm")!=null){
            val npm = intent.getStringExtra("npm")
            val nama = intent.getStringExtra("nama")
            val ipk = intent.getDoubleExtra("ipk",0.0)
            val jumlahMatakuliah = intent.getIntExtra("jumlahMatakuliah",0)

            tvNpm.text = npm
            tvNama.text = nama
            tvIpk.text = ipk.toString()
            tvJumlahMatakuliah.text = jumlahMatakuliah.toString()
        }else{
            val mahasiswa = intent.getParcelableExtra<Mahasiswa>("mahasiswa")

            if (mahasiswa != null) {
                tvNpm.text = mahasiswa.npm
                tvNama.text = mahasiswa.nama
                tvIpk.text = mahasiswa.ipk.toString()
                tvJumlahMatakuliah.text = mahasiswa.jumlahMatakuliah.toString()
            }
        }







    }
}