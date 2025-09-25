package Week_3.com;

public class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name,int rollNumber,int marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
     void  printStudentDetail()
    {
        System.out.println("Name: "+ name);
        System.out.println("RollNo: "+rollNumber);
        System.out.println("Mark: "+ marks);
    }
}
