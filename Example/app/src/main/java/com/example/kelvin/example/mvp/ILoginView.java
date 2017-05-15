package com.example.kelvin.example.mvp;

/**
 * Created by kelvin on 2017/5/12.
 * view层，根据presenter的返回结果改变view层的显示样式
 */

public interface ILoginView {

    void showProgress(boolean enable);

    void showLoginView();
}
