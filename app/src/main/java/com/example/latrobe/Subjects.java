package com.example.latrobe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Subjects extends AppCompatActivity {

    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects);

        b1= findViewById(R.id.button7);
        b2= findViewById(R.id.button8);
        b3= findViewById(R.id.button9);
        b4= findViewById(R.id.button10);


        //Sending string  in bundle with the help of Intent, to check which button was clicked
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle er=new Bundle();
                String a= "1";
                er.putString("su",a);
                Intent i=new Intent(Subjects.this,Subjects2.class);
                i.putExtras(er);
                startActivityForResult(i,1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle er=new Bundle();
                String a= "2";
                er.putString("su",a);
                Intent i=new Intent(Subjects.this,Subjects2.class);
                i.putExtras(er);
                startActivityForResult(i,1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle er=new Bundle();
                String a= "3";
                er.putString("su",a);
                Intent i=new Intent(Subjects.this,Subjects2.class);
                i.putExtras(er);
                startActivityForResult(i,1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle er=new Bundle();
                String a= "4";
                er.putString("su",a);
                Intent i=new Intent(Subjects.this,Subjects2.class);
                i.putExtras(er);
                startActivityForResult(i,1);
            }
        });
    }
}
