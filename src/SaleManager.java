import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleManager that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(totalSales, that.totalSales) == 0 && Double.compare(bonus, that.bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalSales, bonus);
    }

    public double getTotalSales() {
        return totalSales;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + totalSales*bonus/100;
    }
}
