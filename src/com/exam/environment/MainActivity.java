package com.exam.environment;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.exam.Util.HttpClientUtil;
import com.exam.bean.EnvirBean;
import com.exam.bean.Items;
import com.google.gson.Gson;

public class MainActivity extends Activity {
	private String httpUrl = "http://192.168.15.2/ISmarketFor2015GZ/service/Environment.ashx";

	// "http://192.168.15.2/ISmarketFor2015GZ/service/Environment.ashx"
	// "http://192.168.15.2/ISmarketFor2015GZ/service/pros.ashx";

	// POST发送 {"ApiName": "GetData", "p": ""}
	private TextView tv1, tv2, tv3;
	String result;
	EnvirBean bean;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initView();

		try {
			result = HttpClientUtil.PostSend(httpUrl, "GetData", "");
			Log.i("1", result);
			
			
			Gson gson = new Gson();
			Log.i("1", "2");
			bean = gson.fromJson(result, EnvirBean.class);

			
			
			Log.i("1", "1-" + bean.getSuccess());
			Log.i("1", "1-1---" + bean.getItems().getTemperature());

		} catch (Exception e) {
			e.printStackTrace();
		}

		tv1.setText("Lid:" + bean.getItems().getLid() + "温度:"
				+ bean.getItems().getTemperature());
		tv2.setText("湿度:" + bean.getItems().getHumidity());
		tv3.setText("光照:" + bean.getItems().getLight());

	}

	private void initView() {
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv3 = (TextView) findViewById(R.id.tv3);

	}

}
