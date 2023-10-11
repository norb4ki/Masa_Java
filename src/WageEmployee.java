import java.util.Objects;

public class WageEmployee extends Employee{
    double hours;
    double wage;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Hours: "+hours+"\nWage per hour: $"+wage+"\nSalary: $"+calculateSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WageEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(hours, that.hours) == 0 && Double.compare(wage, that.wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary()+wage*hours;
    }
}
