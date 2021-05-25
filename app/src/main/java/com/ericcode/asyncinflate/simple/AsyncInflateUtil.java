package com.ericcode.asyncinflate.simple;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

import com.ericcode.asyncinflate.AsyncInflateItem;
import com.ericcode.asyncinflate.AsyncInflateManager;

/**
 * @author zoutao, zsm
 */
public class AsyncInflateUtil {
    public static void startTask(Application application) {
        application.setTheme(application.getApplicationInfo().theme);
        Context context = new MutableContextWrapper(application);
        AsyncInflateManager.getInstance().asyncInflateViews(context,
                new AsyncInflateItem(InflateKey.KEY_2, R.layout.activity_main2),
                new AsyncInflateItem(InflateKey.KEY_3, R.layout.activity_main3));

    }

    public class InflateKey {
        public static final String KEY_2 = "KEY_2";
        public static final String KEY_3 = "KEY_3";
    }
}