package com.example.android.tourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Zone> zones = new ArrayList<>();
        zones.add(new Zone(R.string.park_almunia, R.string.text_p_almunia));
        zones.add(new Zone(R.string.park_garcialorca, R.string.text_p_garcialorca));
        zones.add(new Zone(R.string.park_cruz_lagos, R.string.text_p_cruz_lagos));
        zones.add(new Zone(R.string.park_triunfo, R.string.text_p_triunfo));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ZoneAdapter adapter = new ZoneAdapter(getActivity(), zones, R.color.colorPark);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Zone zone = zones.get(position);

                Intent infoIntent = new Intent(getActivity(), InfoActivity.class);
                infoIntent.putExtra("zoneName", zone.getName());
                infoIntent.putExtra("zoneText", zone.getText());
                if (getActivity() != null){
                    getActivity().startActivity(infoIntent);
                }

            }
        });

        return rootView;
    }

}
