package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    private MyListData[] listData;
    public MyListAdapter(MyListData[] listData){
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final  MyListData myListData = listData[position];
        holder.mName.setText(listData[position].getName());
        holder.mConnect.setText(listData[position].getConnect());
        holder.mCode.setText(listData[position].getCode());

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mName,mConnect,mCode;
        public  RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mName = (TextView) itemView.findViewById(R.id.name);
            this.mConnect = (TextView) itemView.findViewById(R.id.connect);
            this.mCode = (TextView) itemView.findViewById(R.id.code);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
            ;
        }
    }
}
