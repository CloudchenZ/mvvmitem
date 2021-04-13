package com.example.a1808mvvm.mvvm.adapter;

import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;

import java.util.List;

public class MoreAdapter extends BaseMultiItemQuickAdapter<NewsEntity, BaseViewHolder> {



    public MoreAdapter(List<NewsEntity> data) {
        super(data);
        addItemType(0, R.layout.list1);
        addItemType(1, R.layout.list2);
    }



    @Override
    protected void convert(BaseViewHolder helper, NewsEntity item) {
        switch (helper.getItemViewType()){
            case 0:
                helper.setText(R.id.tvlist1,item.getTitle());
                Glide.with(mContext).load(item.getMainimgurl()).transform(new CenterCrop()).into((ImageView) helper.getView(R.id.ivlist1));
                break;
            case 1:
                helper.setText(R.id.tvlist2,item.getTitle());
                Glide.with(mContext).load(item.getMainimgurl()).transform(new CenterCrop()).into((ImageView) helper.getView(R.id.ivlist2));
                break;
        }
    }
}
