package com.gdgthess.liz.appportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        // Initialize all buttons
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
    }

    public void onBtnClicked(View view){
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "'Spotify Streamer' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "'Scores App' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "'Library App' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getApplicationContext(), "'Build It Bigger' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(getApplicationContext(), "'XYZ Reader' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(getApplicationContext(), "'Capstone' is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
