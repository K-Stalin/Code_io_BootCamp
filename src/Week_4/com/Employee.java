package Week_4.com;

public class Employee {
    void getBonus()
    {
        System.out.println("Get Bonus from Employee Class");
    }
}

class Manager extends  Employee{
    @Override
    void getBonus()
    {
        System.out.println("Get Bonus from Manager Class");
    }
}

class Developer extends  Employee{
    @Override
    void getBonus()
    {
        System.out.println("Get Bonus from Developer Class");
    }
}

class EmpMain{
    public static void main(String[] args) {
         Employee employee;

         employee = new Manager();
         employee.getBonus();

         employee = new Developer();
         employee.getBonus();
    }
}