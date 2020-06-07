package com.eatanapple.tourguide;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {

    public FragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new LongBeachFragment();
            case 2:
                return new LongBeachFragment();
            case 3:
                return new LongBeachFragment();
        }
        return new LongBeachFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}