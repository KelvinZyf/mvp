package com.example.kelvin.example.mvp;

import android.os.Handler;
import android.util.Log;

/**
 * Created by kelvin on 2017/5/12.
 */

public class LoginModle implements ILoginModle {
    private ILoginPresenter iLoginPresenter;
    private Handler handler;

    /*设置Presenter*/
    public LoginModle(ILoginPresenter iLoginPresenter){
        handler = new Handler();
        this.iLoginPresenter = iLoginPresenter;
    }

    @Override
    public void login(final String userName, final String psw) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("LoginModel", "run: ");
                iLoginPresenter.loginSucceed();
            }
        },2000);
    }
}
