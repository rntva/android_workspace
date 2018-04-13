package com.ai_java.hello_world.feature.join;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ai_java.hello_world.feature.R;

import java.util.ArrayList;
import java.util.List;

public class JoinActivity extends AppCompatActivity {

    private EditText Join_eName, Join_eAge, Join_eAddress, Join_eID, Join_ePW;
    private Button Join_check;
    private List<String[]> info_arr = new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        init();
        Join_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp[] = new String[5];

                temp[0] = Join_eName.getText().toString();
                temp[1] = Join_eAge.getText().toString();
                temp[2] = Join_eAddress.getText().toString();
                temp[3] = Join_eID.getText().toString();
                temp[4] = Join_ePW.getText().toString();

                info_arr.add(temp);
//                moveToResult(info_arr.get(0));
                moveToResult(temp);
            }
        });
    }

    private void init()
    {
        //EditText
        Join_eName = findViewById(R.id.Join_eName);
        Join_eAge = findViewById(R.id.Join_eAge);
        Join_eAddress = findViewById(R.id.Join_eAddress);
        Join_eID = findViewById(R.id.Join_eID);
        Join_ePW = findViewById(R.id.Join_ePW);
        //Button
        Join_check = findViewById(R.id.Join_check);
    }

    public void moveToResult(String info[])
    {
        Intent intent = new Intent(JoinActivity.this, ResultActivity.class);
        intent.putExtra("name", info[0]);
        intent.putExtra("age", info[1]);
        intent.putExtra("address", info[2]);
        intent.putExtra("ID", info[3]);
        intent.putExtra("PW", info[4]);

        startActivity(intent);
//        finish();
    }
}
