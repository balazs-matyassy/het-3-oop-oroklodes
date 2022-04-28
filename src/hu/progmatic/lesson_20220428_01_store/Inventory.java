package hu.progmatic.lesson_20220428_01_store;

import java.util.Objects;

// Adattároló osztály / struktúra
// Tranzakciós adat (függ a konkrét üzleti eseményektől, gyakran változik)
public class Inventory {
    private final Product product;
    private int quantity;

    public Inventory(Product product) {
        this.product = product;
    }

    public Inventory(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return product.equals(inventory.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }
}
