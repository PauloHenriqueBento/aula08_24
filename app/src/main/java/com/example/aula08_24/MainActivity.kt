package com.example.aula08_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editValor1: EditText = findViewById(R.id.editValor1)
        val editValor2: EditText = findViewById(R.id.editValor2)

        val buttonSomar: Button = findViewById(R.id.buttonSomar)
        val buttonSubtrair: Button = findViewById(R.id.buttonSubtrair)
        val buttonMultiplicar: Button = findViewById(R.id.buttonMultiplicar)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)

        buttonSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val resultado = valor1 + valor2

            showDialog("A soma é: " + resultado)
        }

        buttonSubtrair.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val resultado = valor1 - valor2

            showDialog("A subtração é: " + resultado)
        }

        buttonMultiplicar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val resultado = valor1 * valor2

            showDialog("A multiplicar é: " + resultado)
        }

        buttonDividir.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()
            val resultado = (valor1 / valor2).toString().toDouble()

            showDialog("A divisão é: " + resultado)
        }
    }

    fun showDialog(msg: String) {
        val builder = AlertDialog.Builder(this)
        builder.setMessage(msg)
        builder.setPositiveButton("OK", null)
        val dialog = builder.create()
        dialog.show()
    }
}