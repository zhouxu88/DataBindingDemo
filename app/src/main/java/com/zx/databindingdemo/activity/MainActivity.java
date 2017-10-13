package com.zx.databindingdemo.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zx.databindingdemo.R;
import com.zx.databindingdemo.databinding.ActivityMainBinding;

/**
 * DataBinding
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setOnClickListener(this);
        mContext = this;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.basic_btn:
                startActivity(new Intent(mContext, BasicActivity.class));
                break;
            case R.id.double_bind_btn:
                startActivity(new Intent(mContext, DoubleBindActivity.class));
                break;
            case R.id.recycler_view_bind_btn:
                startActivity(new Intent(mContext, RecyclerViewActivity.class));
                break;
        }
    }
}
