package com.cryallen.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * @ClassName: SmallApp
 * @Description:
 * @author: chenran3
 * @date: 2017/7/20 19:41
 */
public class SmallApp extends Application {

	public SmallApp() {
		Small.preSetUp(this);
	}

	@Override
	public void onCreate() {
		super.onCreate();
	}
}
