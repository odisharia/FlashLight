package com.example.teo.myapplication;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    public RelativeLayout Rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rl = (RelativeLayout) findViewById(R.id.RelativeLayout);
    }

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button1:
                    Rl.setBackgroundColor(Color.BLUE);
                    break;
                case R.id.button2:
                    Rl.setBackgroundColor(Color.RED);
                    break;
                case R.id.button3:
                    Rl.setBackgroundColor(Color.WHITE);
                    break;
                case R.id.button4:
                    Rl.setBackgroundColor(Color.GRAY);
                    break;
                case R.id.button5:
                    Rl.setBackgroundColor(Color.YELLOW);
                    break;
            }
        }
}
