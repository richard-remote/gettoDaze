//7-31 Tried to setContentView when the EditText object contains a distinct string onClick
//      This only works when I click enter after typing, AND if I click the EditText field

package com.example.gettodaze;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnKeyListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = (EditText) findViewById(R.id.input);
        input.setOnKeyListener(this);
    }

    @Override
    public boolean onKey(View view, int keyCode, KeyEvent event) {

        TextView responseText = (TextView) findViewById(R.id.responseText);
        EditText myEditText = (EditText) view;

        if (keyCode == EditorInfo.IME_ACTION_SEARCH ||
                keyCode == EditorInfo.IME_ACTION_DONE ||
                event.getAction() == KeyEvent.ACTION_DOWN &&
                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {

            if (!event.isShiftPressed()) {
                Log.v("AndroidEnterKeyActivity","Enter Key Pressed!");
                //if
                /*
                switch (view.getId()) {
                    case R.id.editText:
                        responseText
                                .setText("Just pressed the ENTER key, " +
                                        "focus was on Text Box1. " +
                                        "You typed:\n" + myEditText.getText());
                        break;
                    case R.id.editText2:
                        responseText
                                .setText("Just pressed the ENTER key, " +
                                        "focus was on Text Box2. " +
                                        "You typed:\n" + myEditText.getText());
                        break;
                }
                */
                return true;
            }

        }
        return false; // pass on to other listeners.

    }
}