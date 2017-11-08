package com.example.nlpc06.fragmenttest.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.nlpc06.fragmenttest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    private TextView tvData;
    private Button btnLoad;


    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        initView(view);


        return view;
    }

    private void initView(View view) {
        tvData = view.findViewById(R.id.tv_data);
        btnLoad = view.findViewById(R.id.load_frag_b);

        btnLoad.setOnClickListener(this);

    }

    public void setData(String data){
        tvData.setText(data);
    }


    @Override
    public void onClick(View v) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.main_container,new FragmentB()).addToBackStack(null).commit();
    }
}
