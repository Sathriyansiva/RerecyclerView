package com.example.venusankaran.rerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView description;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        description=(TextView)findViewById(R.id.textView);

        s1=getIntent().getStringExtra("1");

        description.setText(s1);

    }
}
