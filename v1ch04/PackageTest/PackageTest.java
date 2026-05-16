import com.horstmann.corejava.*;
//the Employee class is defined in that package
import static java.lang.System.*;
/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-10 11:23
 * 项目名称: CoreJava
 * 文件名称: PackageTest
 */
public class PackageTest
{
    public static  void  main(String[] args)
    {
        //because of the import statement,we don't have to use
        //com.horstman.corejava.Employee here
        var harry=new Employee("Harray Hacker",50000,1989,10,1);

        harry.raiseSalary(5);

        //because of the static import statement,we don't have to use System.out here
        out.println("name="+harry.getName()+",salary="+harry.getSalary());
    }

}
