package employeewage;


import java.util.Random;

public class EmployeePresentOrAbsent {
    public void check() {

        Random random = new Random();
        int rand = random.nextInt(2);
        if (rand == 1) {
            System.out.println(" Employee is Present  ");
        } else {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args) {
        EmployeePresentOrAbsent obj =new EmployeePresentOrAbsent();
        obj.check();
    }
}