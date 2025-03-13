package Problem1;

public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 57, "M");
        System.out.println(bob);

        Student laura = new Student("Laura", 25, "F", "HS95129", 4);
        System.out.println(laura);

        Teacher msSmith = new Teacher ("Ms. Smith", 45, "F", "Computer Science", 55000);
        System.out.println(msSmith);

        CollegeStudent caley = new CollegeStudent("Caley", 27, "F", "HS95129", 3.5, "English", 2);
        System.out.println(caley);

    }
}
