package com.example.a1808mvvm.mvvm.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.a1808mvvm.R;
import com.example.a1808mvvm.mvvm.adapter.MoreAdapter;
import com.example.a1808mvvm.mvvm.model.service.api.LoginApi;
import com.example.a1808mvvm.mvvm.model.service.entity.NewsEntity;
import com.example.a1808mvvm.mvvm.view.MoreActivity;
import com.example.a1808mvvm.mvvm.viewmodel.NewsViewModel;
import com.example.net.BaseRespEntify;
import com.example.net.NetTools;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {


    private RecyclerView rv;
    private  List<NewsEntity> list = new ArrayList<>(

    );
    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_news, container, false);
        rv = inflate.findViewById(R.id.rv);
        NewsViewModel newsViewModel = new NewsViewModel(this);
        newsViewModel.getNewsData().observe(this, new Observer<BaseRespEntify<List<NewsEntity>>>() {
           @Override
           public void onChanged(BaseRespEntify<List<NewsEntity>> listBaseRespEntify) {
               final List<NewsEntity> data = listBaseRespEntify.getData(NewsEntity.class);
               Log.e("aaa", "onChanged: "+data );
               MoreAdapter moreAdapter = new MoreAdapter(data);
               rv.setAdapter(moreAdapter);
               rv.setLayoutManager(new LinearLayoutManager(getContext()));
               moreAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                   @Override
                   public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                       Intent intent = new Intent(getActivity(), MoreActivity.class);
                       intent.putExtra("title",data.get(position).getTitle());
                       intent.putExtra("uid",data.get(position).getNewscode());
                       startActivity(intent);
                   }
               });
           }
       });

        return inflate;
    }

}
