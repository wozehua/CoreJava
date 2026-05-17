package abstractClasses;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 18:45
 * 项目名称: CoreJava
 * 文件名称: PersonTest
 */
public class PersonTest {
    static void main() {
        var people = new Person[2];

        //fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        //print out names and descriptions of all Person objects
        for (Person p : people)
            System.out.println(p.getName() + "," + p.getDescription());

    }

}