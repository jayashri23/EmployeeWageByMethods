package employeewage;

public class UsingMethodEmpolyeeWage {

    static int EmployeeWage(int wage ,int workingHr ){

            int salary = wage * workingHr;
            return salary;
    }
    public static void main (String [] args){
     int emp1= EmployeeWage(20,8);
     int emp2= EmployeeWage(30 , 16);
        System.out.println("Employee Wage = " +emp1);
        System.out.println("Employee Wage = " +emp2);
    }
}
