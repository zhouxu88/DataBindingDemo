package com.zx.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.zx.databindingdemo.R;
import com.zx.databindingdemo.bean.UserBean;
import com.zx.databindingdemo.databinding.ActivityBasicBinding;
import com.zx.databindingdemo.handler.OnClickHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasicActivity extends AppCompatActivity  implements View.OnClickListener{

    //用户头像
//    private static final String URL_USER_PIC = "http://avatar.csdn.net/D/8/9/3_zhouxu88.jpg";
    private static final String URL_USER_PIC = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4138850978,2612460506&fm=200&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_basic);


        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        binding.setList(list);

        HashMap<String, Object> map = new HashMap<>();
        map.put("key0", "map_value0");
        map.put("key1", "map_value1");
        binding.setMap(map);

        String[] arrays = {"字符串1", "字符串2"};
        binding.setArray(arrays);

        binding.titleTv.setText("我是标题");

        UserBean userBean = new UserBean(URL_USER_PIC, "张三", 24);
        binding.setUser(userBean);

        com.zx.databindingdemo.bean.user.UserBean userBean2 = new com.zx.databindingdemo.bean.user.UserBean("我是user2");
        binding.setUser2(userBean2);

        binding.setOnClickListener(this);
        binding.setHandler(new OnClickHandler());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.click_btn) {
            Toast.makeText(this, "点击了1", Toast.LENGTH_SHORT).show();
        }
// else if (v.getId() == R.id.click2_btn) {
//            Toast.makeText(this, "点击了2", Toast.LENGTH_SHORT).show();
//        }
    }
}
