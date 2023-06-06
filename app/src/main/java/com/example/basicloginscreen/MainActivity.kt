package com.example.basicloginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText:EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize
        usernameEditText = findViewById(R.id.usernameEditText)
        usernameEditText = findViewById(R.id.usernameEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener { validateAngdLogin() }

    }

    private fun validateAngdLogin() {
        val username = usernameEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {

            Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show()
            return
        }
        // Todo add your login here
        // for demonstration , just show a success message

        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
    }
}


