package hu.progmatic.lesson_20220428_02_declaration;

public class Main {
    public static void main(String[] args) {
        Declaration[] declarations = {
                new Declaration("SZJA", 2020, 10000),
                new Declaration("SZJA", 2021, 20000),
                new Declaration("ÁFA", 2020, 100000),
                new Declaration("ÁFA", 2021, 200000),
                new Declaration("ÁFA", 2020, 500000)
        };

        // hány darab új bevallást adtunk be korrekciók nélkül?
        // egy bevallás akkor korrekció, ha létezik vele azonos korábbi bevallás
        int counter = 0;

        for (int i = 0; i < declarations.length; i++) {
            boolean correction = false;

            for (int j = 0; j < i; j++) {
                // Van-e korábbi azonos adónemre és évre vonatkozó bevallás?
                if (declarations[j].equals(declarations[i])) {
                    correction = true;
                    break;
                }
            }

            if (!correction) {
                counter++;
            }
        }

        System.out.println("Új bevallások száma: " + counter);
    }
}
