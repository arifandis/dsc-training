package com.xavier.dsc_training.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xavier.dsc_training.Pojo.Employee;
import com.xavier.dsc_training.R;

import java.util.List;

public class EmployeeRecyclerAdapter extends RecyclerView.Adapter<EmployeeRecyclerAdapter.ViewHolder>{

    private List<Employee> listitem;
    private Context context;

    public EmployeeRecyclerAdapter(List<Employee> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name,position,company;

        public ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.nama_id);
            position = view.findViewById(R.id.position_id);
            company = view.findViewById(R.id.company_id);
        }

    }
    @Override
    public EmployeeRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeRecyclerAdapter.ViewHolder holder, int position) {
        final Employee item= listitem.get(position);
        holder.name.setText(item.getmNama());
        holder.position.setText(item.getmPosition());
        holder.company.setText(item.getmCompany());

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }
}
