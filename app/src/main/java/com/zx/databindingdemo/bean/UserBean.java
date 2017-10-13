package com.zx.databindingdemo.bean;

/**
 * 作者： 周旭 on 2017年9月28日 0028.
 * 邮箱：374952705@qq.com
 * 博客：http://www.jianshu.com/u/56db5d78044d
 */

public class UserBean {
    private String picUrl; //用户头像的URL
    private String name; //姓名
    private int age; //年龄

    public UserBean(String picUrl,String name, int age) {
        this.picUrl = picUrl;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
