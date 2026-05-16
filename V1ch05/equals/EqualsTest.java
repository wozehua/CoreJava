package equals;

/**
 * This program demonstrates the equals methods.
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 14:28
 * 项目名称: CoreJava
 * 文件名称: EqualsTest
 */
public class EqualsTest {
    static  void main(){
        Employee alice1=new Employee("Alice Adams",75000,1987,12,15);
        var alice2=alice1;
        var alice3=new Employee("Alice Adams",75000,1987,12,15);
        var bob=new Employee("Bob Brandson",50000,1989,10,1);

        System.out.println("alice1==alice2:"+(alice1==alice2));
        System.out.println("alice1==alice2:"+(alice1==alice3));
        System.out.println("alice1.equals(alices3):"+alice1.equals(alice3));
        System.out.println("alice1.equlas(bob):"+alice1.equals(bob));
        System.out.println("bob.toString():"+bob);

        var carl=new Manager("Carl Cracker",80000,1987,12,15);
        var boss=new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(50000);

        System.out.println("boss.toString():"+boss);
        System.out.println("carl.equals(boss):"+carl.equals(boss));
        System.out.println("alice1.hashCode():"+alice1.hashCode());
        System.out.println("alice2.hashCode():"+alice3.hashCode());
        System.out.println("bob.hashCode():"+bob.hashCode());
        System.out.println("carl.hasCode():"+carl.hashCode());
    }
}

