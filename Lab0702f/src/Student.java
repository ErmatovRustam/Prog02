public class Student {
    String name;
    double gpa;
    int year;
    public Student(String name, double gpa, int year){
        this.name = name;
        this.gpa = gpa;
        this.year = year;
    }
    @Override
    public String toString(){
        return String.format("Student: " + name + ", gpa " + gpa + " , year " + year);
    }
}
