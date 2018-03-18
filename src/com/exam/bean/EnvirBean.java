package com.exam.bean;

public class EnvirBean{

	/**
	 * { "success": "success", "msg": "", "total": 1, "items": { "lid":
	 * "00000000-0000-0000-0000-000000000000", "temperature": 25.6, 温度
	 * "humidity": 61.3, 湿度 "illumination": 0, 亮度 "smoke": 0, 烟雾报警器 "fire": 0,
	 * 火警 "airconditioner": 0, 空调 "light": 0, 电灯 "alarm": 0, 报警灯 "water": 0, 加湿器
	 * "isauto": 1, 自动控制逻辑 "temperaturemin": 16, 温度最小值 "temperaturemax": 20,
	 * 温度最大值 "humiditymax": 30, 湿度最大值 "humiditymin": 50, 湿度最小值
	 * "illuminationmin": 5, 亮度最小值 "illuminationmax": 100 亮度最大值 } }
	 */

	/**
	 * { "success": "success", "msg": "", "total": 1, "items": { "lid":
	 * "00000000-0000-0000-0000-000000000000", "temperature": 23.9, "humidity":
	 * 44.4, "illumination": 114, "smoke": 0, "fire": 0, "airconditioner": 0,
	 * "light": 0, "alarm": 0, "water": 0, "isauto": 0, "temperaturemin": 1,
	 * "temperaturemax": 100, "humiditymax": 10, "humiditymin": 1,
	 * "illuminationmin": 30, "illuminationmax": 70, "filetel": "13509301273" }
	 * }
	 * 
	 */

	private String success;
	private String msg;
	private int total;
	private Items items;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public EnvirBean(String success, String msg, int total, Items items) {
		super();
		this.success = success;
		this.msg = msg;
		this.total = total;
		this.items = items;
	}

	public EnvirBean() {
	}

}
