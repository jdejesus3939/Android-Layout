package com.johan.androidlayout;

import ctsit.johan.layoutassignment.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	Button linear4buttons;
	Button relative4buttons;
	Button table4buttons;
	Button frame4buttons;
	Button linear8buttons;
	Button relative8buttons;
	Button table8buttons;
	Button frame8buttons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		linear4buttons = (Button) findViewById(R.id.buttons4Linear);
		relative4buttons = (Button) findViewById(R.id.buttons4Relative);
		table4buttons = (Button) findViewById(R.id.buttons4Table);
		frame4buttons = (Button) findViewById(R.id.buttons4Frame);
		linear8buttons = (Button) findViewById(R.id.buttons8Linear);
		relative8buttons = (Button) findViewById(R.id.buttons8Relative);
		table8buttons = (Button) findViewById(R.id.buttons8Table);
		frame8buttons = (Button) findViewById(R.id.buttons8Frame);

		linear4buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Linear4Buttons.class);
				startActivity(intent);
			}
		});

		relative4buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Relative4Buttons.class);
				startActivity(intent);
			}
		});

		table4buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Table4Buttons.class);
				startActivity(intent);
			}
		});

		frame4buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Frame4Buttons.class);
				startActivity(intent);
			}
		});

		linear8buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Linear8Buttons.class);
				startActivity(intent);
			}
		});

		relative8buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Relative8Buttons.class);
				startActivity(intent);
			}
		});

		table8buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Table8Buttons.class);
				startActivity(intent);
			}
		});

		frame8buttons.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						Frame8Buttons.class);
				startActivity(intent);
			}
		});

	}

}
