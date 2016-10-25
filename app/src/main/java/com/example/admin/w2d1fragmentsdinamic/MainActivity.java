package com.example.admin.w2d1fragmentsdinamic;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String MY_TAG = "MY_TAG_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void blueFragment(View view) {
        BlankFragment blankFragment = new BlankFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.aMainFrame, blankFragment, MY_TAG).commit();
    }

    public void redFragment(View view) {
        RedFragment redFragment = new RedFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.aMainFrame, redFragment, MY_TAG).commit();
    }

    public void greenFragment(View view) {
        GreenFragment greenFragment = new GreenFragment();
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.aMainFrame, greenFragment, MY_TAG).commit();
    }
}
