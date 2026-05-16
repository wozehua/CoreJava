import java.math.BigInteger;
import java.util.Scanner;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-04-25 11:12
 * 项目名称: CoreJava
 * 文件名称: BigIntegerTest
 */
public class BigIntegerTest
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k=in.nextInt();

        System.out.print("What is the highest number you can draw?");

        BigInteger n=in.nextBigInteger();

        /**
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...k)
         */
        BigInteger lotteryOdds=BigInteger.ONE;
        for (int i=1;i<=k;i++)
            lotteryOdds=lotteryOdds
                    .multiply(n.subtract(BigInteger.valueOf(i-1)))
                    .divide(BigInteger.valueOf(i));
        System.out.printf("Your odds are 1 in %s.Good luck!%n",lotteryOdds);
    }
}