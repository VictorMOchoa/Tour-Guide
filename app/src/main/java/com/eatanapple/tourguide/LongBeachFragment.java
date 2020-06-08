package com.eatanapple.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class LongBeachFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_long_beach, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.attractions_rv);
        List<Attraction> attractions = new ArrayList<>();
        Attraction aquarium = new Attraction("The Aquarium of The Pacific", "8:00AM - 8:00PM", "100 Aquarium Way, Long Beach, CA 90802", "park");
        Attraction kingTaco = new Attraction("King Taco", "9:00AM - 10:00PM", "1841 Long Beach Blvd Long Beach, CA 90806", "food");
        Attraction walterPyramid = new Attraction("Walter Pyramid", "10:00AM - 5:00PM", "1250 N Bellflower Blvd, Long Beach, CA 90840", "school");
        Attraction queenMary = new Attraction("The Queen Mary", "8:00AM - 5:00PM", "1126 Queens Hwy, Long Beach, CA 90802", "school");
        attractions.add(aquarium);
        attractions.add(kingTaco);
        attractions.add(walterPyramid);
        attractions.add(queenMary);



        AttractionAdapter adapter = new AttractionAdapter(getContext(), attractions);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

}
