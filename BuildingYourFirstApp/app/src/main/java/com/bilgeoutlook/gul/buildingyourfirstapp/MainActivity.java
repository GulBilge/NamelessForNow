package com.bilgeoutlook.gul.buildingyourfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_EMAIL = "com.bilgeoutlook.buildingyourfirstapp.EMAIL";
    public final static String EXTRA_PSW = "com.bilgeoutlook.buildingyourfirstapp.PSW";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText emailText = (EditText) findViewById(R.id.email);
        String email = emailText.getText().toString();
        intent.putExtra(EXTRA_EMAIL, email);
        EditText pswText = (EditText) findViewById(R.id.password);
        String psw = pswText.getText().toString();
        intent.putExtra(EXTRA_PSW, psw);
        startActivity(intent);
    }
}
