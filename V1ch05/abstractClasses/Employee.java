package abstractClasses;

import java.time.LocalDate;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 18:47
 * 项目名称: CoreJava
 * 文件名称: Employee
 */
public class Employee extends  Person{
    private double salary;
    private final LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day) {
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public String getDescription(){
        return "an employee with a salary of $%.2f".formatted(salary);
    }

    public  void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
