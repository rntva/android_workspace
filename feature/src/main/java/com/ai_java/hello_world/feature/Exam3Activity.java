package com.ai_java.hello_world.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Exam3Activity extends AppCompatActivity {

    EditText insertCoin;
    TextView add;
    Toast t;
    String temp1, temp2, temp3 = "원을 사용하셨습니다.";
    CharSequence c;
    Button btnCoin1, cola, cider, orance, milkiss, mccol, pocari, btnCoin2;
    int balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam3);

        insertCoin = findViewById(R.id.insertCoin);
        add = findViewById(R.id.add);
        btnCoin1 = findViewById(R.id.btnCoin1);
        cola = findViewById(R.id.cola);
        cider = findViewById(R.id.cider);
        orance = findViewById(R.id.orance);
        milkiss = findViewById(R.id.milkiss);
        mccol = findViewById(R.id.mccol);
        pocari = findViewById(R.id.pocari);
        btnCoin2 = findViewById(R.id.btnCoin2);

//        btnCoin1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkBtnCoin1();
//            }
//        });
//
//        cola.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkCola();
//            }
//        });
//
//        cider.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkCider();
//            }
//        });
//
//        orance.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkOrance();
//            }
//        });
//
//        milkiss.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkMilkiss();
//            }
//        });
//
//        mccol.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkMccol();
//            }
//        });
//
//        pocari.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkPocari();
//            }
//        });
//
//        btnCoin2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                clkBtnCoin2();
//            }
//        });
    }

    public void clkBtnCoin1()
    {
        temp1 = "";
        temp2 = "";
        balance = 0;
        c = null;
        temp1 = insertCoin.getText().toString();
        balance = Integer.valueOf(temp1);
        temp2 = temp1 + "원을 투입하셨습니다.";
        c = temp2;
        showToast();
    }

    public void clkCola()
    {
        c = null;
        if(balance < 100)
            return;
        balance -= 100;
        c = String.valueOf(100) + temp3;
        showToast();
    }

    public void clkCider()
    {
        c = null;
        if(balance < 200)
            return;
        balance -= 200;
        c = String.valueOf(200) + temp3;
        showToast();
    }

    public void clkOrance()
    {
        c = null;
        if(balance < 300)
            return;
        balance -= 300;
        c = String.valueOf(300) + temp3;
        showToast();
    }

    public void clkMilkiss()
    {
        c = null;
        if(balance < 400)
            return;
        balance -= 400;
        c = String.valueOf(400) + temp3;
        showToast();
    }

    public void clkMccol()
    {
        c = null;
        if(balance < 500)
            return;
        balance -= 500;
        c = String.valueOf(500) + temp3;
        showToast();
    }

    public void clkPocari()
    {
        c = null;
        if(balance < 600)
            return;
        balance -= 600;
        c = String.valueOf(600) + temp3;
        showToast();
    }

    public void clkBtnCoin2()
    {
        c = null;
        temp2 = String.valueOf(balance);
        c = temp2 + "원이 반환됩니다.";
        showToast();
    }

    public void showToast()
    {
        t = Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG);
        t.show();
    }

    public void compactClk(View v)
    {
        if(v.getId() == R.id.btnCoin1)
            clkBtnCoin1();
        else if(v.getId() == R.id.cola)
            clkCola();
        else if(v.getId() == R.id.cider)
            clkCider();
        else if(v.getId() == R.id.orance)
            clkOrance();
        else if(v.getId() == R.id.milkiss)
            clkMilkiss();
        else if(v.getId() == R.id.mccol)
            clkMccol();
        else if(v.getId() == R.id.pocari)
            clkPocari();
        else if(v.getId() == R.id.btnCoin2)
            clkBtnCoin2();
    }
}
