public class Employee extends Person{
    String company;
    String position;
    double baseSalary;

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
