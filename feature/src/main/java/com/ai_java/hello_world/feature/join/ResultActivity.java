package com.ai_java.hello_world.feature.join;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ai_java.hello_world.feature.R;

public class ResultActivity extends AppCompatActivity {

    TextView Result_tName, Result_tAge, Result_tAddress, Result_tID, Result_tPW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();
        setInfo(getIntent());
    }

    private void init()
    {
        Result_tName = findViewById(R.id.Result_tName);
        Result_tAge = findViewById(R.id.Result_tAge);
        Result_tAddress = findViewById(R.id.Result_tAddress);
        Result_tID = findViewById(R.id.Result_tID);
        Result_tPW = findViewById(R.id.Result_tPW);
    }

    public void setInfo(Intent intent)
    {
        Result_tName.setText("\n"+intent.getStringExtra("name"));
        Result_tAge.setText("\n"+intent.getStringExtra("age"));
        Result_tAddress.setText("\n"+intent.getStringExtra("address"));
        Result_tID.setText("\n"+intent.getStringExtra("ID"));
        Result_tPW.setText("\n"+intent.getStringExtra("PW"));
    }
}
