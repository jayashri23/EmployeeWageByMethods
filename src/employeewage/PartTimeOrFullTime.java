package employeewage;
import java.util.Random;
public class PartTimeOrFullTime {
    public int PartTime() {

        int salary , fullHr = 16, partHr = 8, wage = 20;
        Random rand = new Random();
        int x = rand.nextInt(3);

        if (x == 2) {
            System.out.println("Employee is present full time and salary:");
            salary = (fullHr * wage);
            return salary;
        } else if (x == 1) {
            System.out.println("Employee is part time present and salary:");
            salary = (partHr * wage);
            return salary;
        } else {
            System.out.println("Employee is absent and salary  is 0");
            return 0;
        }
    }
        public static void main (String [] args) {
            PartTimeOrFullTime Obj = new PartTimeOrFullTime();
            int result = Obj.PartTime();
            System.out.println(result);
        }
    }

