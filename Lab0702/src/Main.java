import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Asan", 4, 2000),
                new Student("Zam", 2, 199),
                new Student("Sam", 1, 1877),
                new Student("Jon", 4, 1997)};
        CmpByName nam = new CmpByName();
        Student  st = new Student();
        nam.compareTo(st.name);

    }
}
