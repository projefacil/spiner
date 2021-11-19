package com.src.textospiner

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        val categories: MutableList<Int> = ArrayList()
        categories.add (12)
        categories.add(16)
        categories.add(20)
        categories.add(24)
        categories.add(36)
        categories.add(48)
       val linguagem=resources.getStringArray(R.array.Indiomas) // para usar  resource somente Strings
        val arrayAdapter=ArrayAdapter(this, R.layout.dados_itens, categories)
        autoCompleteTextView.setAdapter(arrayAdapter)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}