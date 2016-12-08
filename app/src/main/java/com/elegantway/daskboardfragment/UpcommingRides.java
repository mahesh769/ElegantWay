package com.elegantway.daskboardfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elegantway.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpcommingRides extends Fragment {


    public UpcommingRides() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_upcomming_rides, container, false);
        return view;
    }

}
