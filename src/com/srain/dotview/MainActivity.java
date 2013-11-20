package com.srain.dotview;

import com.srain.views.DotView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final DotView dotView = (DotView) findViewById(R.id.dot_view);
		dotView.setNum(10);
		((Button) findViewById(R.id.bt_next)).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				int next = dotView.getCurrentIndex() + 1;
				if (next >= dotView.getTotal())
					next = 0;
				dotView.setSelected(next);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
