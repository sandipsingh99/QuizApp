package com.a1694162.amandeep.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Blue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
    }
    public void buyBlue(View view)
    {
        Intent intent=new Intent(this,ItemList.class);
        startActivity(intent);
        Toast.makeText(this, "Bought", Toast.LENGTH_SHORT).show();


    }
}
