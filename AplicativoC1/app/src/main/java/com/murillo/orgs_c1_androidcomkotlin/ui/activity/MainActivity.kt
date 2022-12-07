package com.murillo.orgs_c1_androidcomkotlin.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.murillo.orgs_c1_androidcomkotlin.R
import com.murillo.orgs_c1_androidcomkotlin.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val nome: TextView = findViewById<TextView>(R.id.nomez)
        nome.text = "Cesta de frutas"

        val desricao: TextView = findViewById<TextView>(R.id.descricao)
        desricao.text = "Maçã, Laranja, e Banana"

        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "12" + ".00"
        */

        val recyclerView = findViewById<RecyclerView>(R.id.lista)
        recyclerView.adapter = ListaProdutosAdapter()

    }
}