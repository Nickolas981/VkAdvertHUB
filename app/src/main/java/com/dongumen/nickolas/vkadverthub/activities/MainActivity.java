package com.dongumen.nickolas.vkadverthub.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dongumen.nickolas.vkadverthub.EntryButtonListener;
import com.dongumen.nickolas.vkadverthub.R;
import com.dongumen.nickolas.vkadverthub.fragments.EntryFragment;
import com.dongumen.nickolas.vkadverthub.fragments.SignInFragment;
import com.dongumen.nickolas.vkadverthub.utils.FragmentChanger;
import com.vk.sdk.VKSdk;
import com.vk.sdk.util.VKUtil;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements EntryButtonListener {

    FragmentChanger fragmentChanger;
    FragmentChanger.Bool entryBool = new FragmentChanger.Bool();
    FragmentChanger.Bool signInBool = new FragmentChanger.Bool();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(Arrays.toString(VKUtil.
                getCertificateFingerprint(this, this.getPackageName())));
        fragmentChanger = new FragmentChanger(R.id.frame, this);
        if (!VKSdk.isLoggedIn()){
            fragmentChanger.changeFragment(entryBool, EntryFragment.newInstance(this));
        }

    }

    @Override
    public void buttonPressed() {
        fragmentChanger.changeFragment(signInBool, SignInFragment.newInstance());
    }
}
