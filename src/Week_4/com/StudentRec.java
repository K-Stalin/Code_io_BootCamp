package Week_4.com;

public class StudentRec {
    int rollNo,marks;
    String name;

    StudentRec(int rollNo,int marks,String name)
    {
        this.rollNo =rollNo;
        this.marks = marks;
        this.name = name;
    }

    StudentRec(StudentRec other)
    {
        this.rollNo = other.rollNo;
        this.marks  = other.marks;
        this.name   = other.name;
    }

}
class  StudentRecMain{
    public static void main(String[] args) {
        StudentRec studentRec = new StudentRec(11,100,"VOLLEY_FELLOW");
        StudentRec studentRec1 = new StudentRec(studentRec);

        studentRec.rollNo = 9;
        System.out.println(studentRec.rollNo);
        System.out.println(studentRec1.rollNo);


    }
}
