package com.example.coffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        TextView register = (TextView)findViewById(R.id.textView8);
        TextView alreadyHaveAnAccount = findViewById(R.id.textView4);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText nameText = findViewById(R.id.editTextTextPersonName);
                final EditText phoneText = findViewById(R.id.editTextPhone);
                final EditText emailText = findViewById(R.id.editTextTextEmailAddress);
                final EditText passwordText = findViewById(R.id.editTextTextPassword);
                String name = nameText.getText().toString();
                int phone = Integer.parseInt(phoneText.getText().toString());
                String email = emailText .getText().toString();
                String password = passwordText.getText().toString();


                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("info");
                dataContract data = new dataContract(name,phone,email,password);
                /*data.setName(name);
                data.setPhone(phone);
                data.setEmail(email);
                data.setPassword(password);*/
                reference.child(phoneText.getText().toString()).setValue(data);

                Intent i = new Intent(RegisterActivity.this , FooditemActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Account Registered", Toast.LENGTH_SHORT).show();
            }
        });

        alreadyHaveAnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegisterActivity.this , LoginActivity.class);
                startActivity(i);
            }
        });
    }
}