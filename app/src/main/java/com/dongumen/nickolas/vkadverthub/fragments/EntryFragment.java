package com.dongumen.nickolas.vkadverthub.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.dongumen.nickolas.vkadverthub.EntryButtonListener;
import com.dongumen.nickolas.vkadverthub.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class EntryFragment extends Fragment {

    EntryButtonListener entryButtonListener;
    @BindView(R.id.sign_in)
    Button signInButton;

    public static EntryFragment newInstance(EntryButtonListener entryButtonListener) {
        EntryFragment fragment = new EntryFragment();
        fragment.entryButtonListener = entryButtonListener;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_entry, container, false);
        ButterKnife.bind(this, view);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                entryButtonListener.buttonPressed();
            }
        });
        return view;
    }




}
