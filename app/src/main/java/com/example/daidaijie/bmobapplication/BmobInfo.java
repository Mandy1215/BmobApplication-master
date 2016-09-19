package com.example.daidaijie.bmobapplication;

/**
 * Created by daidaijie on 2016/9/16.
 */
public class BmobInfo {

    public static String appID = "b08edd4c77c70c2f1984a2327fd675e3";

    private static BmobInfo ourInstance = new BmobInfo();

    public static BmobInfo getInstance() {
        return ourInstance;
    }

    private BmobInfo() {
    }
}
