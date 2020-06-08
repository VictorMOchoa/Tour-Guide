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

        List<Attraction> attractions = setupAttractionsList();

        RecyclerView recyclerView = view.findViewById(R.id.attractions_rv);

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Attraction> setupAttractionsList() {
        List<Attraction> attractions = new ArrayList<>();
        Attraction aquarium = new Attraction(getResources().getString(R.string.aop_name),
                getResources().getString(R.string.aop_hours),
                getResources().getString(R.string.aop_address),
                R.drawable.aquarium_of_the_pacific);
        Attraction kingTaco = new Attraction(getResources().getString(R.string.king_taco_name),
                getResources().getString(R.string.king_taco_hours),
                getResources().getString(R.string.king_taco_address),
                R.drawable.kingtaco);
        Attraction walterPyramid = new Attraction(getResources().getString(R.string.walter_pyramid_name),
                getResources().getString(R.string.walter_pyramid_hours),
                getResources().getString(R.string.walter_pyramid_address),
                R.drawable.walterpyramid);
        Attraction queenMary = new Attraction(getResources().getString(R.string.queen_mary_name),
                getResources().getString(R.string.queen_mary_hours),
                getResources().getString(R.string.queen_mary_address),
                R.drawable.queenmary);
        attractions.add(aquarium);
        attractions.add(kingTaco);
        attractions.add(walterPyramid);
        attractions.add(queenMary);
        return attractions;
    }

}
