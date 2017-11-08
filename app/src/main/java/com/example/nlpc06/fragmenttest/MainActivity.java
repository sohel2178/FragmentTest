package com.example.nlpc06.fragmenttest;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.nlpc06.fragmenttest.Fragments.FragmentA;
import com.example.nlpc06.fragmenttest.Fragments.FragmentB;
import com.example.nlpc06.fragmenttest.Interfaces.Communicator;

public class MainActivity extends AppCompatActivity implements Communicator {


    private FragmentManager manager;

    FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();

        fragmentA = new FragmentA();

        FragmentTransaction transaction =manager.beginTransaction();

        transaction.replace(R.id.main_container,fragmentA).commit();




    }

    @Override
    public void setData(String data) {

        Log.d("HHHH",data);


    }
}
