public class SaleManager extends Employee{
    double totalSales;
    double bonus;//percent

    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Total sales: $"+totalSales+"\nBonus: "+bonus+"%\nSalary: $"+calculateSalary());

    }

    public double getTotalSales() {
        return totalSales;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + totalSales*bonus/100;
    }
}
