package com.example.latrobe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class User extends AppCompatActivity {

    FirebaseAuth auth;
    Button b1;
    TextView t1;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        auth= FirebaseAuth.getInstance();
        b1= findViewById(R.id.button11);
        t1= findViewById(R.id.textView9);
        user= auth.getCurrentUser();
        if(user==null){
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            t1.setText(user.getEmail());
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //LogOut The User
                FirebaseAuth.getInstance().signOut();
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
