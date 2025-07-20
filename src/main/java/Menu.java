import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MeunItem> items;


	public Menu() {
		this.items = createMenu();
	}

	public MeunItem choose(String name) {

		for (MeunItem item : items) {
			if (item.getName().equals(name)) {
				return item;
			}
		}
		return null;
	}
	public List<MeunItem> createMenu() {
		List<MeunItem> items = new ArrayList<>();
		MeunItem item1 = new MeunItem("아메리카노", 4500);
		MeunItem item2 = new MeunItem("카푸치노", 5500);
		MeunItem item3 = new MeunItem("에스프레소", 3500);
		items.add(item1);
		items.add(item2);
		items.add(item3);
		return items;
	}
}
