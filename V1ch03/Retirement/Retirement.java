import java.util.*;

/**
 * This program demonstrates a <code>while</code> loop.
 * 创建人：  @author czh
 * 创建时间: 2026-04-22 22:49
 * 项目名称: CoreJava
 * 文件名称: Retirement
 */
public class Retirement {
    public static  void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("How much money do you need to retire?");
        double goal =in.nextDouble();
        System.out.print("How much money will you contribute every year?");
        double payment=in.nextDouble();

        System.out.print("Interest rate in %: ");

        double interestRate =in.nextDouble();

        double balance =0;
        int years=0;

        while (balance<goal){
            balance+=payment;
            double interest=balance+interestRate/100;
            balance+=interest;
            years++;
        }
        System.out.println("You can retire in "+years+"years.");
    }
}
