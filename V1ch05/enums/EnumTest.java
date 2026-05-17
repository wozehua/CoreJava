package enums;


import java.util.Scanner;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-05-17 10:15
 * 项目名称: CoreJava
 * 文件名称: EnumTest
 */
public class EnumTest {
    static void main(){
        System.out.print("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");

        var in=new Scanner(System.in);
        String input=in.next().toUpperCase();
        Size s=Enum.valueOf(Size.class,input);
        System.out.println("size="+s);
        System.out.println("abbreviation="+s.getAbbreviation());
        if(s==Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");

    }
}
enum  Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private Size(String abbreviation){this.abbreviation=abbreviation;}
    public String getAbbreviation(){return  abbreviation;}
    private String abbreviation;
}
