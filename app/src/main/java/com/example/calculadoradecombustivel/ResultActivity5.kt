package com.example.calculadoradecombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result5)

        val btnnovocalculo = findViewById<Button>(R.id.btn_novocalculo)
        val tvresultado = findViewById<TextView>(R.id.tv_resultado)
        val tvpreco = findViewById<TextView>(R.id.tv_preco)
        val tvconsumo = findViewById<TextView>(R.id.tv_consumo)
        val tvdistancia = findViewById<TextView>(R.id.tv_distancia)

        val preco = intent.getStringExtra("KEY_PRECO")?.toDoubleOrNull()?:0.0
        val consumo = intent.getStringExtra("KEY_CONSUMO")?.toDoubleOrNull()?:0.0
        val distancia = intent.getStringExtra("KEY_DISTANCIA")?.toDoubleOrNull()?:0.0

        tvpreco.text = "R$ %.2f".format(preco)
        tvconsumo.text = "%.1f km/l".format(consumo)
        tvdistancia.text = "%.1f km".format(distancia)

        val resultado = if (consumo !=0.0) distancia / consumo * preco else 0.0

        tvresultado.text = "Custo da viagem: R$ %.2f" .format(resultado)

        btnnovocalculo.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

        }
    }
