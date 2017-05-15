package com.example.kelvin.example.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.kelvin.example.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kelvin on 2017/5/12.
 */

public class LoginActivity extends AppCompatActivity implements ILoginView{

    @BindView(R.id.user_name)
    EditText userName;
    @BindView(R.id.psw)
    EditText psw;
    @BindView(R.id.login)
    Button login;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private ILoginPresenter iLoginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        //获取Presenter的对象
        iLoginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.login)
    public void onViewClicked() {

        //通过presenter调用modle层的网络请求
        iLoginPresenter.loginToServer("","");
    }

    /**
     * 改变View的视图的状态
     * @param enable
     */
    @Override
    public void showProgress(boolean enable) {
        if (enable){
            progressBar.setVisibility(View.VISIBLE);
            Toast.makeText(LoginActivity.this,"登录中。。。",Toast.LENGTH_SHORT).show();
        }else {
            progressBar.setVisibility(View.GONE);
            Toast.makeText(LoginActivity.this,"以登录。。。",Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 显示最终的结果
     */
    @Override
    public void showLoginView() {
        Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
        finish();
    }
}
