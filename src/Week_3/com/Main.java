package Week_3.com;

public class Main {
    public static void main(String[] args) {

//    1}
        BankAccount  bankAcc = new BankAccount(1000);
        bankAcc.printBalance();
        bankAcc.deposit(1000);
        bankAcc.printBalance();
        bankAcc.withdraw(0);
//    2}
        Book book1 = new Book();
        book1.printBookDetials();
        Book book2 = new Book("Buffet","Intelligent",1000);
        book2.printBookDetials();
//    3}
        Employee employee = new Employee();
        employee.setId(1);
        employee.getId();
//    4}
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.calcArea();
        rectangle.calcPerimeter();
//    5}
        Student student = new Student("Stalin",5,100);
        student.printStudentDetail();


    }
}
