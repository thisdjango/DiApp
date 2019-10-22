package com.example.diapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    boolean change = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View v){

        Button btn = findViewById(R.id.button);
        ConstraintLayout root = findViewById(R.id.root);

        if (change) {
            btn.setText("hello, it's me");
            root.setBackgroundColor(Color.argb(255, 0, 0, 0));
        }
        else {
            btn.setText("bye, it isn't me");
            root.setBackgroundColor(Color.argb(255, 255, 255, 255));
        }
        change = !change;
    }

}
