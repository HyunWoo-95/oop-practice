import java.util.List;

public class Menu {

	private List<MeunItem> items;

	public Menu(List<MeunItem> items) {
		this.items = items;
	}
	public MeunItem choose(String name) {

		for (MeunItem item : items) {
			if (item.getName().equals(name)){
				return item;
			}
		}
		return null;
	}
}
