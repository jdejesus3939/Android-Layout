package com.johan.androidlayout;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends ListActivity {

	ListView list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] listview_items = getResources().getStringArray(
				R.array.listview_dummydata);
		
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_listview, listview_items));
		ListView list = getListView();
		list.setTextFilterEnabled(true);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				String selectedItem = ((TextView) arg1).getText().toString();
				Toast toast = Toast.makeText(getApplicationContext(),
						selectedItem, Toast.LENGTH_SHORT);
				toast.show();
			}

		});
	}
}
