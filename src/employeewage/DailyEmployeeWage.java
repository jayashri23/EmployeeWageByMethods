package employeewage;

import java.util.Random;

public class DailyEmployeeWage {

    static void Daily() {

        int hr = 8, wage = 20, salary = 0;
        Random rand = new Random();
        int x = rand.nextInt(2);
        if (x == 1) {
            System.out.println("Employee is present");
            salary = (hr * wage);
            System.out.println("" + salary);
        } else
            System.out.println("Employee is absent");
    }
    public static void main(String [] args){
        Daily();
    }
}
