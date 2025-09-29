package Week_4.com;

public class Person {
    String name;
    int age;
    Person(String name,int age)
    {
        this.name = name;
        this.age  = age;
    }

}

class Student extends  Person{
    int sslc_mark;
    char grade;

    Student(int sslc_mark,char grade,int age,String name)
    {
        super(name,age);
        this.sslc_mark = sslc_mark;
        this.grade=grade;
    }

    void  showStudentDetails()
    {
        System.out.println("Student Name: "+name);
        System.out.println("Student SSLC_Mark: "+sslc_mark);
        System.out.println("Student Grade: "+grade);
        System.out.println("Student age: "+age);
    }
}

class  GraduateStudent extends  Student{
    String finalYearProjectName;
    double overall_cgpa;

    GraduateStudent(int sslc_mark,int age,String finalYearProjectName ,double overall_cgpa,char grade,String name)
    {
        super(sslc_mark,grade,age,name);
        this.finalYearProjectName =finalYearProjectName;
        this.overall_cgpa =overall_cgpa;
    }

    void showGraduateStudentDetails()
    {
        System.out.println("GraduateStudent Name: "+name);
        System.out.println("GraduateStudent SSLC_Mark: "+sslc_mark);
        System.out.println("GraduateStudent Grade: "+grade);
        System.out.println("GraduateStudent age: "+age);
        System.out.println("GraduateStudent finalYearProjectName: "+finalYearProjectName);
        System.out.println("GraduateStudent overall_cgpa: "+overall_cgpa);
    }
}

class PersonMain{
    public static void main(String[] args) {

        Student student = new Student(499,'A',18,"STALIN");
        student.showStudentDetails();

        System.out.println("-------------------------------------------------------------------");
        GraduateStudent graduateStudent = new GraduateStudent(499,21,"GITHUB Cloud Version",8.2,'A',"VOLLEY_FELLOW");
        graduateStudent.showGraduateStudentDetails();

    }
}