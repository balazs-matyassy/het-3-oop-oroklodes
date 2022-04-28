package hu.progmatic.lesson_20220428_04_employees.app;

import hu.progmatic.lesson_20220428_04_employees.Employee;
import hu.progmatic.lesson_20220428_04_employees.Report;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("0001", "Józsi", 25, false, 4600000),
                new Employee("0002", "Pista", 55, false, 5600000),
                new Employee("0003", "Anna", 35, true, 7600000),
                new Employee("0004", "Mária", 19, true, 2650000)
        };

        Report[] reports = {

        };

        for (Report report : reports) {
            // minden riportnál feldolgozzuk az összes alkalmazottat
            for (Employee employee : employees) {
                report.process(employee);
            }

            System.out.println(report);
        }
    }
}
