package com.zx.databindingdemo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.zx.databindingdemo.BR;
import com.zx.databindingdemo.R;

/**
 * 作者： 周旭 on 2017年10月11日 0011.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class TextItem extends BaseObservable implements IBaseBindingAdapterItem {
    
    private String text;

    public TextItem(String text) {
        this.text = text;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    @Override
    public int getItemViewType() {
        return R.layout.item_text;
    }
}
