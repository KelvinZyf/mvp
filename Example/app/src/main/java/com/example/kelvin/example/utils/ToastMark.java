package com.example.kelvin.example.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kelvin.example.LaunchApplication;
import com.example.kelvin.example.R;

/**
 * Created by kelvin on 2017/5/15.
 */

public class ToastMark {

    private static Toast sToast;
    private static TextView sContentTv;

    public static void showShortToast(String msg) {
        showCustomToast(LaunchApplication.getInstance(), msg, Toast.LENGTH_SHORT);
    }

    public static void showShortToast(int msgId) {
        showCustomToast(LaunchApplication.getInstance(), msgId, Toast.LENGTH_SHORT);
    }

    public static void showLongToast(String msg) {
        showCustomToast(LaunchApplication.getInstance(), msg, Toast.LENGTH_LONG);
    }

    public static void showLongToast(int msgId) {
        showCustomToast(LaunchApplication.getInstance(), msgId, Toast.LENGTH_LONG);
    }

    /**
     * 创建运行在UI线程中的Toast
     *
     * @param activity
     * @param msg
     */
    public static void showToastInUiThread(final Activity activity, final String msg) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    showCustomToast(activity, msg);
                }
            });
        }
    }

    public static void showToastInUiThread(final Activity activity, final int stringId) {
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    showCustomToast(activity, stringId);
                }
            });
        }
    }

    private static void showCustomToast(Context context, int msgId) {
        final String msg = context.getResources().getString(msgId);
        showCustomToast(context, msg);
    }

    private static void showCustomToast(Context context, String msg) {
        showCustomToast(context, msg, Toast.LENGTH_SHORT);
    }

    private static void showCustomToast(Context context, int msgId, int duration) {
        final String msg = context.getResources().getString(msgId);
        showCustomToast(context, msg, duration);
    }

    private static void showCustomToast(final Context context, final String msg, final int duration) {
        if (context == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            showToast(context, msg, duration);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                @Override
                public void run() {
                    showToast(context, msg, duration);
                }
            });
        }
    }

    private static void showToast(Context context, String msg, int duration) {
        if (null != context) {
            if (sToast == null) {
                sToast = new Toast(context);
                LayoutInflater inflater = LayoutInflater.from(context);
                View layout = inflater.inflate(R.layout.toast, null);
                sContentTv = (TextView) layout.findViewById(R.id.tv_toast_content);
                sContentTv.setText(msg);
                sToast.setGravity(Gravity.CENTER, 0, LaunchApplication.screenH / 4);
                sToast.setDuration(duration);
                sToast.setView(layout);
            }else {
                sContentTv.setText(msg);
            }
            sToast.show();
        }
    }
}
