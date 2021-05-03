package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    int showing=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentOne = new FragmentOne();
        fragmentTwo = new FragmentTwo();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mlayout, fragmentOne);
        fragmentTransaction.commit();
        showing = 1;
    }

            public void switchFragment(View view) {
                FragmentManager fragmentManager= getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if(showing==1){
                    fragmentTransaction.replace(R.id.mlayout,fragmentTwo);
                    showing=2;
                }
                else{
                    fragmentTransaction.replace(R.id.mlayout,fragmentOne);
                    showing=1;
                }
                fragmentTransaction.commit();
            }



    }
