package com.ericcode.asyncinflate;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

/**
 * @author zoutao
 */
public class AsyncInflateUtil {
    public static void startTask(Application application) {
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