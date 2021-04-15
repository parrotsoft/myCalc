package com.parrotsoft.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText EdResult;
    public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAc, btnPor,
            btnMenos, btnMas, btnIgual, btnDiv, btnComa, btnSin, btnCos;
    public String textNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.EdResult = findViewById(R.id.edResult);
        this.btn0 = findViewById(R.id.btn0);
        this.btn0.setOnClickListener(this);

        this.btn1 = findViewById(R.id.btn1);
        this.btn1.setOnClickListener(this);

        this.btn2 = findViewById(R.id.btn2);
        this.btn2.setOnClickListener(this);

        this.btn3 = findViewById(R.id.btn3);
        this.btn3.setOnClickListener(this);

        this.btn4 = findViewById(R.id.btn4);
        this.btn4.setOnClickListener(this);

        this.btn5 = findViewById(R.id.btn5);
        this.btn5.setOnClickListener(this);

        this.btn6 = findViewById(R.id.btn6);
        this.btn6.setOnClickListener(this);

        this.btn7 = findViewById(R.id.btn7);
        this.btn7.setOnClickListener(this);

        this.btn8 = findViewById(R.id.btn8);
        this.btn8.setOnClickListener(this);

        this.btn9 = findViewById(R.id.btn9);
        this.btn9.setOnClickListener(this);

        this.btnAc = findViewById(R.id.btnAc);
        this.btnAc.setOnClickListener(this);

        this.btnPor = findViewById(R.id.btnPor);
        this.btnPor.setOnClickListener(this);

        this.btnMenos = findViewById(R.id.btnMenos);
        this.btnMenos.setOnClickListener(this);

        this.btnMas = findViewById(R.id.btnMas);
        this.btnMas.setOnClickListener(this);

        this.btnIgual = findViewById(R.id.btnIgual);
        this.btnIgual.setOnClickListener(this);

        this.btnDiv = findViewById(R.id.btnDiv);
        this.btnDiv.setOnClickListener(this);

        this.btnComa = findViewById(R.id.btnComa);
        this.btnComa.setOnClickListener(this);

        this.btnCos = findViewById(R.id.btnCos);
        btnCos.setOnClickListener(this);

        this.btnSin = findViewById(R.id.btnSin);
        btnSin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                this.textNumber += "0";
                break;
            case R.id.btn1:
                this.textNumber += "1";
                break;
            case R.id.btn2:
                this.textNumber += "2";
                break;
            case R.id.btn3:
                this.textNumber += "3";
                break;
            case R.id.btn4:
                this.textNumber += "4";
                break;
            case R.id.btn5:
                this.textNumber += "5";
                break;
            case R.id.btn6:
                this.textNumber += "6";
                break;
            case R.id.btn7:
                this.textNumber += "7";
                break;
            case R.id.btn8:
                this.textNumber += "8";
                break;
            case R.id.btn9:
                this.textNumber += "9";
                break;
            case R.id.btnAc:
                this.textNumber = "";
                break;
            case R.id.btnPor:
                this.textNumber += "*";
                break;
            case R.id.btnMenos:
                this.textNumber += "-";
                break;
            case R.id.btnMas:
                this.textNumber += "+";
                break;
            case R.id.btnIgual:
                this.textNumber = Double.toString(Helpers.eval(this.textNumber));
                break;
            case R.id.btnDiv:
                this.textNumber += "/";
                break;
            case R.id.btnComa:
                this.textNumber += ".";
                break;
            case R.id.btnCos:
                this.textNumber += "cos";
                break;
            case R.id.btnSin:
                this.textNumber += "sin";
                break;
        }
        this.EdResult.setText(this.textNumber);
    }
}