package com.example.user.testtimeline;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by User on 2016/7/7.
 */
public class MyAdapter extends MyBaseAdapter<String>{

    private RelativeLayout.LayoutParams params ;

    public MyAdapter(Context context) {
        super(context);

    }

    @Override
    public int getConvertViewId(int position) {
        return R.layout.item_lv;
    }

    @Override
    public MyViewHolder<String> getNewHolder(int position) {
        return new ViewHolder();
    }

    class ViewHolder extends MyViewHolder<String>{

        View v_line;
//        RecyclerView recyclerView;
//        private RecyclerAdapter mAdapter ;

        @Override
        public void initHolder(View view, int position) {
            v_line = view.findViewById(R.id.v_line);
//            recyclerView = (RecyclerView)view.findViewById(R.id.recyclerView);
//            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext() , 3));
            params = (RelativeLayout.LayoutParams) v_line.getLayoutParams();
            params.addRule(RelativeLayout.ALIGN_TOP , R.id.ll_top);
            params.addRule(RelativeLayout.ALIGN_BOTTOM , R.id.bottom);
            v_line.setLayoutParams(params);


        }

        @Override
        public void loadData(String data, int position) {
//            mAdapter = new RecyclerAdapter(null);
//            recyclerView.setAdapter(mAdapter);
        }
    }
}
