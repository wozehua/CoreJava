import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 创建人：  @author czh
 * 创建时间: 2026-04-26 14:47
 * 项目名称: CoreJava
 * 文件名称: CalendarTest
 */
public class CalendarTest
{
    public static  void main(String[] args)
    {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date=date.minusDays(today-1);//set to start of month
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();//1=Monday,...7=Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i=1;i<value;i++)
            System.out.print("    ");
        while (date.getMonthValue()==month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1) System.out.println();
        }
        if(date.getDayOfWeek().getValue()!=1) System.out.println();

    }
}