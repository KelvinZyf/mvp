package com.example.kelvin.example.movies;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kelvin.example.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {


    public MovieFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

}
