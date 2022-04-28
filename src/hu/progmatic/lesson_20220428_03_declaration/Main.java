package hu.progmatic.lesson_20220428_03_declaration;

public class Main {
    public static void main(String[] args) {
        Declaration[] declarations = {
                new Declaration("SZJA", 2020, 10000),
                new Declaration("SZJA", 2021, 20000),
                new Declaration("ÁFA", 2020, 100000),
                new Declaration("ÁFA", 2021, 200000)
        };

        boolean isCorrection = false;

        Declaration correction = new Declaration("ÁFA", 2020, 500000);

        // 1. verzió: legrosszabb esetben 4 összehasonlítás kell
        for (Declaration declaration : declarations) {
            if (declaration.equals(correction)) {
                isCorrection = true;
                break;
            }
        }

        // 2. verzió: legrosszabb esetben 2 összehasonlítás kell
        // ha páros és páratlan évekre szétválogatjuk a bevallásokat,
        // akkor csak a bevallások felét kell megvizsgálni
        Declaration[] declarations_0 = {
                declarations[0],
                declarations[2]
        };
        Declaration[] declarations_1 = {
                declarations[1],
                declarations[3]
        };

        isCorrection = false;

        if (correction.hashCode() == 0) {
            for (Declaration declaration : declarations_0) {
                if (declaration.equals(correction)) {
                    isCorrection = true;
                    break;
                }
            }
        } else {
            for (Declaration declaration : declarations_1) {
                if (declaration.equals(correction)) {
                    isCorrection = true;
                    break;
                }
            }
        }
    }
}
