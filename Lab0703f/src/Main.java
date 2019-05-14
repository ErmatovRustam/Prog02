public class Main {

    public static void main(String[] args) {
        int[] a1 = {1, 5, 2, 15};
        MyArrays.insert(a1);
        for (int e : a1) {
            System.out.print(" " + e);
        }

        Rational[] a2 = {
                Rational.parse("1/2"), Rational.parse("2/3"), Rational.parse("4/5")};
        MyArrays.insert(a2);
        for (Object e : a2) {
            System.out.print(" " + e);
        }

        SortnyName srt = new SortnyName();

        Student[] a3 = {
                new Student("Asan", 3.2, 2000),
                new Student("Aba", 4.0, 2000)};

        MyArrays.insert(a3, srt);

        for (Student e : a3) {
            System.out.print(" " + e);
        }
    }

}

class SortnyName implements MyComparator {

    @Override
    public int compareTo(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.name.compareTo(s2.name);
    }
}
