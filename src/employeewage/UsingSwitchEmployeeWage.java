package employeewage;

import java.util.Random;

public class UsingSwitchEmployeeWage {

    public void Wage(){

    int salary = 0, fullhr = 16, parthr = 8, wage = 20;
    Random rand = new Random();
    int x = rand.nextInt(3);
        switch(x)
    {
        case 2:
            System.out.println("Employee full time present");
            salary = (fullhr * wage);
            System.out.println("Salary = " +salary);
            System.out.println(".....................");
            break;
        case 1:
            System.out.println("Employee part time present");
            salary = (parthr * wage);
            System.out.println("Salary = " +salary);
            System.out.println("......................");
            break;
        default:
            System.out.println("Employee is absent");
            System.out.println(".....................");
         }
    }
    public static void main(String []args){
        System.out.println("Calculating Employee Wage ");
        System.out.println("........................\n");
        UsingSwitchEmployeeWage Obj =new UsingSwitchEmployeeWage();
        Obj.Wage();
    }
}

