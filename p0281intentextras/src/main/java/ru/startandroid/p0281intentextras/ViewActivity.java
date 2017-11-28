package ru.startandroid.p0281intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvViev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        tvViev = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname");
        String lname =  intent.getStringExtra("lname");

        tvViev.setText("Your name is:" + fname + " " + lname);
    }
}
