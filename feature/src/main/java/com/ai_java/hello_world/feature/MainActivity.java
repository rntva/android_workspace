package com.ai_java.hello_world.feature;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.ai_java.hello_world.feature.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void clkbtn_1(View v)
    {
        CharSequence c = null;
//        Toast t = Toast.makeText(getApplicationContext(), getResources().getText(R.string.clkbtn_1), Toast.LENGTH_SHORT);
//        t.show();

        if(v.getId() == R.id.btn_1) {
//            Toast.makeText(getApplicationContext(), getResources().getText(R.string.clkbtn_1), Toast.LENGTH_SHORT).show();
            c = getResources().getText(R.string.clkbtn_1);
        }
        else if (v.getId() == R.id.btn_2) {
//            Toast.makeText(getApplicationContext(), getResources().getText(R.string.clkbtn_2), Toast.LENGTH_SHORT).show();
            c = getResources().getText(R.string.clkbtn_2);
        }
        else if (v.getId() == R.id.btn_3) {
//            Toast.makeText(getApplicationContext(), getResources().getText(R.string.clkbtn_3), Toast.LENGTH_SHORT).show();
            c = getResources().getText(R.string.clkbtn_3);
        }
        else if (v.getId() == R.id.btn_4) {
//            Toast.makeText(getApplicationContext(), getResources().getText(R.string.clkbtn_4), Toast.LENGTH_SHORT).show();
            c = getResources().getText(R.string.clkbtn_4);
        }
        Toast t = Toast.makeText(getApplicationContext(), c, Toast.LENGTH_SHORT);
        t.show();
    }
}