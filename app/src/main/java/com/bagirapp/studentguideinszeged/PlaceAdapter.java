package com.bagirapp.studentguideinszeged;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

/**
 * Created by User on 2018.03.23..
 */

public class PlaceAdapter extends ArrayAdapter {
    public PlaceAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = (Place) getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.buildingPic);
        if (currentPlace.hasImage()) {
            image.setImageResource(currentPlace.getImageResourceId());
            image.setVisibility(View.VISIBLE);

        } else {
            image.setVisibility(View.GONE);
        }

        TextView name = (TextView) listItemView.findViewById(R.id.placeName);
        name.setText(currentPlace.getName());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentPlace.getAddress());

        TextView description = (TextView) listItemView.findViewById(R.id.description);
        if (currentPlace.getEmail() != null) {
            description.setText(currentPlace.getPhone());
            description.setVisibility(View.VISIBLE);
        } else {
            description.setVisibility(View.GONE);
        }

        TextView email = (TextView) listItemView.findViewById(R.id.email);
        if (currentPlace.getEmail() != null) {
            email.setText(currentPlace.getEmail());
            email.setVisibility(View.VISIBLE);
        } else {
            email.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
