package com.example.meoronplayer;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 5;
    private String tabTitles[] = {"노래","앨범","아티스트","장르","재생목록"};
    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }      // FragmentStatePagerAdapter는 프레그먼트가 사라지면 프레그먼트 상태를 유지해준다
    @Override
    public Fragment getItem(int position) {     // 하나의 페이지를 어떻게 만드는지(구성할지) 결정하는 역할.
        switch (position) {
            case 0:
                return SongFragment.newInstance(0,"title");
            case 1:
                return SongFragment.newInstance(0,"title");
            case 2:
                return SongFragment.newInstance(0,"title");
            case 3:
                return SongFragment.newInstance(0,"title");
            case 4:
                return SongFragment.newInstance(0,"title");
            default:
                return null;

        }
    }

    @Override
    public int getCount() {     // 페이지의 숫자, 위에서 5개로 선언해놨음
        return  NUM_PAGES;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
