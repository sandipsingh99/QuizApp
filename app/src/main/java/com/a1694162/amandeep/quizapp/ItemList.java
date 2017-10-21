package com.a1694162.amandeep.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }
    public void blueShirt(View view)
    {
        Intent intent=new Intent(this,Blue.class);
        startActivity(intent);
   }
    public void blueText1(View view)
    {
        Intent intent=new Intent(this,Blue.class);
        startActivity(intent);
    }
    public void blueText2(View view)
    {
        Intent intent=new Intent(this,Blue.class);
        startActivity(intent);
    }


    public void blackShirt(View view)
    {
        Intent intent=new Intent(this,Black.class);
        startActivity(intent);
    }

    public void blackText1(View view)
    {
        Intent intent=new Intent(this,Black.class);
        startActivity(intent);
    }
    public void blackText2(View view)
    {
        Intent intent=new Intent(this,Black.class);
        startActivity(intent);
    }

    public void blackPrintedShirt(View view)
    {
        Intent intent=new Intent(this,BlackPrint.class);
        startActivity(intent);
    }
    public void blackPrintText1(View view)
    {
        Intent intent=new Intent(this,BlackPrint.class);
        startActivity(intent);
    }
    public void blackPrintText2(View view)
    {
        Intent intent=new Intent(this,BlackPrint.class);
        startActivity(intent);
    }


    public void redShirt(View view)
    {
        Intent intent=new Intent(this,Red.class);
        startActivity(intent);
    }
    public void redText1(View view)
    {
        Intent intent=new Intent(this,Red.class);
        startActivity(intent);
    }
    public void redText2(View view)
    {
        Intent intent=new Intent(this,Red.class);
        startActivity(intent);
    }



    public void greyShirt(View view)
    {
        Intent intent=new Intent(this,Grey.class);
        startActivity(intent);
    }

    public void greyText1(View view)
    {
        Intent intent=new Intent(this,Grey.class);
        startActivity(intent);
    }
    public void greyText2(View view)
    {
        Intent intent=new Intent(this,Grey.class);
        startActivity(intent);
    }




}
