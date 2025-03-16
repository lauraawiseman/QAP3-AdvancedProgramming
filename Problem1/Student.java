package Problem1;
public class Student extends Person {
    // Attributes
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

    // Constructors
    public Student(String name, int age, String gender, String idNum, double gpa)  {
    // use the super class’ constructor
    super(name, age, gender);
    // initialize what’s new to Student
    myIdNum = idNum;
    myGPA = gpa;
    } 

    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    public String toString(){
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }

};