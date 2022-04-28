package hu.progmatic.lesson_20220428_03_declaration;

public class Main {
    public static void main(String[] args) {
        Declaration[] declarations = {
                new Declaration("SZJA", 2020, 10000),
                new Declaration("SZJA", 2021, 20000),
                new Declaration("ÁFA", 2020, 100000),
                new Declaration("ÁFA", 2021, 200000)
        };

        Declaration correction = new Declaration("ÁFA", 2020, 500000);
    }
}
