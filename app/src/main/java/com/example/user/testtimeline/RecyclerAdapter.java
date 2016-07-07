package com.example.user.testtimeline;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2016/7/7.
 */
public class RecyclerAdapter extends RecyclerView.Adapter {

    private List<Integer> mData ;

    public RecyclerAdapter(List<String> data){
        mData = new ArrayList<>();
        mData.add(R.drawable.i33333333333);
        mData.add(R.drawable.i33333333333);
        mData.add(R.drawable.i33333333333);
}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imagrview, null);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
              PersonViewHolder holder = (PersonViewHolder) viewHolder;
                 Integer str = mData.get(i);
        holder.imageview.setImageResource(str);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        public ImageView imageview;

        public PersonViewHolder(View itemView) {
            super(itemView);
            imageview = (ImageView)itemView.findViewById(R.id.imageview);
        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }

//        @Override
//        public void onClick(View v) {
//            if (null != onRecyclerViewListener) {
//                onRecyclerViewListener.onItemClick(position);
//            }
//        }
//
//        @Override
//        public boolean onLongClick(View v) {
//            if (null != onRecyclerViewListener) {
//                return onRecyclerViewListener.onItemLongClick(position);
//            }
//            return false;
//        }
    }
}
