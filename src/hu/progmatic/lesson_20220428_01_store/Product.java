package hu.progmatic.lesson_20220428_01_store;

import java.util.Objects;

// Adattároló osztály / struktúra
// Törzsadat / master data (ritkán változik, konkrét vásárlásoktól független)
public class Product {
    /*
    Ha az id final, az azt jelenti üzleti szempontból,
    hogy azonos néven, de más összetétellel forgalmazott termék nem azonos.
    Ha a name final, abban az esetben azonosnak tekintjük őket.
     */
    // 1. mezők definiálása
    private final String id;
    private String name;
    private int price;

    // 2. konstruktorok
    public Product(String id) {
        this.id = id;
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 3. getterek + setterek
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 4. toString, ha szükséges
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 5. equals + hashCode, ha szükséges
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
