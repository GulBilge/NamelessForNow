package com.bilgeoutlook.gul.buildingyourfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String email = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
       /* TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(email);*/
        String psw = intent.getStringExtra(MainActivity.EXTRA_PSW);

       /* TextView textPSWView = new TextView(this);
        textPSWView.setTextSize(40);
        textPSWView.setText(psw);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
        layout.addView(textPSWView);*/

        TextView textView1=(TextView) findViewById(R.id.textView);
        textView1.setText(email);

        TextView textView2=(TextView)findViewById(R.id.textPSWView);
        textView2.setText(psw);
    }
}
