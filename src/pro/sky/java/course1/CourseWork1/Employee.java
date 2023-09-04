package pro.sky.java.course1.CourseWork1;

public class Employee {
    private String employeeName;
    private int department;
    private double employeeSalary;
    private  int employeeID;
    private static int count = 1;

    public Employee(String employeeName, int department, double salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.employeeSalary = salary;
        this.setEmployeeID(count++);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String toString() {
        return "Сотрудник: " + employeeName + "\nДепартамент - " + department + "\nЗарплата сотрудника - " + employeeSalary +
                "\nID сотрудника - " + employeeID + "\n";
    }

    public static void employeesFull(Employee[] employees) {
        for (Employee i : employees) {
            if (employees != null) {
                System.out.println(i);

            }
        }
    }

    public static void separator() {
        System.out.println("----------------------------------");
    }

    public static double employeeTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getEmployeeSalary();
        }
        return totalSalary;
    }

    public static double averageSalary(Employee[] employees) {
        return employeeTotalSalary(employees) / employees.length;
    }

    public static Employee employeeMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee i : employees) {
            if (i.getEmployeeSalary() > maxSalary.getEmployeeSalary()) {
                maxSalary = i;
            }
        }
        return maxSalary;
    }

    public static Employee empMinSalary(Employee[] employees) {
        Employee minSalary = employees[0];
        for (Employee i : employees) {
            if (i.getEmployeeSalary() < minSalary.getEmployeeSalary()) {
                minSalary = i;
            }
        }
        return minSalary;
    }

    public static void employeeList(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i.getEmployeeName());
        }
    }
}