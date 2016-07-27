package com.tareq.mygridviewexample;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageDetailActivity extends AppCompatActivity {

    TextView textViewText;
    ImageView imageViewImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_detail);

        textViewText = (TextView) findViewById(R.id.TextViewText);
        imageViewImage = (ImageView) findViewById(R.id.ImageViewImage);

        Intent intent = getIntent();

        String imageName = intent.getStringExtra("name");
        int imageId = intent.getIntExtra("image",0);


        textViewText.setText(intent.getStringExtra("name"));
        imageViewImage.setImageResource(imageId);
    }
}
