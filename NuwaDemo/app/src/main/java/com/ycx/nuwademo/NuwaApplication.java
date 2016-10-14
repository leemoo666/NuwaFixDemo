package com.ycx.nuwademo;

import android.app.Application;
import android.os.Environment;
import android.util.Log;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by 李小明 on 16/10/14.
 * 邮箱:287907160@qq.com
 */

public class NuwaApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Nuwa.init(this);
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
        Log.i("lxm",  Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
    }
}
