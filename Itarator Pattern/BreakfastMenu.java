import java.util.ArrayList;

class BreakfastMenu {
    private ArrayList<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<>();

        addItem("Pancakes", "Pancakes with syrup", true, 2.99);
        addItem("Waffles", "Waffles with blueberries", true, 3.59);
        addItem("Bacon and Eggs", "Bacon with scrambled eggs", false, 4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}

class BreakfastMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public MenuItem next() {
        return items.get(position++);
    }
}
