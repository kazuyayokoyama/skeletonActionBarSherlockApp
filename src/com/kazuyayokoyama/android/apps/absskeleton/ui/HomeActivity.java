package com.kazuyayokoyama.android.apps.absskeleton.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBar;
import android.support.v4.app.FragmentActivity;

import com.kazuyayokoyama.android.apps.absskeleton.R;

public class HomeActivity extends FragmentActivity {
	//private static final String TAG = "HomeActivity";
	private static final int REQUEST_SAMPLE = 0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

		final ActionBar actionBar = getSupportActionBar();
		// set defaults for logo & home up
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setDisplayUseLogoEnabled(true);
		
		goSample();
    }

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQUEST_SAMPLE) {
			finish();
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

    
    private void goSample() {
		// Intent
		Intent intent = new Intent(this, SampleActivity.class);
		startActivityForResult(intent, REQUEST_SAMPLE);
    }
}