package com.example.edittexttoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.editText);
        editText.setHint("Your name?");

        var sendButton = findViewById<Button>(R.id.button);

        sendButton.setOnClickListener{

            Toast.makeText(this, "${editText.text}님 반갑습니다.", Toast.LENGTH_LONG).show();

            editText.setText("");
        }

    }
}
