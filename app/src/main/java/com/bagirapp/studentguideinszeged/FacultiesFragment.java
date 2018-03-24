package com.bagirapp.studentguideinszeged;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FacultiesFragment extends Fragment {

    ArrayList<Place> facultyBuilding = new ArrayList<>();

    public FacultiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_place_list, container, false);

        //// Get the resource from string-arrays
        Resources resources = getResources();
        String[] faculties = resources.getStringArray(R.array.faculties);
        String[] addresses = resources.getStringArray(R.array.faculty_address);
        String[] phone = resources.getStringArray(R.array.faculty_phone);
        String[] email = resources.getStringArray(R.array.faculty_email);
        int[] imageResources = new int[faculties.length];

        // Create an array from image resource IDs
        imageResources[0] = R.drawable.btk;
        imageResources[1] = R.drawable.szte_ttik_bolyai_intezet_700x466;
        imageResources[2] = R.drawable.szte_jgypk_foepulet;
        imageResources[3] = R.drawable.gazdkar;
        imageResources[4] = R.drawable.ajtk;
        imageResources[5] = R.drawable.mernok;
        imageResources[6] = R.drawable.eufk;
        imageResources[7] = R.drawable.aok;
        imageResources[8] = R.drawable.fok;
        imageResources[9] = R.drawable.gytk;

        //  Create Place objects from the arrays
        for (int i = 0; i < faculties.length; i++) {
            Place buildings = new Place(faculties[i], addresses[i], phone[i], email[i], imageResources[i]);
            facultyBuilding.add(buildings);
        }

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), facultyBuilding);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
