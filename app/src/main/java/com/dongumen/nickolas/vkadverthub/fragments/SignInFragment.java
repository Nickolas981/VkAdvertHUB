package com.dongumen.nickolas.vkadverthub.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.dongumen.nickolas.vkadverthub.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SignInFragment extends Fragment {


    @BindView(R.id.email)
    EditText emailET;
    @BindView(R.id.password)
    EditText passET;
    @BindView(R.id.submit)
    EditText submitButton;

    public static SignInFragment newInstance(){
        return new SignInFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_sign_in, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

}
