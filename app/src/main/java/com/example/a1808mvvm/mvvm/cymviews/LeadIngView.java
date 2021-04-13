package com.example.a1808mvvm.mvvm.cymviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.a1808mvvm.R;


public class LeadIngView extends View {

    private int selectColor = Color.BLACK;
    private int unSelectColo = Color.GRAY;
    private String mText = "默认";
    private int mTextSize = 20;
    private int mTextColor = Color.RED;


    private Paint selectPaint;
    private Paint unSelectPaint;
    private Paint textPaint;
    private int basePadding = 20;

    private Rect textBond;



    public LeadIngView(Context context) {
        this(context,null);
    }

    public LeadIngView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LeadIngView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.LeadIngView);

        selectColor = typedArray.getColor(R.styleable.LeadIngView_LeadIng_SelectColor, selectColor);
        unSelectColo = typedArray.getColor(R.styleable.LeadIngView_LeadIng_UnSelectColor, unSelectColo);
        mTextColor = typedArray.getColor(R.styleable.LeadIngView_LeadIng_TextColor, mTextColor);
        mText = typedArray.getString(R.styleable.LeadIngView_LeadIng_Text);
        mTextSize = typedArray.getDimensionPixelSize(R.styleable.LeadIngView_LeadIng_TextSize, mTextSize);
        if(TextUtils.isEmpty(mText.trim())){
            mText = "默认";
        }

        typedArray.recycle();//释放资源

        selectPaint = new Paint();
        unSelectPaint = new Paint();

        selectPaint.setAntiAlias(true);
        selectPaint.setColor(selectColor);

        unSelectPaint.setColor(unSelectColo);
        unSelectPaint.setAntiAlias(true);

        textPaint = new Paint();
        textPaint.setColor(mTextColor);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(mTextSize);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //测量

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
        int wMode = MeasureSpec.getMode(widthMeasureSpec);
        int hMode = MeasureSpec.getMode(heightMeasureSpec);
        if( wMode == MeasureSpec.AT_MOST ){
            //如果是warpContent
            width = (int) textPaint.measureText(mText)+getPaddingLeft()+getPaddingRight()+basePadding*2;
        }

        if( hMode ==  MeasureSpec.AT_MOST ){
            //如果是warpContent
            height = (int)100+getPaddingTop()+getPaddingBottom()+basePadding;
        }
        setMeasuredDimension(width,height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if( flag ){
            canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/2,unSelectPaint);//画圆
        }else{
            canvas.drawCircle(getWidth()/2,getHeight()/2,getWidth()/2,selectPaint);//画圆

        }
//        canvas.drawArc(0,0,getWidth(),getHeight(),0,360,true,unSelectPaint);
        textBond = new Rect();
        textPaint.getTextBounds(mText,0,mText.length(),textBond);
        int dx = (int) ((getWidth()-textPaint.measureText(mText))/2);
        int dy = (textBond.bottom-textBond.top)/2-textBond.bottom;
        int baseLine = getHeight()/2+dy;
        canvas.drawText(mText,dx,baseLine,textPaint);//画文字
    }
    private boolean flag = true;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                flag = !flag;
                invalidate();
                break;
        }

        return true;
    }
}
