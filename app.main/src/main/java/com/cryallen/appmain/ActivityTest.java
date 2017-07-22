package com.cryallen.appmain;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @ClassName: ActivityTest
 * @Description:
 * @author: chenran3
 * @date: 2017/7/21 11:08
 */
public class ActivityTest extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);

		setTitle("Activity Test");
	}
}
