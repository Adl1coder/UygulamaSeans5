package com.example.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        val editTextAd=tasarim.editTextText
            val editTextSoyad= tasarim.editTextText2
        val editTextTcNo=tasarim.editTextText3
        tasarim.button.setOnClickListener{
            if(editTextAd.text.isEmpty()||editTextSoyad.text.isEmpty()||editTextTcNo.text.isEmpty()){
              Snackbar.make(it,"kayıt alanını doldurunuz", Snackbar.LENGTH_SHORT)
                }
                else{


            }


        }

        tasarim.button.setOnClickListener {
            Snackbar.make(it, "Merhaba Kayıt Talebiniz Alınmıştır", Snackbar.LENGTH_SHORT).show()
        }
    }
}