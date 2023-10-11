import java.util.Objects;

public class Employee extends Person{
    String company;
    String position;
    double baseSalary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Double.compare(baseSalary, employee.baseSalary) == 0 && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, position, baseSalary);
    }

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Company: "+company+"\nPosition: "+position+"\nBase salary: $"+baseSalary);
    }

    public double calculateSalary(){
        return baseSalary;
    }
}

