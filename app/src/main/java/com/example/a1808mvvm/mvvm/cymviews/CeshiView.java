package com.example.a1808mvvm.mvvm.cymviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CeshiView extends ViewGroup {
    public CeshiView(Context context) {
        super(context);
    }

    public CeshiView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CeshiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CeshiView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new MarginLayoutParams(getContext(),attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heighSize = MeasureSpec.getSize(heightMeasureSpec);
        //warp_content
        int width = 0;
        int height = 0;

        //记录每一行的宽度，width不断取最大宽度
        int lineWidth = 0;
        //每一行的高度，累加至height
        int lineHeight = 0;

        int count = getChildCount();

        for (int i = 0; i < count; i++) {
            View childView = getChildAt(i);
            measureChild(childView,widthMeasureSpec,heightMeasureSpec);
            MarginLayoutParams lp = (MarginLayoutParams) childView.getLayoutParams();
           int childWidth =  childView.getMeasuredWidth() + lp.leftMargin + lp.rightMargin;
           int childHeight =  childView.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            if (lineWidth + childWidth > widthSize){
                width = Math.max(lineWidth,widthSize);//取最大
                lineWidth = childWidth;//换行重新记录
                height += lineHeight; //叠加高度
                lineHeight = childHeight; //开启记录下一行的高度
            }else{
                lineWidth += childWidth;
                lineHeight = Math.max(lineHeight,childHeight);
            }

            if (i == count - 1){
                width = Math.max(width,lineWidth);
                height += lineHeight;
            }
        }
        int measurewidth = (widthMode == MeasureSpec.EXACTLY) ? width : widthSize;
        int measureheight = (heightMode == MeasureSpec.EXACTLY) ? height : heighSize;
        setMeasuredDimension(measurewidth,measureheight);
    }
    // 存储每一行所有的childView
    // 存储所有的View，按行记录
    private List<List<View>> mAllViews = new ArrayList<>();
    //记录每一行的最大高度
    private List<Integer> mLineHeight = new ArrayList<>();
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        mAllViews.clear();
        mLineHeight.clear();

        //父控件的大小
        int width = getMeasuredWidth();
        int lineWidth = 0;
        int lineHeight = 0;
        // 存储每一行所有的childView
        List<View> lineViews = new ArrayList<>();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View childAt = getChildAt(i);
            MarginLayoutParams lp = (MarginLayoutParams) childAt.getLayoutParams();
            int childWidth = childAt.getMeasuredWidth() + lp.leftMargin + lp.rightMargin;
            int childHeight = childAt.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            // 如果已经需要换行
            if (childWidth + lineWidth > width) {
                // 记录这一行所有的View以及最大高度
                mAllViews.add(lineViews);
                mLineHeight.add(lineHeight);
                // 重置下一行宽度
                lineWidth = 0;
                lineViews = new ArrayList<>();
            } else {
                //如果不需要换行，则累加
                lineWidth += childWidth;
                lineViews.add(childAt);
                lineHeight = Math.max(lineHeight, childHeight);
            }

            // 记录最后一行  最后一行肯定没有换行
            if (i == count - 1) {
                mLineHeight.add(lineHeight);
                mAllViews.add(lineViews);
            }
        }
        int left = 0;
        int top = 0;
// 得到子View总行数
        int lineNums = mAllViews.size();
        for (int i = 0; i < lineNums; i++) {

            //获取每一行的子View
            List<View> lineChildViews = mAllViews.get(i);
            // 当前行的最大高度
            int currentLineHeight = mLineHeight.get(i);

            //遍历每一行的子View 分别确定位置
            for (int j = 0; j < lineChildViews.size(); j++) {

                View child = lineChildViews.get(j);
                if (child.getVisibility() == View.GONE) {
                    continue;
                }

                int cWidth = child.getMeasuredWidth();
                int cHeight = child.getMeasuredHeight();
                MarginLayoutParams lp = (MarginLayoutParams) child.getLayoutParams();

                int cLeft = left + lp.leftMargin;
                int cTop = top + lp.topMargin;
                int cRight = cLeft + cWidth;
                int cBottom = cTop + cHeight;
                //后一个的子View的左边间距是前一个子View的宽度加左右间距
                left += cWidth + lp.leftMargin + lp.rightMargin;

                child.layout(cLeft, cTop, cRight, cBottom);
            }

            //换行左边间距重置  高度累加
            left = 0;
            top += currentLineHeight;
        }
    }
}
