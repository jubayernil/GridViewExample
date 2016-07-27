package com.tareq.mygridviewexample;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 27-7-16.
 */
public class Picture {
    private String imageName;
    private int pictureId;

    //default constructor for calling this class in another class without parameter
    public Picture() {
    }

    //constructor for seeting the value of class property
    public Picture(String imageName, int pictureId) {
        this.imageName = imageName;
        this.pictureId = pictureId;
    }

    //all getter setter
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    //a collection of resource
    public ArrayList<Picture> getAllPicture(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("Love Image 1", R.drawable.love1));
        pictures.add(new Picture("Love Image 2", R.drawable.love2));
        pictures.add(new Picture("Love Image 3", R.drawable.love3));
        pictures.add(new Picture("Love Image 4", R.drawable.love4));
        pictures.add(new Picture("Love Image 5", R.drawable.love5));
        pictures.add(new Picture("Love Image 6", R.drawable.love6));
        pictures.add(new Picture("Love Image 7", R.drawable.love7));
        pictures.add(new Picture("Love Image 8", R.drawable.love8));

        return pictures;
    }
}
