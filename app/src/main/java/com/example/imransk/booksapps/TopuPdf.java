package com.example.imransk.booksapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TopuPdf extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topu_pdf);

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("amitopu.pdf").load();
    }
}
