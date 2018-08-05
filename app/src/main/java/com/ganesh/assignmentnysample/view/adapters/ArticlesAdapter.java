package com.ganesh.assignmentnysample.view.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ganesh.assignmentnysample.R;
import com.ganesh.assignmentnysample.model.Result;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {
    private List<Result> itemList;
    private Context context;
    private ItemClickListener clickListener;
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv1,tv2;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.list_title);
            tv2 = (TextView) itemView.findViewById(R.id.list_desc);
            imageView = (ImageView)itemView.findViewById(R.id.list_avatar);
        }
    }

    public ArticlesAdapter(Context context, List<Result> itemList) {

        this.itemList = itemList;
        this.context = context;
    }
    @Override
    public ArticlesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ArticlesAdapter.ViewHolder holder, final int position){
//        holder.tv1.setText(itemList.get(position).getName());
//        holder.tv2.setText(itemList.get(position).getDesc());
//        holder.imageView.setImageResource(itemList.get(position).getPhoto());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null) clickListener.itemClick(v, position);
            }
        });
        holder.imageView.setTag(holder);
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }
    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
    public interface ItemClickListener {
        public void itemClick(View view, int position);
    }
}