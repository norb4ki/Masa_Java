import java.util.Objects;

public class Manager extends Employee{
    int grade=1;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        if(grade>=1&&grade<=6)
            this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: "+grade+"\nSalary: $"+calculateSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return grade == manager.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grade);
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() * grade;
    }
}
