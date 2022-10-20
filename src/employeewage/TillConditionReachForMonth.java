package employeewage;

import java.util.Random;

public class TillConditionReachForMonth {

    public void Condition(){
    int maxHr=100;
    int numWorkingDays=20;
    int monthlySalary=0;
    int wage=20;
    int totalWorkingDays=0;
    int partHr=8;
    int fullHr=16;

        while (totalWorkingDays< numWorkingDays && totalWorkingDays < maxHr)
    {
        Random random=new Random();
        int x=random.nextInt(3);
        totalWorkingDays ++;
        switch (x)
        {
            case 0:
                System.out.println("Employee is Absent");
                break;
            case 1:
                System.out.println("Employee is Present Part Time");
                monthlySalary=(wage*partHr);
                System.out.println("Salary Of Month :" +monthlySalary);
                System.out.println("Day:" +totalWorkingDays);
                break;
            case 2:
                System.out.println("Employee is Present full time");
                monthlySalary=(wage*fullHr);
                System.out.println("Salary Of Month :" +monthlySalary);
                System.out.println("Day :" +totalWorkingDays);
            }
        }

    }
    public static void main(String [] args){
        System.out.println("Checking Till Days =20");
            TillConditionReachForMonth Obj =new TillConditionReachForMonth();
            Obj.Condition();
    }
}
