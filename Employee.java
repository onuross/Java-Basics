public class Employee {
    private String name;
    private double salary;
    private int workHours, hireYear;

    Employee(int hireYear, int workHours, double salary, String name) {
        this.hireYear = hireYear;
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0.0;

    }

    public double bonus() {
        int normalHours = 40;
        int bonusPerHour = 30;
        int extraHours = this.workHours - normalHours;
        if(extraHours > 0){
            return extraHours * bonusPerHour;
        }else {
            return 0;
        }
    }
    public double increase(){
        int year = 2020 - hireYear;
        if ((0 < year) && (year < 10)){
            return this.salary * 0.05;
        }else if((10 <= year) && (year < 20)){
            return this.salary * 0.1;
        }else {
            return this.salary * 0.15;
        }
    }
    public void toString(Employee emp){
        System.out.println("Name:" + name);
        System.out.println("Tax:" + emp.tax());
        System.out.println("Bonus:" + emp.bonus());
        System.out.println("Increase:" + emp.increase());
        salary += (emp.bonus() + emp.increase()) - emp.tax();
        System.out.println("New Salary:" + salary);
    }
}