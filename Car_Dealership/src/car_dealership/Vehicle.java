package car_dealership;

public class Vehicle {

	private String Company;
	private String Model;
	private double price;
	private int year_production;
	private int max_speed;
	private int hp;
	private int torque;
	private double engine_capacity;
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public double getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(double engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYear_production() {
		return year_production;
	}
	public void setYear_production(int year_production) {
		this.year_production = year_production;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getTorque() {
		return torque;
	}
	public void setTorque(int torque) {
		this.torque = torque;
	}

	public String toString() {
		return "Vehicle: " + Company + " " + Model + "\nEngine capacity: " + engine_capacity + "l\nHorse power: " + hp + "HP\nTorque: " + torque + "Nm\nTop speed: " + max_speed + "km/h\nProduction: " + year_production + "\nPrice: " + price + "$";
	}
	
	
}
