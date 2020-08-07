package com.rifkidev.financemanager.activities;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

import android.view.View;


import com.rifkidev.financemanager.R;
import com.rifkidev.financemanager.adapters.SectionsPageAdapter;
import com.rifkidev.financemanager.fragments.BalanceFragment;
import com.rifkidev.financemanager.fragments.CustomBottomSheetDialogFragment;
import com.rifkidev.financemanager.fragments.ExpenseFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    public static FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mViewPager=findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


         fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CustomBottomSheetDialogFragment().show(getSupportFragmentManager(), "Dialog");

            }
        });

    }




    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter=new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new ExpenseFragment(),"Expenses");
        adapter.addFragment(new BalanceFragment(),"Balance");
        viewPager.setAdapter(adapter);
    }



}
