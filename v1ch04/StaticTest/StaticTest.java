/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-02 11:10
 * 项目名称: CoreJava
 * 文件名称: StaticTest
 */
public class StaticTest {
    static void main(){
        //fill the staff array with three Employee objects
        var staff =new Employees[3];

        double percent=10;
        tripleValue(percent);
        staff[0]=new Employees("Tom",40000);
        staff[1]=new Employees("Dick",60000);
        staff[2]=new Employees("Harry",65000);
        for (Employees e:staff)
        {
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        System.out.println("Next available id="+Employees.advanceId());
    }
    static  void tripleValue(double x)//doesn't work
    {
        x=3*x;
    }
}

class Employees{
    private  static  int nextId=1;
    private final String name;
    private final double salary;
    private final int id;

    public  Employees(String n,double s)
    {
        name=n;
        salary=s;
        id=advanceId();
    }

    public  String getName(){
        return  name;
    }
    public  double getSalary(){
        return  salary;
    }
    public  int getId(){
        return  id;
    }
    public static  int advanceId(){
        int r=nextId;//obtain next available id
        nextId++;
        return  r;
    }

    //unit test
    static  void main(){
        var e=new Employees("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
