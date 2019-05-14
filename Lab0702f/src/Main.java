import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Asan", 3.5, 1999),
                new Student("Elim", 2.0, 1997),
                new Student("Zair", 4.0, 2000)};

        CName cName = new CName();

        Arrays.sort(students, cName);
        for (Student e: students) {
            System.out.println(e);
        }
        System.out.println("00000000000000000000000000");
        CGpa gpa = new CGpa();
        Arrays.sort(students, gpa);
        for (Student e: students) {
            System.out.println(e);
        }
        System.out.println("00000000000000000000000000");

        Arrays.sort(students, (o1, o2) -> Integer.compare(o1.year, o2.year));
        for (Student e: students) {
            System.out.println(e);
        }

    }
}

class CName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CGpa implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.gpa, o2.gpa);
    }
}
