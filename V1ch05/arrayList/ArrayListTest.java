package arrayList;

import equals.Employee;

import java.util.ArrayList;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 16:34
 * 项目名称: CoreJava
 * 文件名称: ArrayListTest
 */
public class ArrayListTest {
    static void main(){
        //fill the staff array list with three Employee objects
        var staff=new ArrayList<Employee>();
        staff.add(new Employee("Carl Cracker",75000,1987,12,15));
        staff.add(new Employee("Carl Cracker",50000,1987,12,15));
        staff.add(new Employee("Carl Cracker",40000,1987,12,15));

        //raise everyone's salary by 5%
        for (Employee e:staff)
            e.raiseSalary(5);

        //print out information about all Employee objects
        for(Employee e:staff)
            System.out.println("name="+e.getName()+".salray="+e.getSalary()+",hireDay="+e.getHireDay());
    }

}
