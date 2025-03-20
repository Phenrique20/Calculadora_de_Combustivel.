package com.example.calculadoradecombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val btnresultado = findViewById<Button>(R.id.btn_resultado)
        val edtdistancia = findViewById<TextInputEditText>(R.id.edt_distancia)

        val preco = intent.getStringExtra("KEY_PRECO")
        val consumo = intent.getStringExtra("KEY_CONSUMO")


        btnresultado.setOnClickListener {
            val distanciaText = edtdistancia.text.toString()


            if (distanciaText.isNotEmpty()) {
                val intent = Intent(this, ResultActivity5::class.java)
                intent.putExtra("KEY_DISTANCIA", distanciaText)
                intent.putExtra("KEY_PRECO",preco)
                intent.putExtra("KEY_CONSUMO", consumo)

                startActivity(intent)

            } else {
                Toast.makeText(this, "Digite a distância!", Toast.LENGTH_SHORT).show()
            }
        }


      }

    }

