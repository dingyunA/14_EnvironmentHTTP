package com.exam.bean;

public class EnvirBean{

	/**
	 * { "success": "success", "msg": "", "total": 1, "items": { "lid":
	 * "00000000-0000-0000-0000-000000000000", "temperature": 25.6, �¶�
	 * "humidity": 61.3, ʪ�� "illumination": 0, ���� "smoke": 0, �������� "fire": 0,
	 * �� "airconditioner": 0, �յ� "light": 0, ��� "alarm": 0, ������ "water": 0, ��ʪ��
	 * "isauto": 1, �Զ������߼� "temperaturemin": 16, �¶���Сֵ "temperaturemax": 20,
	 * �¶����ֵ "humiditymax": 30, ʪ�����ֵ "humiditymin": 50, ʪ����Сֵ
	 * "illuminationmin": 5, ������Сֵ "illuminationmax": 100 �������ֵ } }
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
