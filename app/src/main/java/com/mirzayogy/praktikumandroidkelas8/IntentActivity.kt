package com.mirzayogy.praktikumandroidkelas8

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.Menu
import android.view.MenuItem
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
        val etNomorTelepon = findViewById<EditText>(R.id.etNomorTelepon)

        val btIntent1 = findViewById<Button>(R.id.btIntent1)
        val btIntent2 = findViewById<Button>(R.id.btIntent2)
        val btDial = findViewById<Button>(R.id.btDial)


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


        btIntent2.setOnClickListener {

            val npm = etNpm.text.toString()
            val nama = etNama.text.toString()
            val ipk = etIpk.text.toString().toDouble()
            val jumlahMatakuliah = etJumlahMatakuliah.text.toString().toInt()

            val mahasiswa = Mahasiswa(npm,nama,ipk,jumlahMatakuliah)

            val i = Intent(this,IntentResultActivity::class.java)
            i.putExtra("mahasiswa",mahasiswa)
            startActivity(i)

        }

        btDial.setOnClickListener {
            val nomorTelepon = etNomorTelepon.text.toString()
            val intentDial = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$nomorTelepon"))
            startActivity(intentDial)

        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.change_language_settings){
            val i = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(i)
        }
        return super.onOptionsItemSelected(item)
    }
}