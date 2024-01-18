import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputDbl = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        int year, hours;
        double salary;
        String name;

        System.out.print("Enter year:");
        year = inputInt.nextInt();
        System.out.print("Enter hour:");
        hours = inputInt.nextInt();
        System.out.print("Enter salary:");
        salary = inputDbl.nextDouble();
        System.out.print("Enter name:");
        name = inputStr.nextLine();

        Employee emp1 = new Employee(year, hours, salary, name);
        emp1.toString(emp1);

    }

}
