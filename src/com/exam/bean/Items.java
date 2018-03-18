package com.exam.bean;

public class Items {
	/**
	 * "lid": "00000000-0000-0000-0000-000000000000", "temperature": 23.9,
	 * "humidity": 44.4,
	 * 
	 * "illumination": 114, "smoke": 0, "fire": 0, "airconditioner": 0,
	 * 
	 * "light": 0, "alarm": 0, "water": 0, "isauto": 0,
	 * 
	 * "temperaturemin": 1, "temperaturemax": 100, "humiditymax": 10,
	 * "humiditymin": 1, "illuminationmin": 30, "illuminationmax": 70,
	 * 
	 * "filetel": "13509301273"
	 */
	// {lid=00000000-0000-0000-0000-000000000000, temperature=23.9,
	// humidity=44.4, illumination=114.0, smoke=0.0, fire=0.0,
	// airconditioner=0.0, light=0.0, alarm=0.0, water=0.0, isauto=0.0,
	// temperaturemin=1.0,
	// temperaturemax=100.0, humiditymax=10.0, humiditymin=1.0,
	// illuminationmin=30.0,
	// illuminationmax=70.0, filetel=13509301273}

	private String lid;
	private double temperature;
	private double humidity;

	private double illumination;
	private double smoke;
	private double fire;
	private double airconditioner;

	private double light;
	private double alarm;
	private double water;
	private double isauto;

	private double temperaturemin;
	private double temperaturemax;

	private double humiditymax;
	private double humiditymin;

	private double illuminationmin;
	private double illuminationmax;
	private String filetel;

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double d) {
		this.temperature = d;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getIllumination() {
		return illumination;
	}

	public void setIllumination(double illumination) {
		this.illumination = illumination;
	}

	public double getSmoke() {
		return smoke;
	}

	public void setSmoke(double smoke) {
		this.smoke = smoke;
	}

	public double getFire() {
		return fire;
	}

	public void setFire(double fire) {
		this.fire = fire;
	}

	public double getAirconditioner() {
		return airconditioner;
	}

	public void setAirconditioner(double airconditioner) {
		this.airconditioner = airconditioner;
	}

	public double getLight() {
		return light;
	}

	public void setLight(double light) {
		this.light = light;
	}

	public double getAlarm() {
		return alarm;
	}

	public void setAlarm(double alarm) {
		this.alarm = alarm;
	}

	public double getWater() {
		return water;
	}

	public void setWater(double water) {
		this.water = water;
	}

	public double getIsauto() {
		return isauto;
	}

	public void setIsauto(double isauto) {
		this.isauto = isauto;
	}

	public double getTemperaturemin() {
		return temperaturemin;
	}

	public void setTemperaturemin(double temperaturemin) {
		this.temperaturemin = temperaturemin;
	}

	public double getTemperaturemax() {
		return temperaturemax;
	}

	public void setTemperaturemax(double temperaturemax) {
		this.temperaturemax = temperaturemax;
	}

	public double getHumiditymin() {
		return humiditymin;
	}

	public void setHumiditymin(double humiditymin) {
		this.humiditymin = humiditymin;
	}

	public double getHumiditymax() {
		return humiditymax;
	}

	public void setHumiditymax(double humiditymax) {
		this.humiditymax = humiditymax;
	}

	public double getIlluminationmin() {
		return illuminationmin;
	}

	public void setIlluminationmin(double illuminationmin) {
		this.illuminationmin = illuminationmin;
	}

	public double getIlluminationmax() {
		return illuminationmax;
	}

	public void setIlluminationmax(double illuminationmax) {
		this.illuminationmax = illuminationmax;
	}

	public String getFiletel() {
		return filetel;
	}

	public void setFiletel(String filetel) {
		this.filetel = filetel;
	}

	public Items(String lid, double temperature, double humidity,
			double illumination, double smoke, double fire,
			double airconditioner, double light, double alarm, double water,
			double isauto, double temperaturemin, double temperaturemax,
			double humiditymin, double humiditymax, double illuminationmin,
			double illuminationmax, String filetel) {
		super();
		this.lid = lid;
		this.temperature = temperature;
		this.humidity = humidity;
		this.illumination = illumination;
		this.smoke = smoke;
		this.fire = fire;
		this.airconditioner = airconditioner;
		this.light = light;
		this.alarm = alarm;
		this.water = water;
		this.isauto = isauto;
		this.temperaturemin = temperaturemin;
		this.temperaturemax = temperaturemax;
		this.humiditymin = humiditymin;
		this.humiditymax = humiditymax;
		this.illuminationmin = illuminationmin;
		this.illuminationmax = illuminationmax;
		this.filetel = filetel;
	}

	public Items() {
	}

}
