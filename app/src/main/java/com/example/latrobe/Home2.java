package com.example.latrobe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Home2 extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home2);
        b1=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home2.this,Subjects.class));
            }
        });

        b2=findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home2.this,Announcements.class));
            }
        });

        b3=findViewById(R.id.button6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSms();
            }
        });

        b3=findViewById(R.id.button5);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home2.this,User.class));
            }
        });
    }

    private void sendSms(){

        //Ask LaTrober For Help By Sending Message On Number
        Intent obj=new Intent(Intent.ACTION_VIEW, Uri.parse("sms:"+"+61 406 734 385"));
        obj.putExtra("sms_body","Hey I need help!");
        startActivity(obj);
    }
}
