//7-31 Tried to setContentView when the EditText object contains a distinct string onClick
//      This only works when I click enter after typing, AND if I click the EditText field

package com.example.gettodaze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View v){
        String text = ((TextView) v).getText().toString();
            if (text.equals("black"))
                setContentView(R.layout.black_screen);


    }
}