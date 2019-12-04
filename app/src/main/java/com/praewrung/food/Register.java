package com.praewrung.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void signUpClick(View view) {
    }

    public void backClick(View view) {
        Button back = (Button)findViewById(R.id.backbtn);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("Register", "MainActivity");
                Intent backMain = new Intent(Register.this,MainActivity.class);
                startActivity(backMain);
            }
        });
    }

}
