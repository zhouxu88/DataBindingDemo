package com.zx.databindingdemo.handler;

import android.view.View;
import android.widget.Toast;

/**
 * 点击事件的处理
 * <p>
 * 作者： 周旭 on 2017年10月12日 0012.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class OnClickHandler {
    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "onClickFriend", Toast.LENGTH_SHORT).show();
    }
}
