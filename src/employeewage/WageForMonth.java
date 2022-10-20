package employeewage;

import java.util.Random;

public class WageForMonth {
    static void MonthWage() {
        int salary = 0;
        int total = 0;
        int fullHr = 16;
        int partHr = 8;
        int wage = 20;
        int days = 20;
        Random rand = new Random();
        int x = rand.nextInt(3);
        if (x == 2) {
            System.out.println("Employee is Present Full Time");
            salary = (wage * fullHr);
            total = (salary * days);
            System.out.println("Salary of Month is: " + total);
        } else if (x == 1) {
            System.out.println("Employee is Present Part Time ");
            salary = (wage * partHr);
            total = (salary * days);
            System.out.println("Salary of Month is:" + total);
        } else
            System.out.println("Employee is Absent ");
    }

    public static void main(String [] args){
        System.out.println("Calculating Wage For Month :");
        System.out.println();
        MonthWage();
    }
}
