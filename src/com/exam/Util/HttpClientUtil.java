package com.exam.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.exam.bean.EnvirBean;
import com.exam.bean.Items;
import com.google.gson.JsonObject;
//{"ApiName": "isAuto", "p": 1} 
//{"ApiName": "GetData", "p": ""} 
//{"p":"","ApiName":"GetData"}
//{"ApiName": "sysAlert", "p": ""} 

public class HttpClientUtil {
	public static String PostSend(String url, String ApiName, String p) {
		String str = "";
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		post.addHeader("Content-Type", "application/json");
		JSONObject jo = new JSONObject();

		try {
			jo.put("ApiName", ApiName);
			jo.put("p", p);
			Log.i("1", "jo-" + jo.toString());
			post.setEntity(new StringEntity(jo.toString()));
			HttpResponse response = client.execute(post);
			InputStream is = response.getEntity().getContent();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			StringBuffer sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			br.close();
			str = sb.toString();
			Log.i("1", "str-" + str);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return str;
	}

	public static void PullJson(String str) {
		Items items = new Items();
		EnvirBean bean;

		try {
			JSONObject object = new JSONObject(str);

		} catch (JSONException e) {
			e.printStackTrace();
		}

	}

}
