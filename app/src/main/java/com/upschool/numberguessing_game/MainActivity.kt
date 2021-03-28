package com.upschool.numberguessing_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tahminButon:Button=findViewById(R.id.tahminButon)
        val textView1:TextView=findViewById(R.id.textView1)
        val editText:TextInputEditText=findViewById(R.id.editText)
        val skorTextView:TextView=findViewById(R.id.skorTextView)
        var puan:Int=100 //skor için,her yanlış tahminde 1 puan düşecek,textviewda gösterilecek
        var randomSayi=(1..100).random() //random sayı üretiyoruz

        textView1.text="Lütfen bir sayı giriniz"
        tahminButon.setOnClickListener {
        var tahmin=editText.text.toString().toInt()
        if(tahmin>randomSayi) {
            textView1.text="Lütfen daha küçük bir sayı deneyiniz."
            puan=puan-1
            skorTextView.text="Skorunuz:"+puan.toString()

        } else if (tahmin<randomSayi){
            textView1.text="Lütfen daha büyük bir sayı deneyiniz"
            puan=puan-1
            skorTextView.text="Skorunuz:"+puan.toString()

        }else{
             textView1.text="Tebrikler bildiniz!Skorunuz: $puan"
             skorTextView.setText(null)
             editText.isEnabled=false
        }
        }


    }
}