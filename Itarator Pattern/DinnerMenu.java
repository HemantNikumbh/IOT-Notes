import java.util.HashMap;
import java.util.Map;

class DinnerMenu {
    private Map<String, MenuItem> menuItems;

    public DinnerMenu() {
        menuItems = new HashMap<>();

        addItem("Spaghetti", "Spaghetti with marinara sauce", true, 8.99);
        addItem("Grilled Chicken", "Grilled chicken with mashed potatoes", false, 12.99);
        addItem("Caesar Salad", "Salad with Caesar dressing", true, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}

class DinnerMenuIterator implements Iterator {
    private java.util.Iterator<MenuItem> iterator;

    public DinnerMenuIterator(Map<String, MenuItem> items) {
        this.iterator = items.values().iterator();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public MenuItem next() {
        return iterator.next();
    }
}
