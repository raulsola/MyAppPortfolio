package com.raulsola.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view) {
        Context context = getApplicationContext();
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        CharSequence text = getString(R.string.toast_text) + " " + buttonText.toLowerCase() + " " + getString(R.string.app);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
