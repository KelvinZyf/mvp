package com.example.kelvin.example.retrofit.net.rx;

import android.content.Context;
import android.os.Message;

/**
 * Created on 2017/2/28.
 * Desc：封装进度条的订阅者
 * Author：Eric.w
 */
public abstract class ProgressSubscriber<T> extends ErrorHandleSubscriber<T> implements ProgressCancelListener {

    private ProgressDialogHandler mProgressDialogHandler;
    private String message;

    /**
     * @param context 上下文对象
     * @param message 加载过程中显示的文字
     */
    public ProgressSubscriber(Context context, String message) {
        super(context);
        this.message = message;
        mProgressDialogHandler = new ProgressDialogHandler(mContext.get(), this, true);
    }

    /**
     * 显示进度对话框
     */
    private void showProgressDialog() {
        if (mProgressDialogHandler != null) {
            Message msg = mProgressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG);
            msg.obj = message;
            msg.sendToTarget();
        }
    }

    /**
     * 取消进度对话框
     */
    private void dismissProgressDialog() {
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
            mProgressDialogHandler = null;
        }
    }

    /**
     * 请求开始的时候显示对话框
     */
    @Override
    public void onStart() {
        showProgressDialog();
    }

    /**
     * 任务添加完成，取消进度对话框
     */
    @Override
    public void onCompleted() {
        dismissProgressDialog();
    }

    /**
     * 出错时，取消进度对话框
     */
    @Override
    public void onError(Throwable e) {
        super.onError(e);
        dismissProgressDialog();
    }


    @Override
    public void onCancelProgress() {
        if (!this.isUnsubscribed()) {
            this.unsubscribe();
        }
    }


}
