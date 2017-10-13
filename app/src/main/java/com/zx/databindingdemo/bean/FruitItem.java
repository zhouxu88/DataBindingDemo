package com.zx.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.zx.databindingdemo.BR;
import com.zx.databindingdemo.R;

/**
 * 双向绑定
 * <p>
 * 作者： 周旭 on 2017年10月11日 0011.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class FruitItem extends BaseObservable implements IBaseBindingAdapterItem {
    private int picId; //图片的ID
    private String describe; //描述

    public FruitItem(int picId, String describe) {
        this.picId = picId;
        this.describe = describe;
    }

    @Bindable
    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
        notifyPropertyChanged(BR.picId);
    }

    @Bindable
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
        notifyPropertyChanged(BR.describe);
    }

    @Override
    public int getItemViewType() {
        return R.layout.item_fruit;
    }
}
