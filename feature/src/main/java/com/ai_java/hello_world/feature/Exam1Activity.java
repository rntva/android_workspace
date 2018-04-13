//package com.ai_java.hello_world.feature;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class Exam1Activity extends AppCompatActivity {
//
//    EditText value_1, value_2;
//    TextView result_sum, result_multiply;
//    String temp1, temp2;
//    Button btn_1;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_exam);
//
//        value_1 = findViewById(R.id.value_1);
//        value_2 = findViewById(R.id.value_2);
//        temp1 = value_1.getText().toString();
//        temp2 = value_2.getText().toString();
//
//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                calcul();
//            }
//        });
//    }
//
//    public void calcul()
//    {
//        int val_2 = Integer.parseInt(temp2);
//        int sum = val_1 + val_2;
//        int mul = val_1 * val_2;
//
//        TextView tv1 = findViewById(R.id.result_plus);
//        TextView tv2 = findViewById(R.id.result_Multiply);
//        temp1 = String.valueOf(sum);
//        tv1.setText(temp1);
//        temp2 = String.valueOf(mul);
//        tv2.setText(temp2);
//    }
//}


package com.ai_java.hello_world.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
    }

    public void clkResult(View v)
    {
        EditText editText1 = findViewById(R.id.value_1);
        EditText editText2 = findViewById(R.id.value_2);
        String temp1, temp2;
        temp1 = editText1.getText().toString();
        temp2 = editText2.getText().toString();
        if("".equals(temp1) || "".equals(temp2))
            return;
        int val_1 = Integer.parseInt(temp1);
        int val_2 = Integer.parseInt(temp2);
        int sum = val_1 + val_2;
        int mul = val_1 * val_2;

        TextView tv1 = findViewById(R.id.result_plus);
        TextView tv2 = findViewById(R.id.result_Multiply);
        temp1 = String.valueOf(sum);
        tv1.setText(temp1);
        temp2 = String.valueOf(mul);
        tv2.setText(temp2);
    }
}
