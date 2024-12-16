class Waitress {
    private BreakfastMenu breakfastMenu;
    private LunchMenu lunchMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu, DinnerMenu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator lunchIterator = lunchMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
        System.out.println("\nDINNER");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
