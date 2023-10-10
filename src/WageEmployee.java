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
    public double calculateSalary(){
        return super.calculateSalary()+wage*hours;
    }
}
