class LunchMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fake bacon with lettuce & tomato", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato", false, 2.99);
        addItem("Soup of the day", "Soup with a side of potato salad", false, 3.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to lunch menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }
}

class LunchMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public LunchMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public MenuItem next() {
        return items[position++];
    }
}
