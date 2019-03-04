import javax.xml.bind.SchemaOutputResolver;

public class Person {
    private  String name;
    private  int age;

    public Person(String nam, int ag) {

        name = nam;
        age = ag;
        System.out.println(name + age);
    }


}
