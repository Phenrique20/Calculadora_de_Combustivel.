package com.example.calculadoradecombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val btnproximo2 = findViewById<Button>(R.id.btn_proximo2)
        val edtconsumo = findViewById<TextInputEditText>(R.id.edt_consumo)

        val preco = intent.getStringExtra("KEY_PRECO")


        btnproximo2.setOnClickListener {
            val consumoText = edtconsumo.text.toString()

            if (consumoText.isNotEmpty()) {
                val intent = Intent(this, MainActivity4::class.java)
                intent.putExtra("KEY_CONSUMO", consumoText)
                intent.putExtra("KEY_PRECO", preco)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Digite o consumo!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

