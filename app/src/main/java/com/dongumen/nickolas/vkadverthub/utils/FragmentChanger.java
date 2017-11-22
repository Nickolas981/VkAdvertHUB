package com.dongumen.nickolas.vkadverthub.utils;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;


public class FragmentChanger {

    FragmentTransaction fragT;
    Fragment currentFragment;
    int id;
    Activity activity;

    public FragmentChanger(int id, Activity activity) {
        this.id = id;
        this.activity = activity;
    }

    public void changeFragment(Bool init, android.app.Fragment fragment) {
        fragT = activity.getFragmentManager().beginTransaction();
        if (!init.b) {
            fragT.add(id, fragment).commit();
            init.b = true;
        } else {
            fragT.hide(currentFragment).show(fragment).commit();
        }
        currentFragment = fragment;
    }

    public static class Bool {
        boolean b;
    }

}
