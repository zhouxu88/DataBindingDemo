package com.zx.databindingdemo.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

import com.zx.databindingdemo.BR;
import com.zx.databindingdemo.bean.IBaseBindingAdapterItem;

/**
 * 使用DataBinding下的RecyclerView的ViewHolder
 * <p>
 * 作者： 周旭 on 2017年10月11日 0011.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class BaseBindingViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;
    
    public ViewDataBinding getBinding(){
        return binding;
    }

    /**
     * @param binding 可以看作是这个holder代表的布局的马甲，getRoot()方法会返回整个holder的最顶层的view
     */
    public BaseBindingViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    /**
     * 绑定数据
     *
     * @param item
     */
    public void bindData(IBaseBindingAdapterItem item) {
        binding.setVariable(BR.item, item);
    }
}
