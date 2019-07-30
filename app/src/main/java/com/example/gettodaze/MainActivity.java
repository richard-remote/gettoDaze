package com.example.gettodaze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void touch(View v){
        text = ((TextView) v).getText().toString();

            if (text.equals("empty"))
                text = "Leaving this alone for now";
    }
    
}
