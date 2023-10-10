public class PersonAppl {
    public static void main(String[] args) {
        Employee[] company = new Employee[10];
        company[0]=new Manager("Michael Scott",40, false, "Dunder Mifflin","regional manager",2500,3);
        company[1]=new SaleManager("Jim Halpert",26, false,"Dunder Mifflin","salesman",1500,25000,5);
        company[2]=new SaleManager("Dwight Schrute",30, false,"Dunder Mifflin","salesman",1500,30000,5);
        company[3]=new SaleManager("Stanley Hudson",46, true,"Dunder Mifflin","salesman",1500,17000,5);
        company[4]=new SaleManager("Phyllis Vance",40, true,"Dunder Mifflin","salesman",1500,16000,5);
        company[5]=new WageEmployee("Pam Beesly", 24, false, "Dunder Mifflin", "receptionist",500,160,9);
        company[6]=new WageEmployee("Oscar Martinez", 33,false,"Dunder Mifflin","accountant",700,160,12);
        company[7]=new WageEmployee("Angela Martin", 29,false,"Dunder Mifflin","accountant",700,160,12);
        company[8]=new WageEmployee("Kevin Malone", 32,false,"Dunder Mifflin","accountant",700,160,12);
        company[9]=new WageEmployee("Ryan Howard",22,false,"Dunder Mifflin","intern",0,160,5);

        showAllEmployees(company);
        System.out.println("\nTotal salary expenses: $"+showCompanyExpenses(company));
        System.out.println("\nTotal company incomes: $"+showCompanyIncomes(company));

    }

    public static void showAllEmployees(Employee[] employees){
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public static double showCompanyExpenses(Employee[] employees){
        double expense=0;
        for (Employee employee : employees) {
            expense += employee.calculateSalary();
        }
        return expense;
    }

    public static double showCompanyIncomes(Employee[] employees){
        double income=0;
        for (Employee employee:employees) {
            if(employee instanceof SaleManager){
                income+=((SaleManager) employee).getTotalSales();
            }
        }
        return income;
    }

}