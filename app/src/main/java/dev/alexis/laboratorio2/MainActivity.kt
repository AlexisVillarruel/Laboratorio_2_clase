package dev.alexis.laboratorio2

import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMessage: EditText = findViewById(R.id.etMessage)
        val btnSent: Button = findViewById(R.id.btnSend)
        btnSent.setOnClickListener{this.sendMessage(etMessage.text.toString())}
        }
    private fun sendMessage(message: String){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("param", message)
        startActivity(intent)
    }
}