package com.example.kelvin.example.mvp;

/**
 * Created by kelvin on 2017/5/12.
 * Presenter层，主要是进行控制，通知modle层像服务器进行登录请求
 * 返回登录请求结果
 */

public interface ILoginPresenter {

    //通知modle层执行任务
    void loginToServer(String userName,String password);

    //结果
    void loginSucceed();
}
