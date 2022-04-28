package hu.progmatic.lesson_20220428_01_store;

public class Store {
    private final Inventory[] inventories;

    public Store(int inventorySize) {
        this.inventories = new Inventory[inventorySize];
    }

    public void addInventory(Inventory newInventory) {
        Inventory box = null;

        for (Inventory inventory : inventories) {
            if (inventory.equals(newInventory)) {
                box = inventory;
                break;
            }
        }

        // ha még nincs ilyen doboz a raktárban,
        // akkor megkeressük az első üres helyet a raktárban és létrehozunk egy új dobozt
        if (box == null) {
            for (int i = 0; i < inventories.length; i++) {
                if (inventories[i] == null) {
                    inventories[i] = new Inventory(newInventory.getProduct(), newInventory.getQuantity());
                }
            }
        } else {
            // ha már van ilyen doboz, akkor hozzáadjuk az új mennyiséget
            box.setQuantity(box.getQuantity() + newInventory.getQuantity());
        }
    }

    public void printInventories() {
        for (Inventory inventory : inventories) {
            System.out.println(inventory);
        }
    }
}
