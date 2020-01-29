package com.example.webget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView webText;
    private Button getButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webText = findViewById(R.id.textview_HTML);
        getButton = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        editText.setText("");

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(editText.getText().toString().isEmpty())) {
                    new GetPage(webText).execute(editText.getText().toString());
                }
            }
        });

    }
}
