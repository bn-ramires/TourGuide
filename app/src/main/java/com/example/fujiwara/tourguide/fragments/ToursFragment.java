package com.example.fujiwara.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fujiwara.tourguide.Content;
import com.example.fujiwara.tourguide.ContentAdapter;
import com.example.fujiwara.tourguide.R;

import java.util.ArrayList;

public class ToursFragment extends Fragment {

    public ToursFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.tour_1916, R.string.tour1, R.drawable.tour_1916));
        content.add(new Content(R.string.tcd, R.string.tour2, R.drawable.tcd));

        ContentAdapter adapter = new ContentAdapter(getActivity(), content);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}