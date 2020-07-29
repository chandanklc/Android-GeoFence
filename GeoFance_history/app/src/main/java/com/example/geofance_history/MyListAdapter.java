package com.example.geofance_history;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>
{
    private MyListData[] listData;

    public  MyListAdapter(MyListData[] listData){
        this.listData= listData;
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
        final MyListData myListData = listData[position];
        holder.mBreach.setText(listData[position].getBreach());
        holder.mDate_Time.setText(listData[position].getDate_time());
        holder.mNext.setImageResource(listData[position].getNext());
        holder.mStatus.setText(listData[position].getStatus());

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mBreach,mDate_Time, mStatus;
        public ImageButton mNext;
        public RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mBreach =(TextView) itemView.findViewById(R.id.breach);
            this.mDate_Time=(TextView) itemView.findViewById(R.id.date_time);
            this.mNext= (ImageButton) itemView.findViewById(R.id.next);
            this.mStatus= (TextView) itemView.findViewById(R.id.status);
            relativeLayout =(RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }
    }
}
