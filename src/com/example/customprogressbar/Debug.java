package com.example.customprogressbar;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * 
 * @author Amrendra Kumar
 * @version 1.0
 * 
 */
public class Debug {

    private static final boolean DEBUG = false;
    private static final String TAG = "customprogressbar";

    private static String getMsg(String msg) {
        StackTraceElement strace = Thread.currentThread().getStackTrace()[4];
        // String fileName = strace.getFileName();
        String className = strace.getClassName();
        String methodName = strace.getMethodName();
        int line = strace.getLineNumber();
        msg = className + "::" + methodName + "() [" + line + "]" + " : " + msg;
        return msg;
    }

    public static void check() {
        if (DEBUG) {
            Log.e(TAG, getMsg("CHECK"));
        }
    }

    public static void e(String msg) {
        if (DEBUG) {
            Log.e(TAG, getMsg(msg));
        }
    }

    public static void d(String msg) {
        if (DEBUG) {
            Log.d(TAG, getMsg(msg));
        }
    }

    public static void i(String msg) {
        if (DEBUG) {
            Log.i(TAG, getMsg(msg));
        }
    }

    public static void w(String msg) {
        if (DEBUG) {
            Log.w(TAG, getMsg(msg));
        }
    }

    public static void v(String msg) {
        if (DEBUG) {
            Log.v(TAG, getMsg(msg));
        }
    }

    public static void showShort(String msg, Context context) {
        if (DEBUG) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showLong(String msg, Context context) {
        if (DEBUG) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        }
    }

}
