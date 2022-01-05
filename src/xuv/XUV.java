package xuv;

import car.Car;

public class XUV extends Car {

	
	 public XUV(String message)
	 
	 { super(message); }
	 
	private int seats;

	private int airbags;

	private String model;

	private String color;

	public void setSeat(int seats) {

		this.seats = seats;

	}

	public void setAirbag(int airbags) {

		this.airbags = airbags;

	}

	public void setModel(String model) {

		this.model = model;

	}

	public void setColor(String color) {

		this.color = color;

	}

	public int getSeat() {
		return this.seats;
	}

	public int getAirbag() {
		return this.airbags;
	}

	public String getModel() {
		return this.model;
	}

	public String getColor() {
		return this.color;
	}

}
