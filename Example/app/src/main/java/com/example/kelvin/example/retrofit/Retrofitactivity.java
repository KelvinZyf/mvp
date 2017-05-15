package com.example.kelvin.example.retrofit;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kelvin.example.R;
import com.example.kelvin.example.glide.ImagesUtil;
import com.example.kelvin.example.retrofit.httpservice.HttpService;
import com.example.kelvin.example.retrofit.net.RetrofitHelper;
import com.example.kelvin.example.retrofit.net.rx.NoProgressSubscriber;
import com.example.kelvin.example.retrofit.net.rx.ProgressSubscriber;
import com.example.kelvin.example.retrofit.net.rx.RxJavaHelper;
import com.example.kelvin.example.utils.LogUtil;
import com.example.kelvin.example.utils.ToastMark;
import com.example.kelvin.example.retrofit.news.NewsEntitiy;
import com.example.kelvin.example.retrofit.weather.ResultBean;
import com.example.kelvin.example.retrofit.weather.WeatherEntuty;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by kelvin on 2017/5/8.
 */

public class Retrofitactivity extends AppCompatActivity {

    @BindView(R.id.requesr)
    Button requesr;
    @BindView(R.id.tv_msg)
    TextView tvMsg;
    @BindView(R.id.image)
    ImageView image;

    //加载框
    private ProgressDialog pd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);

        pd = new ProgressDialog(this);

        ImagesUtil.displayImage(this,image,"http://img03.tooopen.com/images/20131111/sy_46708898917.jpg");
//        ImagesUtil.displayCircleImage(this,image,"http://img03.tooopen.com/images/20131111/sy_46708898917.jpg");
    }

    @OnClick(R.id.requesr)
    public void onViewClicked(View v) {
        switch (v.getId()) {
            case R.id.requesr:
                //Toast.makeText(Retrofitactivity.this,"dianji",Toast.LENGTH_SHORT).show();
//                pd.show();
//                rxNewRequest();
//                weatherRequest();
                getRequest();
                break;
        }
    }

    private void getRequest(){
        RetrofitHelper.createApi(HttpService.class)
                .getNewStringString("top","f18009497ce54c381fe9253480dcb066")
                .compose(RxJavaHelper.<String>applyNewSchedulers())
                .subscribe(new ProgressSubscriber<String>(Retrofitactivity.this,"加载中") {

                    @Override
                    public void onNext(String newsEntitiy) {
//                        LogUtil.debug(newsEntitiy.getReason());
//                        List<NewsEntitiy.ResultBean.DataBean> list = newsEntitiy.getResult().getData();
//                        NewsEntitiy.ResultBean.DataBean dataBean = list.get(2);
//                        String s = dataBean.getThumbnail_pic_s();
//                        LogUtil.debug(s);
//                        ImagesUtil.displayImage(Retrofitactivity.this,image,s);

                        LogUtil.debug(newsEntitiy);

                        ToastMark.showLongToast(newsEntitiy);

                        tvMsg.setText(newsEntitiy);

                    }
                });
    }

    private void newsRequest(){
        RetrofitHelper.createApi(HttpService.class)
                .getNew("top","f18009497ce54c381fe9253480dcb066")
                .compose(RxJavaHelper.<NewsEntitiy>observeOnMainThread())
                .subscribe(new NoProgressSubscriber<NewsEntitiy>() {
                    @Override
                    public void onSuccess(NewsEntitiy newsEntitiy) {
                        if (pd != null && pd.isShowing()) {
                            pd.dismiss();
                        }
                        LogUtil.debug(newsEntitiy.getReason());
                        List<NewsEntitiy.ResultBean.DataBean> list = newsEntitiy.getResult().getData();
                        NewsEntitiy.ResultBean.DataBean dataBean = list.get(2);
                        String s = dataBean.getThumbnail_pic_s();
                        LogUtil.debug(s);
                        ImagesUtil.displayImage(Retrofitactivity.this,image,s);
                    }
                });
    }

    private void weatherRequest(){
        RetrofitHelper.createApi(HttpService.class)
                .getWeather("北京","json","691cb85d5b32a5174678525106f58b36",2)
                .compose(RxJavaHelper.<WeatherEntuty>observeOnMainThread())
                .subscribe(new NoProgressSubscriber<WeatherEntuty>() {
                    @Override
                    public void onSuccess(WeatherEntuty weatherEntuty) {
                        if (pd != null && pd.isShowing()) {
                            pd.dismiss();
                        }
                        LogUtil.debug(weatherEntuty);

                        ResultBean resultBean = weatherEntuty.getResult();
                        String s = resultBean.getToday().getDressing_advice();
                        tvMsg.setText(s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        if (pd != null && pd.isShowing()) {
                            pd.dismiss();
                        }
                    }
                });
    }

//    private void rxNewRequest() {
//
//        RetrofitHelper.createApi(HttpService.class)
//                .getAllVedioBy(true)
//                .compose(RxJavaHelper.<RetrofitEntity>observeOnMainThread())
//                .subscribe(new NoProgressSubscriber<RetrofitEntity>() {
//                    @Override
//                    public void onSuccess(RetrofitEntity retrofitEntity) {
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                        LogUtil.debug(retrofitEntity);
//                        tvMsg.setText("无封装：\n" + retrofitEntity.getData().toString());
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        super.onError(e);
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                    }
//
//                });
//
//    }

//    private void newRequest() {
//        //加载框
//        final ProgressDialog pd = new ProgressDialog(this);
//        Observable<RetrofitEntity> observable = RetrofitHelper.createApi(HttpService.class)
//                .getAllVedioBy(true);
//        observable.subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<RetrofitEntity>() {
//
//                    @Override
//                    public void onStart() {
//                        super.onStart();
//                        pd.show();
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                    }
//
//                    @Override
//                    public void onNext(RetrofitEntity retrofitEntity) {
//                        tvMsg.setText("无封装：\n" + retrofitEntity.getData().toString());
//                    }
//                });
//    }

    /**
     * 网络请求
     */
//    private void request() {
//        //手动创建一个OkHttpClient并设置超时时间
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.connectTimeout(5, TimeUnit.SECONDS);
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .client(builder.build())
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()) //添加RxJava支持
//                .baseUrl("http://www.izaodao.com/Api/")
//                .build();
//
//        //加载框
//        final ProgressDialog pd = new ProgressDialog(this);
//
//        HttpService httpService = retrofit.create(HttpService.class);
//        Observable<RetrofitEntity> observable = httpService.getAllVedioBy(true);
//        observable.subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<RetrofitEntity>() {
//
//                    @Override
//                    public void onStart() {
//                        super.onStart();
//                        pd.show();
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        if (pd != null && pd.isShowing()) {
//                            pd.dismiss();
//                        }
//                    }
//
//                    @Override
//                    public void onNext(RetrofitEntity retrofitEntity) {
//                        tvMsg.setText("无封装：\n" + retrofitEntity.getData().toString());
//                    }
//                });
//    }


}
