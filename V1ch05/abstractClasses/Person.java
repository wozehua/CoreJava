package abstractClasses;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-16 18:45
 * 项目名称: CoreJava
 * 文件名称: Person
 */
public abstract class Person {
    public abstract  String getDescription();
    private String name;

    public  Person(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }

}
