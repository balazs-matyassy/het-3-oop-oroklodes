package hu.progmatic.lesson_20220428_02_declaration;

import java.util.Objects;

public class Declaration {
    private final String id;
    private final int year;
    private int taxToPay;

    public Declaration(String number, int year) {
        this.id = number;
        this.year = year;
    }

    public Declaration(String number, int year, int tax) {
        this.id = number;
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
        return Objects.hash(id, year);
    }
}
