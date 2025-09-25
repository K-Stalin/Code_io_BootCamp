package Week_3.com;

public class Employee {
    private  int id;
    private  String name;
    private  int salary;

    void setId(int id)
    {
        this.id = id;
    }
    void setName(String name)
    {
        this.name = name;
    }
    void setSalary(int salary)
    {
        this.salary = salary;
    }
    void getId()
    {
        System.out.println("Id: "+this.id);
    }
    void getName()
    {
        System.out.println("Name: "+this.name);
    }
    void getSalary()
    {
        System.out.println("Salary: "+this.salary);
    }

}
