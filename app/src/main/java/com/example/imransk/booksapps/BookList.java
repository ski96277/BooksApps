package com.example.imransk.booksapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BookList extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        listView = (ListView) findViewById(R.id.ListItem);
        String[] bookname={"আমি তপু"};
        int[] bookimage = {R.drawable.amitopu};
        CustomAdapter myAdapter = new CustomAdapter(this,bookname,bookimage);
        listView.setAdapter(myAdapter);
    }
}
