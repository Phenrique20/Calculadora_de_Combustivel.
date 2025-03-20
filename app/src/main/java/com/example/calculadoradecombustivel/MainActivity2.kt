package com.example.calculadoradecombustivel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val btnproximo = findViewById<Button>(R.id.btn_proximo)
        val edtpreco = findViewById<EditText>(R.id.edt_preco)


        btnproximo.setOnClickListener {
            val precoText = edtpreco.text.toString()

            if (precoText.isNotEmpty()) {

                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("KEY_PRECO", precoText)
                startActivity(intent)

                println("Preço digitado: $precoText")
            } else {
                Toast.makeText(this, "Digite o preço!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


