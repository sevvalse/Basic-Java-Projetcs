package Lab_1;

public class Company {
    String name;
    Employee[] employees;
    int currentEmployeeCount;
    static int maxEmployeeCount = 5;

    Company(String name){
        this.name = name;
        employees = new Employee[maxEmployeeCount];
        currentEmployeeCount = 0;
    }

    void addEmployee(Employee e){
        if (currentEmployeeCount < maxEmployeeCount){
            employees[currentEmployeeCount] = e;
            currentEmployeeCount++;
        }else{
            System.out.println("Error: Maximum employee count reached");
        }

    }

    void displayEmployees(){
        for (int i = 0; i < currentEmployeeCount; i++){
            System.out.println(employees[i].toString());
        }
    }

    void getTotalSalary(){
        double totalSalary = 0;
        for (int i = 0; i < currentEmployeeCount; i++){
            totalSalary += employees[i].salary;
        }
        System.out.println(totalSalary);
    }
}

