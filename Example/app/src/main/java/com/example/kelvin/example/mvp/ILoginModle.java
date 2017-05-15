package com.example.kelvin.example.mvp;

/**
 * Created by kelvin on 2017/5/12.
 * modle层，登陆方法，通过该方法向服务器发送登陆请求。
 */

public interface ILoginModle {
    void login(String userName,String psw);
}
