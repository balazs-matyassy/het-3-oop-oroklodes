package hu.progmatic.lesson_20220428_01_store;

public class App {
    public static void main(String[] args) {
        Product chocolate = new Product("P001", "csoki", 400);
        Product chips = new Product("P002", "chips", 350);

        Store store = new Store(3);
        store.addInventory(new Inventory(chocolate, 10));
        store.addInventory(new Inventory(chocolate, 10));
        store.addInventory(new Inventory(chips, 10));
        store.addInventory(new Inventory(chocolate, 10));

        store.printInventories();
    }
}
