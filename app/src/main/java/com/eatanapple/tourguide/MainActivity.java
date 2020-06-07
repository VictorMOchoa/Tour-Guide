package com.eatanapple.tourguide;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


public class MainActivity extends AppCompatActivity {
    String[] tabs = {"Long Beach", "Torrance", "Wilmington"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.viewpager);
        FragmentAdapter adapter = new FragmentAdapter(this);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        new TabLayoutMediator(tabLayout, viewPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabs[position]);
                    }
                }).attach();

//        tabLayout.setupW

    }
}
