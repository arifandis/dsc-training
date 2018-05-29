package com.xavier.dsc_training.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xavier.dsc_training.Adapter.EmployeeRecyclerAdapter;
import com.xavier.dsc_training.Pojo.Employee;
import com.xavier.dsc_training.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmployeeFragment extends Fragment {
    private List<Employee> mEmployee  = new ArrayList<>();
    private RecyclerView mRecyclerView;
    EmployeeRecyclerAdapter mAdapter;


    public EmployeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_employee, container, false);

        mRecyclerView = v.findViewById(R.id.recycler_employee);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        mRecyclerView.setLayoutManager(layoutManager);

        mEmployee.add(new Employee("Alex","Web Developer","BliBli.com"));
        mEmployee.add(new Employee("Joko","Project Manager","Traveloka"));
        mEmployee.add(new Employee("Fanya","Graphic Designer","Tesla"));
        mEmployee.add(new Employee("Bayu","Android Developer","Tokopedia"));

        mAdapter = new EmployeeRecyclerAdapter(mEmployee,getContext());
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        return v;
    }

}
