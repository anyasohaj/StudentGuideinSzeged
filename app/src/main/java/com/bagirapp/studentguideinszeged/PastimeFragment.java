package com.bagirapp.studentguideinszeged;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PastimeFragment extends Fragment {

    ArrayList<Place> pastime = new ArrayList<>();

    public PastimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_place_list, container, false);

        // Get the resource from a string-array and create Place objects from each of the array items (split them to name and address)
        Resources resources = getResources();
        String[] pastimeWithAddress = resources.getStringArray(R.array.pastime);
        String[] splitter = new String[2];

        for (int i = 0; i < pastimeWithAddress.length; i++) {
            splitter = pastimeWithAddress[i].split("/");
            Place place = new Place(splitter[0], splitter[1]);
            pastime.add(place);
        }

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), pastime);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
