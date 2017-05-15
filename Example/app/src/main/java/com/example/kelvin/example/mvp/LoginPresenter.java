package com.example.kelvin.example.mvp;

/**
 * Created by kelvin on 2017/5/12.
 */

public class LoginPresenter implements ILoginPresenter {

    private ILoginModle iLoginModle;
    private ILoginView iLoginView;

    /**
     * 绑定modle层和view层
     */
    public LoginPresenter(ILoginView loginView) {
        this.iLoginView = loginView;
        this.iLoginModle = new LoginModle(this);
    }

    @Override
    public void loginToServer(String userName, String password) {
        //通知view层改变状态
        iLoginView.showProgress(true);
        //通知modle层进行操作
        iLoginModle.login(userName,password);
    }

    @Override
    public void loginSucceed() {
        //modle层操作完成之后，回调的方法，presenter收到回调通知view层进行改变
        iLoginView.showProgress(false);
        iLoginView.showLoginView();
    }
}
