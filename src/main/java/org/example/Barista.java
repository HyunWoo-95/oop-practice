package org.example;

public class Barista {
	public Beverage maekBeverage(MeunItem meunItem) {
		return new Beverage(meunItem);
	}
}
