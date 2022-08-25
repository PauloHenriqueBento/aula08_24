package com.example.aula08_24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class parImpar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_par_impar)

        val buttonEnviar: Button = findViewById(R.id.buttonEnviar)
        val editNumber: EditText = findViewById(R.id.editNumber)

        buttonEnviar.setOnClickListener {
            val numberValue = editNumber.text.toString().toInt()
            if (numberValue % 2 == 0){
                showDialog("O número é Par: " + numberValue)
            } else{
                showDialog("O número é impar: " + numberValue)
            }
        }
    }

    fun showDialog(msg: String) {
        val builder = AlertDialog.Builder(this)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}