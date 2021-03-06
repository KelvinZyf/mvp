package com.example.kelvin.example.retrofit.net.cache;

import com.example.kelvin.example.utils.AppUtil;
import com.google.gson.Gson;

import org.json.JSONObject;

/**
 * 缓存辅助类
 *
 * @author huchiwei
 * @version 1.0.0
 */
public class CacheUtil {

    // 声明为volatile,保证访问顺序
    private volatile static ACache mACache = null;

    /**
     * 获取ACache实例
     * @return ImageLoader实例
     */
    private static ACache getInstance(){
        if(null == mACache){
            synchronized (CacheUtil.class){
                if(null == mACache){ // 双重检验锁,仅第一次调用时实例化
                    mACache = ACache.get(AppUtil.getContext());
                }
            }
        }
        return mACache;
    }

    /**
     * 缓存String类型数据
     * @param key  缓存key
     */
    public static void put(String key, String value){
        getInstance().put(key, value);
    }

    /**
     * 缓存String类型数据
     * @param key        缓存key
     * @param value      缓存值
     * @param saveTime   缓存时间,单位为分钟,如2天: 2*60*60
     */
    public static void put(String key, String value, int saveTime){
        getInstance().put(key, value, saveTime);
    }

    /**
     * 获取String类型缓存数据
     * @param key  缓存key
     * @return 若不存在返回null
     */
    public static String getString(String key){
        return getInstance().getAsString(key);
    }

    /**
     * 缓存Object类型数据
     * @param key  缓存key
     */
    public static void put(String key, Object obj){
        Gson gson = new Gson();
        getInstance().put(key, gson.toJson(obj));
    }

    /**
     * 获取缓存Object类型数据
     * @param key  缓存key
     */
    public static <T> T getObject(String key, Class<T> clazz){
        String cache = getInstance().getAsString(key);
        if(null != cache && !cache.equalsIgnoreCase("")){
            Gson gson = new Gson();
            return gson.fromJson(cache, clazz);
        }
        return null;
    }

    /**
     * 获取JsonObject类型的数据
     * @param key  缓存key
     * @return 若不存在返回false
     */
    public static JSONObject getJSON(String key){
        return getInstance().getAsJSONObject(key);
    }

    /**
     * 获取Object类型的数据
     * @param key  缓存key
     * @return 若不存在返回false
     */
    public static Object getObject(String key){
        return getInstance().getAsObject(key);
    }

    /**
     * 移除缓存
     * @param key key
     */
    public static void remove(String key){
        getInstance().remove(key);
    }

    /**
     * 是否存在缓存
     * @param key 缓存key
     * @return 存在则true，否则为false
     */
    public static boolean hasKey(String key){
        return null != getInstance().getAsObject(key);
    }
}
