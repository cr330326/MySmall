package com.cryallen.mysmall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_app_main).setOnClickListener(this);
		findViewById(R.id.btn_activity_test).setOnClickListener(this);
	}

	@Override
	protected void onStart() {
		super.onStart();

		Small.setUp(this, new Small.OnCompleteListener() {
			@Override
			public void onComplete() {
				Small.openUri("main", MainActivity.this);
			}
		});
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.btn_app_main:
				Small.openUri("app_main", this); // open .bundles.app_main Launch Activity
				break;

			case R.id.btn_activity_test:
				Small.openUri("app_main/page2", this); // open .bundles.app_main.page2

				break;
		}
	}
}
