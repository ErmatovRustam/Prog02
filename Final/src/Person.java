public class Person {
    static int count = 0;
    private String name;

    Person(String name){
        this.name = name;
        ++count;
    }
    public String getName(){
        return name;
    }
    public int getCount(){
        return count;
    }
}
