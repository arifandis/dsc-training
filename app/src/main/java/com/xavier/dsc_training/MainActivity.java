package com.xavier.dsc_training;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xavier.dsc_training.Adapter.ViewPager;
import com.xavier.dsc_training.Fragment.Companyragment;
import com.xavier.dsc_training.Fragment.EmployeeFragment;

public class MainActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    android.support.v4.view.ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tablayout_id);
        mViewPager = findViewById(R.id.viewpager_id);
        ViewPager adapter = new ViewPager(getSupportFragmentManager());

        adapter.addFragment(new EmployeeFragment(),"Employee");
        adapter.addFragment(new Companyragment(),"Company");

        mViewPager.setAdapter(adapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
}
