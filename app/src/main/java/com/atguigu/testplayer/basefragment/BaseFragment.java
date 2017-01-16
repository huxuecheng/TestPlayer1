package com.atguigu.testplayer.basefragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 呼学成 on 16/01/2017.
 */

public abstract class BaseFragment extends Fragment{
    public Context mContext;//上下文
    //当系统创建当前BaseFragment类的时候到调用
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }
    //抽象方法让孩子实现
    public abstract View initView();
    //当Activity创建成功的时候回调该方法
// 初始化数据
    //联网请求数据
    //绑定数据
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }
    //当子类需要联网请求网络的时候重写该方法
    //绑定数据
    public void initData(){

    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(!hidden){
            onRefrshData();
        }
    }
    //当子类刷新数据的时候重写该方法
    private void onRefrshData() {
    }
}
