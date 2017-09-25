package com.example.imransk.booksapps;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Imran Sk on 4/29/2017.
 */

public class CustomAdapter extends BaseAdapter {
    String[] namez;
    int[] image;
    Context ct;
    private  static LayoutInflater inflater = null;
    public CustomAdapter(BookList mainact, String[] bookname, int[] bookimage) {
        namez = bookname;
        image = bookimage;
        ct = mainact;
        inflater = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return namez.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public  class myholder{
        ImageView imageView;
        TextView textView;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        myholder myholderobj = new myholder();
        convertView = inflater.inflate(R.layout.custom_layout,null);

        myholderobj.imageView  = (ImageView) convertView.findViewById(R.id.imageview);
        myholderobj.textView = (TextView) convertView.findViewById(R.id.textView);
        myholderobj.textView.setText(namez[position]);
        myholderobj.imageView.setImageResource(image[position]);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (namez[position]=="আমি তপু"){
                    Toast.makeText(ct,namez[position],Toast.LENGTH_SHORT).show();
                    Intent topupdf = new Intent(ct.getApplicationContext(),TopuPdf.class);
                    ct.startActivity(topupdf);
                }
            }
        });
        return convertView;
    }
}
