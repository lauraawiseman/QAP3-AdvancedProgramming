package Problem1;
public class CollegeStudent extends Student{
    // Attributes
    private String major;
    private int year;

    // Constructor
    public CollegeStudent (String name, int age, String gender, String myIdNum, double myGPA, String major, int year){
        super(name, age, gender, myIdNum, myGPA);
        this.major = major;
        this.year = year;
    }

    // Getters and setters
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString
    public String toString(){
        return super.toString() + ", Major: " + major  + ", Year: " + year;
    }
    }

