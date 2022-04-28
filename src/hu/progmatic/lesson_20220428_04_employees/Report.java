package hu.progmatic.lesson_20220428_04_employees;

public class Report {
    private int count;
    private int total;

    // final: öröklődés során NEM lehet megváltoztatni az implementációt
    // @Override NEM működik
    public final void process(Employee employee) {
        // ha az adott alkalmazott beletartozik a statisztikába,
        // akkor frissítsük az elemszámot és az új eredményt
        if (test(employee)) {
            total = aggregate(count, total, employee);
            count++;
        }
    }

    public final int getCount() {
        return count;
    }

    public final int getTotal() {
        return total;
    }

    @Override
    public final String toString() {
        return "Report{" +
                "count=" + count +
                ", total=" + total +
                '}';
    }

    // Beletartozik-e az adott alkalmazott ebbe a statisztikába?
    protected boolean test(Employee employee) {
        return false;
    }

    // új total érték kiszámítása az éppen feldolgozott alkalmazott alapján
    protected int aggregate(int count, int total, Employee employee) {
        return total;
    }
}
