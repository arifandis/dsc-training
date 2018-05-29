package com.xavier.dsc_training.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xavier.dsc_training.Adapter.CompanyRecyclerAdapter;
import com.xavier.dsc_training.Adapter.EmployeeRecyclerAdapter;
import com.xavier.dsc_training.Pojo.Company;
import com.xavier.dsc_training.Pojo.Employee;
import com.xavier.dsc_training.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Companyragment extends Fragment {
    private List<Company> mCompany  = new ArrayList<>();
    private RecyclerView mRecyclerView;
    CompanyRecyclerAdapter mAdapter;


    public Companyragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_companyragment, container, false);

        mRecyclerView = v.findViewById(R.id.recycler_company);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        mRecyclerView.setLayoutManager(layoutManager);

        mCompany.add(new Company("Traveloka","Jakarta"));
        mCompany.add(new Company("BliBli","Jakarta"));
        mCompany.add(new Company("Gumcode","Malang"));
        mCompany.add(new Company("Google","USA"));

        mAdapter = new CompanyRecyclerAdapter(mCompany,getContext());
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        return v;
    }

}
