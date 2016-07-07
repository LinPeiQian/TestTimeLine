package com.example.user.testtimeline;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListView;

public class ListViewForScrollView extends ListView {

	public ListViewForScrollView(Context context) {
		super(context);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}


	/**
	 * 重写该方法，达到使ListView适应ScrollView的效果
	 */
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		Log.d("DEBUG" , "listview height = "+ expandSpec);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
