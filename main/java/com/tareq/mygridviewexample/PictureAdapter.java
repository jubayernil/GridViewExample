package com.tareq.mygridviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 27-7-16.
 */
public class PictureAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Picture> pictures;

    public PictureAdapter(Context context, ArrayList<Picture> pictures) {
        super();
        this.pictures = pictures;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pictures.size();
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView textViewText;
        ImageView imageViewImage;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, null);
            viewHolder.textViewText = (TextView) convertView.findViewById(R.id.TextViewText);
            viewHolder.imageViewImage = (ImageView) convertView.findViewById(R.id.ImageViewImage);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        //Toast.makeText(context, "adapter", Toast.LENGTH_SHORT).show();
        viewHolder.textViewText.setText(pictures.get(i).getImageName());
        viewHolder.imageViewImage.setImageResource(pictures.get(i).getPictureId());

        /*imageViewImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), ImageDetailActivity.class);
                intent.putExtra("image", pictures.get(i).getPictureId());
                intent.putExtra("name", pictures.get(i).getImageName());
                context.startActivity(intent);
            }
        });*/

        return convertView;
    }
}
