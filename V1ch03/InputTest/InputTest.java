import java.io.Console;
import  java.util.*;
/**
 * 创建人：  @author czh
 * 创建时间: 2026-04-19 16:28
 * 项目名称: CoreJava
 * 文件名称: InputTest
 */
public  class InputTest {
    public  static  void main(String[] args){
        Scanner in =new Scanner(System.in);

        //get first input
        System.out.print("What is your name?");
        String name=in.nextLine();

        //get second input
        System.out.print("How old are you?");
        int age= in.nextInt();

        Console cons =System.console();
        String username=cons.readLine("User name:");
        char[] passwd=cons.readPassword("Password:");

        //display output on console
        System.out.println("Hello,"+name+".Next year,you'll be "+(age+1));

        System.out.println("username:"+username+".password:"+ Arrays.toString(passwd));
    }
}