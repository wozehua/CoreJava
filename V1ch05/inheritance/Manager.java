package inheritance;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-10 16:14
 * 项目名称: CoreJava
 * 文件名称: Manager
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary,int year,int month,int day)
    {
        super(name,salary,year,month,day);
        bonus=0;
    }
    public double getSalary()
    {
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }
    public  void  setBonus(double b)
    {
        bonus=b;
    }
}
