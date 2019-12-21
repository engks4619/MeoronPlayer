package com.example.meoronplayer;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SlidePagerAdapter extends FragmentStatePagerAdapter {
    private static final int NUM_PAGES = 5;
    private String tabTitles[] = {"노래","앨범","아티스트","장르","나만의 플레이리스트"};
    public SlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }      // FragmentStatePagerAdapter는 프레그먼트가 사라지면 프레그먼트 상태를 유지해준다
    @Override
    public Fragment getItem(int position) {     // 하나의 페이지를 어떻게 만드는지(구성할지) 결정하는 역할
        switch (position) {
            case 0:
                SongFragment tab1 = new SongFragment();
                return tab1;
            case 1:
                ArtistFragment tab2 = new ArtistFragment();
                return tab2;
            case 2:
                AlbumFragment tab3 = new AlbumFragment();
                return tab3;
            case 3:
                GenreFragment tab4 = new GenreFragment();
                return tab4;
            case 4:
                PlayListFragment tab5 = new PlayListFragment();
                return tab5;
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
