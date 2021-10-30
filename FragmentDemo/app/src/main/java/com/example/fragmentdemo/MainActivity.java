package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFrag();
    }

    public void addFrag(){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction  transaction = manager.beginTransaction();
        FragmentDynamic dynamic = new FragmentDynamic();
        transaction.add(R.id.fragcontainer,dynamic);
        transaction.commit();

    }

}