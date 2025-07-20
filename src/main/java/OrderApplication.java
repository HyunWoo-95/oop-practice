public class OrderApplication {
	public static void main(String[] args) {
		Menu menu = new Menu();

		Customer customer = new Customer();
		String menuName = "아메리카노";

		Barista barista = new Barista();
		barista.maekBeverage(menu.choose(menuName));
		customer.order(menuName, menu, barista);
	}
}

