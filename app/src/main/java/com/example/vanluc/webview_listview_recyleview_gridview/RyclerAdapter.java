package com.example.vanluc.webview_listview_recyleview_gridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RyclerAdapter extends RecyclerView.Adapter<RyclerAdapter.viewHolder>{
    ArrayList<RyclerView> arr;
    Context context;

    public RyclerAdapter(ArrayList<RyclerView> arr, Context context) {
        this.arr = arr;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.row_item,parent,false);
        return new viewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.tvTen.setText(arr.get(position).getTen());
        holder.ivAnh.setImageResource(arr.get(position).getAnh());
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public void RemoveItem(int position)
    {
        arr.remove(position);
        notifyItemRemoved(position);
    }
    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView tvTen;
        ImageView ivAnh;
        public viewHolder(final View itemView) {
            super(itemView);
            tvTen = itemView.findViewById(R.id.tvTen);
            ivAnh = itemView.findViewById(R.id.ivAnh);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RemoveItem(getAdapterPosition());
                    Toast.makeText(itemView.getContext(), "Xóa sản phẩm", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
