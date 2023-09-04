package pro.sky.java.course1.CourseWork1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Петров Петр Петрович", 2, 65_000);
        employees[1] = new Employee("Сидоров Сидор Сидорович", 3, 68_000);
        employees[2] = new Employee("Иванов Иван Иванович", 1, 75_070);
        employees[3] = new Employee("Валентинова Валентина Валентиновна", 3, 85_700);
        employees[4] = new Employee("Петрова Ирина Петровна", 1, 67_000);
        employees[5] = new Employee("Харитонов Харитон Харитонович", 4, 74_800);
        employees[6] = new Employee("Серова Ольга Артуровна", 3, 78_000);
        employees[7] = new Employee("Алексеев Алексей Алексеевич", 5, 80_099);
        employees[8] = new Employee("Андреев Андрей Андреевич", 5, 69_000);
        employees[9] = new Employee("Ольгина Ольга Сидоровна", 4, 84_000);

        Employee.employeesFull(employees);
        Employee.employeeTotalSalary(employees);

        System.out.println("Сумма затрат на заработную плату сотрудников - " + Employee.employeeTotalSalary(employees) + "руб");
        Employee.separator();
        System.out.println("C максимальной зарплатой " + Employee.employeeMaxSalary(employees));
        Employee.separator();
        System.out.println("C наименьшей зарплатой " + Employee.empMinSalary(employees));
        Employee.separator();
        System.out.println("Среднее значение зарплат - " + Employee.averageSalary(employees) + "руб");
        Employee.separator();

        Employee.employeeList(employees);
    }
}


