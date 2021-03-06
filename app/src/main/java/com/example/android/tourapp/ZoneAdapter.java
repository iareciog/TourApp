package com.example.android.tourapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ZoneAdapter extends ArrayAdapter<Zone>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;
    private Context mContext;

    /**
     * Create a new {@link ZoneAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param zones is the list of {@link Zone}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of zones
     */
    public ZoneAdapter(Context context, ArrayList<Zone> zones, int colorResourceId) {
        super(context, 0, zones);
        mContext = context;
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link Word} object located at this position in the list
        Zone currentZone = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_list.
        TextView zoneName = listItemView.findViewById(R.id.name_list);
        // Get the zone name and set on the zoneName TextView
        if (currentZone != null){
            zoneName.setText(currentZone.getName());

            // Find the ImageView in the list_item.xml layout with the ID image.
            ImageView imageView = listItemView.findViewById(R.id.image);
            // Check if an image is provided for this word or not
            if (currentZone.hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(currentZone.getImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        return listItemView;
    }
}