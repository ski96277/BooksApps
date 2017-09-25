package com.example.imransk.booksapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// this is the the button that you declear in main xml file
    public void BookList(View view) {
        Intent intent =new Intent(getApplicationContext(),BookList.class);
        startActivity(intent);

    }
}
