package com.example.nlpc06.fragmenttest.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.nlpc06.fragmenttest.Interfaces.Communicator;
import com.example.nlpc06.fragmenttest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment implements View.OnClickListener {

    private EditText etData;
    private Button btnSend,btnBack;

    private Communicator communicator;


    public FragmentB() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        communicator = (Communicator) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        initView(view);

        return view;
    }

    private void initView(View view) {
        etData = view.findViewById(R.id.et_data);
        btnSend = view.findViewById(R.id.btn_send);
        btnBack = view.findViewById(R.id.btn_back);

        btnSend.setOnClickListener(this);
        btnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.equals(btnSend)){
            /*String data = etData.getText().toString();

            if(communicator!=null){
                Log.d("HHHH","cumu not null");
                communicator.setData(data);
            }*/
        }else if(v.equals(btnBack)){
            FragmentManager manager = getFragmentManager();

            manager.popBackStack();
        }


    }

    public void setData(String data){
        etData.setText(data);
    }
}
