public class Beverage {
	private String name;
	private int price;

	public Beverage(MeunItem meunItem) {
		this.name = meunItem.getName();
		this.price = meunItem.getPrice();
	}
}
