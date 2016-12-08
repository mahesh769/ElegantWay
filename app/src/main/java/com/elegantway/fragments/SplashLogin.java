package com.elegantway.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.elegantway.MainActivity;
import com.elegantway.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SplashLogin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SplashLogin extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SplashLogin() {
        // Required empty public constructor
    }


    public static SplashLogin newInstance(String param1, String param2) {
        SplashLogin fragment = new SplashLogin();
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
       View view=inflater.inflate(R.layout.fragment_splash_login, container, false);
        Button mLoginBtn=(Button)view.findViewById(R.id.mLoginBtn);
        mLoginBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mLoginBtn:
                Intent i=new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
                break;
        }
    }
}
