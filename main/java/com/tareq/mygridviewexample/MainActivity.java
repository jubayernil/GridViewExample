package com.tareq.mygridviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    PictureAdapter pictureAdapter;
    Picture picture;
    ArrayList<Picture> pictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.GridView);
        picture = new Picture();
        pictures = picture.getAllPicture();
        pictureAdapter = new PictureAdapter(this, pictures);
        gridView.setAdapter(pictureAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), ImageDetailActivity.class);
                //the position of list same as the the position of collection
                intent.putExtra("name", pictures.get(i).getImageName());
                intent.putExtra("image", pictures.get(i).getPictureId());
                startActivity(intent);
            }
        });

    }
}
