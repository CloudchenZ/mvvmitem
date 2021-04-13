package com.example.a1808mvvm.mvvm.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.model.service.entity.HardEntity;
import com.example.net.entity.BaseEntity;

import java.util.List;

public class TouAdapter extends BaseQuickAdapter<HardEntity,BaseViewHolder> {

    public TouAdapter(int layoutResId, @Nullable List<HardEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HardEntity item) {
        helper.setText(R.id.actiontime,item.getCtime());
        helper.setText(R.id.tvtitle,item.getContent());
        Glide.with(mContext).load(item.getImgs()).transform(new CenterCrop()).into((ImageView) helper.getView(R.id.ivtou));
    }
}
