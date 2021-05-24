package com.ericcode.asyncinflate;

import android.view.View;
import android.view.ViewGroup;

/**
 * @author zoutao
 */
public class AsyncInflateItem {
    String inflateKey;
    int layoutResId;
    ViewGroup parent;
    View inflatedView;

    private boolean cancelled;
    private boolean inflating;

    public AsyncInflateItem(String inflateKey, int layoutResId) {
        this.inflateKey = inflateKey;
        this.layoutResId = layoutResId;
    }

    public boolean isInflating() {
        return inflating;
    }

    public void setInflating(boolean inflating) {
        this.inflating = inflating;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void reset() {
        parent = null;
        inflatedView = null;
        cancelled = false;
        inflating = false;
    }
}