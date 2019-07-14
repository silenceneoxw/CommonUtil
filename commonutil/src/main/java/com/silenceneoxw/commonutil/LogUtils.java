/*
 * Copyright (C) silenceneoxw. Open source codes for study only.
 * Do not use for commercial purpose.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.silenceneoxw.commonutil;

import android.util.Log;

/**
 * 自定义日志打印工具类
 *
 * @Name : LogUtils
 * @Date : 2019/7/14 17:36
 * @Author : silenceneoxw
 * @E-mail : silenceneoxw@gmail.com
 * @Link : https://github.com/silenceneoxw
 */
public class LogUtils {
    private static final String TAG = "LogUtils";

    // 日志输出级别 VERBOSE
    public static final int LEVEL_VERBOSE = Log.VERBOSE;
    // 日志输出级别 DEBUG
    public static final int LEVEL_DEBUG = Log.DEBUG;
    // 日志输出级别 INFO
    public static final int LEVEL_INFO = Log.INFO;
    // 日志输出级别 WARN
    public static final int LEVEL_WARN = Log.WARN;
    // 日志输出级别 ERROR
    public static final int LEVEL_ERROR = Log.ERROR;
    // 日志输出级别 ASSERT
    public static final int LEVEL_ASSERT = Log.ASSERT;
    // 日志输出级别 NONE
    public static final int LEVEL_NONE = LEVEL_ASSERT + 1;

    // 允许输出的 Log 级别
    private static int mLogLevel = LEVEL_NONE;

    public static void setLogLevel(int logLevel) {
        mLogLevel = logLevel;
    }

    public static void v(String msg) {
        v(TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (LEVEL_VERBOSE >= mLogLevel) {
            Log.v(tag, msg);
        }
    }

    public static void v(String msg, Throwable tr) {
        v(TAG, msg, tr);
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (LEVEL_VERBOSE >= mLogLevel) {
            Log.v(tag, msg, tr);
        }
    }

    public static void d(String msg) {
        d(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (LEVEL_DEBUG >= mLogLevel) {
            Log.d(tag, msg);
        }
    }

    public static void d(String msg, Throwable tr) {
        d(TAG, msg, tr);
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (LEVEL_DEBUG >= mLogLevel) {
            Log.d(tag, msg, tr);
        }
    }

    public static void i(String msg) {
        i(TAG, msg);
    }

    public static void i(String tag, String msg) {
        if (LEVEL_INFO >= mLogLevel) {
            Log.i(tag, msg);
        }
    }

    public static void i(String msg, Throwable tr) {
        i(TAG, msg, tr);
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (LEVEL_INFO >= mLogLevel) {
            Log.i(tag, msg, tr);
        }
    }

    public static void w(String msg) {
        w(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (LEVEL_WARN >= mLogLevel) {
            Log.w(tag, msg);
        }
    }

    public static void w(Throwable tr) {
        w(TAG, tr);
    }

    public static void w(String tag, Throwable tr) {
        if (LEVEL_WARN >= mLogLevel) {
            Log.w(tag, tr);
        }
    }

    public static void w(Throwable tr, String msg) {
        w(TAG, msg, tr);
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (LEVEL_WARN >= mLogLevel) {
            Log.d(tag, msg, tr);
        }
    }

    public static void e(String msg) {
        e(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (LEVEL_ERROR >= mLogLevel) {
            Log.e(tag, msg);
        }
    }

    public static void e(String msg, Throwable tr) {
        e(TAG, msg, tr);
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (LEVEL_ERROR >= mLogLevel) {
            Log.e(tag, msg, tr);
        }
    }
}
