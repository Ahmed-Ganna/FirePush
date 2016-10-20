package com.ganna.firepush.utils;

import android.app.Activity;
import android.content.Intent;

import com.ganna.firepush.activity.MainActivity;

/**
 * Created by Ahmed on 10/14/2016.
 */

public class ScreenManager {
    public static void launchMainScreen(Activity activity){
        activity.startActivity(new Intent(activity, MainActivity.class));
        activity.finish();
    }
}
