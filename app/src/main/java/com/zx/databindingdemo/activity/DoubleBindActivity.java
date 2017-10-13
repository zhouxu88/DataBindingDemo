package com.zx.databindingdemo.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zx.databindingdemo.R;
import com.zx.databindingdemo.bean.DoubleBindBean;
import com.zx.databindingdemo.bean.DoubleBindBean2;
import com.zx.databindingdemo.databinding.ActivityDoubleBindBinding;

/**
 * 双向绑定
 */
public class DoubleBindActivity extends AppCompatActivity implements View.OnClickListener {

    private DoubleBindBean doubleBindBean;
    private DoubleBindBean2 doubleBindBean2;
    private boolean flag;
    private boolean flag2;
    
    private ObservableArrayList<String> list=new ObservableArrayList<>();
    private ObservableArrayMap<String,Object> map = new ObservableArrayMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDoubleBindBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_double_bind);

        doubleBindBean = new DoubleBindBean("我是原始内容");
        binding.setDoubleBindBean(doubleBindBean);

        doubleBindBean2 = new DoubleBindBean2("我是原始内容2");
        binding.setDoubleBindBean2(doubleBindBean2);

        list.add("list1");
        list.add("list2");
        binding.setList(list);
        
        map.put("key0","key0_value0");
        map.put("key1","key1_value1");
        binding.setMap(map);

        binding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change_content_btn:
                //BaseObservable 
                flag = !flag;
                if (flag) {
                    doubleBindBean.setContent("我是更新后的内容");
                } else {
                    doubleBindBean.setContent("我是原始内容");
                }
                break;
            case R.id.change_content_btn2:
                //ObservableFields
                flag2 = !flag2;
                if (flag2) {
                    doubleBindBean2.setUsername("我是更新后的内容2");
                } else {
                    doubleBindBean2.setUsername("我是原始内容2");
                }
                break;
            case R.id.change_content_btn3:
                list.set(0,"after change list");
                break;
            case R.id.change_content_btn4:
                map.put("key0","after change key0_value0");
                break;
        }
    }
}
