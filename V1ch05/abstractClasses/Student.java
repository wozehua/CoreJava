package abstractClasses;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 18:51
 * 项目名称: CoreJava
 * 文件名称: Student
 */
public class Student extends Person{
    private String major;

    /**
     * @param name the student's name
     * @param major the student's major
     */
    public Student(String name,String major)
    {
        //pass name to superclass constructor
        super(name);
        this.major=major;
    }

    public String getDescription(){
        return "a student majoring in" +major;
    }
}
