package com.aarisfauji.applistteman.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aarisfauji.applistteman.R;
import com.aarisfauji.applistteman.adapter.CustomPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View myView;
    ViewPager viewPager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = (ViewPager) myView.findViewById(R.id.viewpager1);
        viewPager.setAdapter(new CustomPagerAdapter(getActivity()));
        return  myView;
    }

}
