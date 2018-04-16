package com.ai_java.hello_world.feature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ai_java.hello_world.feature.R;

public class Exam2Activity extends AppCompatActivity {

    private EditText getNum;
    private Button starBtn;
    private TextView showStar;
    private String star;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        getNum = findViewById(R.id.getNum);
        showStar = findViewById(R.id.showStar);
        starBtn = findViewById(R.id.starBtn);
        starBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                makeStar();
            }
        });
    }

    public void makeStar() {
        int num = Integer.parseInt(getNum.getText().toString());
        star = "";
        for(int i = 1 ; i <= num ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                star += "*";
            }
            if(i != num)
                star += "\n";
        }
        showStar.setText(star);
    }
}

