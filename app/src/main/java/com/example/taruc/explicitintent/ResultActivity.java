package com.example.taruc.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);

        textViewMessage.setText(message);
    }

    public void closeActivity(View v){

        finish();
    }
}
