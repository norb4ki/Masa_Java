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
    public double calculateSalary(){
        return super.calculateSalary() * grade;
    }
}
