/*
 *
 *  * Created by Murillo Comino on 18/09/19 16:45
 *  * Github: github.com/MurilloComino
 *  * StackOverFlow: pt.stackoverflow.com/users/128573
 *  * Email: murillo_comino@hotmail.com
 *  *
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 18/09/19 16:41
 *
 */

package com.onimus.tablayoutviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] fragmentListTitles;

    ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int i) {
        return MainFragment.newInstance(fragmentListTitles[i]);
    }

    @Override
    public int getCount() {
        return fragmentListTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles[position];
    }

    void addTitle(String... listTitle) {
        fragmentListTitles = listTitle;
    }
}

