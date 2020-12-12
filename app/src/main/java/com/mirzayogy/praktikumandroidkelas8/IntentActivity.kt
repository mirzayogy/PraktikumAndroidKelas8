package com.mirzayogy.praktikumandroidkelas8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val etNpm = findViewById<EditText>(R.id.etNpm)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etIpk = findViewById<EditText>(R.id.etIpk)
        val etJumlahMatakuliah = findViewById<EditText>(R.id.etJumlahMatakuliah)

        val btIntent1 = findViewById<Button>(R.id.btIntent1)
        val btIntent2 = findViewById<Button>(R.id.btIntent2)


        btIntent1.setOnClickListener {

            val npm = etNpm.text.toString()
            val nama = etNama.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val jumlahMatakuliah = etJumlahMatakuliah.text.toString().toInt()


            val i = Intent(this,IntentResultActivity::class.java)
            i.putExtra("npm",npm)
            i.putExtra("nama",nama)
            i.putExtra("ipk",ipk)
            i.putExtra("jumlahMatakuliah",jumlahMatakuliah)
            startActivity(i)
        }


    }
}