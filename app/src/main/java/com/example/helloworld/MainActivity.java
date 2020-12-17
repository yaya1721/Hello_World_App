package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // User can tap a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.orange));           }
        });

        // User can tap a button to change the color of the background view.
        findViewById(R.id.changeBgBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text color of the background
                (findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.yellow));           }
        });

        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the text
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");           }
        });

        // User can tap on the background view to reset all views to default settings.
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1.Reset the text to Hello from Sonya @id/text
                textView.setText("Hello from Sonya!");

                // 2.Reset the text color to black @id/text
                textView.setTextColor(getResources().getColor(R.color.black));

                // 3.Reset the bg color to blue s@id/parent
                (findViewById(R.id.parent)).setBackgroundColor(getResources().getColor(R.color.blue));

            }
        });

        // User can update the label text with custom text entered into the text field.
        findViewById(R.id.changeCustomTextBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the text view to the user input
                String userInput = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (userInput.isEmpty()){
                    textView.setText("Please enter your own text!");
                } else{
                    textView.setText(userInput);
                }
            }
        });


    }
}