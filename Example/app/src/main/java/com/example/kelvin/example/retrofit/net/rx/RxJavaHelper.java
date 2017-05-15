package com.example.kelvin.example.retrofit.net.rx;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * RxJava封装辅助类
 *
 * @author huchiwei
 * @version 1.0.0
 */
public class RxJavaHelper {

    /**
     * 切换线程操作
     * @return Observable转换器
     */
    public static <T> Observable.Transformer<T, T> observeOnMainThread() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> tObservable) {
                return tObservable
                        .subscribeOn(Schedulers.io())                       // 在io线程中请求
                        .observeOn(AndroidSchedulers.mainThread());         // 请求完成后返回主线程处理
            }
        };
    }

    /**这个是计算工作默认的调度器，它与I/O操作无关。它也是许多RxJava方法的默认调度**/
    private static final Observable.Transformer computationTransformer =
            new Observable.Transformer() {
                @Override
                public Object call(Object observable) {
                    return ((Observable) observable).subscribeOn(Schedulers.computation())
                            .observeOn(AndroidSchedulers.mainThread());
                }
            };

    /**IO调度器，子线程在IO线程操作，完成之后切换到主线程**/
    private static final Observable.Transformer ioTransformer = new Observable.Transformer() {
        @Override
        public Object call(Object observable) {
            return ((Observable) observable).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());
        }
    };

    /**给指定的任务开启一个新的线程，完成之后切换到主线程**/
    private static final Observable.Transformer newTransformer = new Observable.Transformer() {
        @Override
        public Object call(Object observable) {
            return ((Observable) observable).subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread());
        }
    };

    /**当我们想在当前线程执行一个任务时，并不是立即，我们可以用.trampoline()将它入队。
     * 这个调度器将会处理它的队列并且按序运行队列中每一个任务。它是repeat()和retry()方法默认的调度器。**/
    private static final Observable.Transformer trampolineTransformer = new Observable.Transformer() {
        @Override
        public Object call(Object observable) {
            return ((Observable) observable).subscribeOn(Schedulers.trampoline())
                    .observeOn(AndroidSchedulers.mainThread());
        }
    };

    /**自定义调度线程**/
    private static final Observable.Transformer executorTransformer = new Observable.Transformer() {
        @Override
        public Object call(Object observable) {
            return ((Observable) observable).subscribeOn(Schedulers.from(ExecutorManager.eventExecutor))
                    .observeOn(AndroidSchedulers.mainThread());
        }
    };

    /**
     * Don't break the chain: use RxJava's compose() operator
     * 不要打断链式结构，使用RXJava的compose（）添加
     */

    //默认调度
    public static <T> Observable.Transformer<T, T> applyComputationSchedulers() {
        return (Observable.Transformer<T, T>) computationTransformer;
    }

    //IO调度
    public static <T> Observable.Transformer<T, T> applyIoSchedulers() {
        return (Observable.Transformer<T, T>) ioTransformer;
    }

    //开启新线程
    public static <T> Observable.Transformer<T, T> applyNewSchedulers() {
        return (Observable.Transformer<T, T>) newTransformer;
    }

    //队列执行
    public static <T> Observable.Transformer<T, T> applyTrampolineSchedulers() {
        return (Observable.Transformer<T, T>) trampolineTransformer;
    }

    //自定义调度
    public static <T> Observable.Transformer<T, T> applyExecutorSchedulers() {
        return (Observable.Transformer<T, T>) executorTransformer;
    }
}
