package hu.progmatic.lesson_20220428_03_declaration;

import java.util.Objects;

public class Declaration {
    private final String id;
    private final int year;
    private int taxToPay;

    public Declaration(String id, int year) {
        this.id = id;
        this.year = year;
    }

    public Declaration(String id, int year, int tax) {
        this.id = id;
        this.year = year;
        this.taxToPay = tax;
    }

    public String getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getTaxToPay() {
        return taxToPay;
    }

    public void setTaxToPay(int taxToPay) {
        this.taxToPay = taxToPay;
    }

    @Override
    public String toString() {
        return "Declaration{" +
                "id='" + id + '\'' +
                ", year=" + year +
                ", taxToPay=" + taxToPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Declaration that = (Declaration) o;
        return year == that.year && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        // Mit kell teljesítenie egy hashCode-nak?
        // Ha kettő hashCode NEM egyenlő, akkor o1.equals(o2)-nek false értéket KELL adnia
        // Ha kettő hashCode egyenlő, akkor o1.equals(o2)-nek tetszőleges (true vagy false) értéke lehet
        // Kérdés: return 0; érvényes hashCode-ot ad-e? -> matematikai értelemben érvényes, de értelmetlen

        // Pl. bevallás éve páros szám-e?
        // -> érvényes
        return year % 2;
    }
}
