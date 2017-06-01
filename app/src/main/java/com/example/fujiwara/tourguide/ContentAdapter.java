package com.example.fujiwara.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ContentAdapter extends ArrayAdapter<Content> {

    public ContentAdapter(Context context, ArrayList<Content> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.content, parent, false);
            holder = new ViewHolder();
            holder.attractionDescription = (TextView) convertView.findViewById(R.id.description);
            holder.attractionTitle = (TextView) convertView.findViewById(R.id.title);
            holder.imageView = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        }

        Content currentObject = getItem(position);

        holder.attractionDescription.setText(currentObject.geTextContentId());
        holder.attractionTitle.setText(currentObject.getAttractionTitleId());
        holder.imageView.setImageResource(currentObject.getImageResourceId());

        return convertView;
    }

    static class ViewHolder {
        private TextView attractionDescription;
        private TextView attractionTitle;
        private ImageView imageView;
    }
}