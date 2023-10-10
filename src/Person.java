import java.util.Objects;

public class Person {
    String name;
    int age;
    boolean married;

    public Person(String name, int age, boolean married) {
        this.name = Objects.requireNonNullElse(name, "Grzegorz Brzęczyśczykiewicz");
        this.age = age;
        this.married = married;
    }

    public void display(){
        String str=(married)?"married":"single";
        System.out.println("Name: "+name+"\nAge: "+age+"\nRelationship status: "+str);
    }
}
