import java.util.*;
public class ComputeSalary
{
    public static int weekDaysSalary(List<Integer>workingHours)
    {
        int weekDaySalary=0;
        int DayWorkHours=0;
        int extraHoursADay=0;
        for(int itr=1;itr<=5;itr++)
        {
            DayWorkHours=workingHours.get(itr);
            if(DayWorkHours<=8)
                weekDaySalary+=DayWorkHours*100;
            else
            {
                extraHoursADay=DayWorkHours-8;
                weekDaySalary +=(DayWorkHours-extraHoursADay)*100+(extraHoursADay*115);
            }
        }
        return weekDaySalary;
    }
    public static double saturdaySalary(int hoursWorked)
    {
        return hoursWorked*125;
    }
    public static double sundaySalary(int hoursWorked)
    {
        return hoursWorked*150;
    }
    public static int weeklyBonus(int totalHoursWorked)
    {
        if(totalHoursWorked>40)
            return (totalHoursWorked-40)*25;
        return 0;
    }
    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        List<Integer> workingHours=new ArrayList<>();
        int totalHoursAWeek=0;
        for(int itr=0;itr<7;itr++)
        {
            workingHours.add(get.nextInt());
            if(itr!=0 && itr!=6)
                totalHoursAWeek+=workingHours.get(itr);
        }
        double totalSalary=0;
        double saturdayPay=saturdaySalary(workingHours.get(6));
        double sundayPay=sundaySalary(workingHours.get(0));
        double weekBonus=weeklyBonus(totalHoursAWeek);

        totalSalary+=weekDaysSalary(workingHours)+saturdayPay+sundayPay+weekBonus;
        System.out.println("Total salary of Jeevitha is "+totalSalary);
    }

}
