package com.zx.databindingdemo.bean;

/**
 * RecyclerView使用databinding时，如果多布局的情况下，需要设置item的type
 * <p>
 * 作者： 周旭 on 2017年10月11日 0011.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public interface IBaseBindingAdapterItem {
    //获取Item的类型
    int getItemViewType();
}
