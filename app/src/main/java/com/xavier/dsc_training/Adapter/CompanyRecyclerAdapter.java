package com.xavier.dsc_training.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xavier.dsc_training.Pojo.Company;
import com.xavier.dsc_training.R;

import java.util.List;

public class CompanyRecyclerAdapter extends RecyclerView.Adapter<CompanyRecyclerAdapter.ViewHolder>{
    private List<Company> listitem;
    private Context context;

    public CompanyRecyclerAdapter(List<Company> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name,company;

        public ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.nama_company_id);
            company = view.findViewById(R.id.alamamt_id);
        }

    }
    @Override
    public CompanyRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.company_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CompanyRecyclerAdapter.ViewHolder holder, int position) {
        final Company item= listitem.get(position);
        holder.name.setText(item.getmNameCompany());
        holder.company.setText(item.getmAddress());

    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }
}
