package CompanyEmployeeDemo;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "John", "hr", 10.0);
        System.out.println(e1);
        Company company = new Company("Yasar");
        Employee e2 = new Employee(1, "Faruk", "cc", 2300.00);
        company.addEmployee(e2);
        company.getTotalSalary();
        company.displayEmployees();
    }
}
