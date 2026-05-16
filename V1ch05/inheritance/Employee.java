package inheritance;

import java.time.LocalDate;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-10 16:03
 * 项目名称: CoreJava
 * 文件名称: Employee
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day)
    {
        this.name=name;
        this.salary=salary;
        this.hireDay=LocalDate.of(year,month,day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return  salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise =salary*byPercent/100;
        salary+=raise;
    }
}
