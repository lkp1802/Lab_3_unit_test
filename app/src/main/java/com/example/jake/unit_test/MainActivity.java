package com.example.jake.unit_test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText text_1;
    private EditText text_2;
    private TextView sum_text;
    //private Button button;
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
        text_1 = (EditText) findViewById(R.id.edit_1);
        text_2 = (EditText) findViewById(R.id.edit_2);
        sum_text = (TextView) findViewById(R.id.result_sum);

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

    public void sumBoxes(View v){
        Double sum = 0.0;
        Scanner scan_1 = new Scanner(text_1.getText().toString());
        Scanner scan_2 = new Scanner(text_2.getText().toString());
        try {
            Double num_1 = scan_1.nextDouble();
            Double num_2 = scan_2.nextDouble();
            sum = num_1 + num_2;
        }
        catch(Exception e) {
            sum_text.setText("Invalid input. Please try again!");
            return;
        }
        sum_text.setText(sum.toString());
    }

}
