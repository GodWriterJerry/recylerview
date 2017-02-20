package com.example.yls.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<Kobe> kobeList;

    public MyAdapter(List<Kobe> kobeList) {
        this.kobeList=kobeList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Kobe kobe=kobeList.get(position);
        holder.kbImg.setImageResource(kobe.ImgId);
        holder.kbName.setText(kobe.name);
    }

    @Override
    public int getItemCount() {
        return kobeList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView kbImg;
        TextView kbName;

        public ViewHolder(View itemView) {
            super(itemView);
            kbImg= (ImageView) itemView.findViewById(R.id.kbImg);
            kbName=(TextView)itemView.findViewById(R.id.kbName);

        }
    }
}
