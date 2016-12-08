package com.elegantway.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elegantway.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomePage extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;


    public WelcomePage() {
        // Required empty public constructor
    }

    public static WelcomePage newInstance(String param1, String param2) {
        WelcomePage fragment = new WelcomePage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_welcome_page, container, false);
        TextView textView=(TextView)view.findViewById(R.id.mTextView);
        String blueString = getResources().getString(R.string.welcome_to_elegantway);
        textView.setText(Html.fromHtml(blueString));
        return view;
    }

}
