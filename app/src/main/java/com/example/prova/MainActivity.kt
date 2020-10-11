package com.example.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPonto, btnSoma, btnSub, btnDiv, btnMul,  btnC, btnIgual;

    EditText EditText;

    float mValueOne, mValueTwo;

    boolean Adicao, mSubtracao, Multiplicao, Divisao;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

}