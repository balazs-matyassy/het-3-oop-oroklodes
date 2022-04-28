package hu.progmatic.lesson_20220428_04_employees;

public class ReportMenSalarySum extends Report {
    @Override
    public String getName() {
        return "ReportMenSalarySum";
    }

    @Override
    protected boolean test(Employee employee) {
        return !employee.isFemale();
    }

    @Override
    protected int aggregate(int count, int total, Employee employee) {
        return total + employee.getSalary();
    }
}
