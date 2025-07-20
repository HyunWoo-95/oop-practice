package org.example;

public class Customer {
	/*
Customer가  Menu와 Barista 객체에 접근하기 위해 자신과 협력하는 Menu와 Barista를 order() 메서드의 인자로 전달받는다.
 */
	public void order(String menuName, Menu menu, Barista barista) {
		MeunItem meunItem = menu.choose(menuName);
		Beverage beverage = barista.maekBeverage(meunItem);
	}
}
