package com.example.kelvin.example;

import android.app.Application;
import android.util.DisplayMetrics;

import com.example.kelvin.example.utils.AppUtil;
import com.example.kelvin.example.utils.ResourceUtil;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;


/**
 * Application实现类
 *
 * @author huchiwei
 * @version 1.0.0
 */
public class LaunchApplication extends Application {
    private static LaunchApplication mApplication;

    // 当前屏幕的高宽
    public static int screenW = 0;
    public static int screenH = 0;

    public static LaunchApplication getInstance(){
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;

        // 得到屏幕的宽度和高度
        DisplayMetrics dm = getResources().getDisplayMetrics();
        //屏幕宽度
        screenW = dm.widthPixels;
        //屏幕高度
        screenH = dm.heightPixels;

        // 配置Logger
        Logger.init(ResourceUtil.getString(R.string.app_name))     //tag
                .methodCount(2)
                .hideThreadInfo()
                .logLevel(AppUtil.isDev() ? LogLevel.FULL : LogLevel.NONE)
                .methodOffset(2);
    }


}
