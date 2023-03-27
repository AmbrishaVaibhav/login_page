package com.example.login_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        var et_email=findViewById(R.id.emailenter) as EditText
        var et_password=findViewById(R.id.passwordenter) as EditText
        var tb_forgot=findViewById(R.id.forgotpassword) as TextView
        var btn_signin=findViewById(R.id.clicksignin) as Button
        var btn_signgogl=findViewById(R.id.signgog) as Button
        var btn_signnew=findViewById(R.id.newsign) as Button
        btn_signin.setOnClickListener {
            val user_name = et_email.text;
            val password = et_password.text;
            val Intent = Intent(this,homepage::class.java)
            startActivity(Intent)

        }
        btn_signnew.setOnClickListener{
            val Intent = Intent(this,SignUpActivity::class.java)
            startActivity(Intent)
        }

        }

}