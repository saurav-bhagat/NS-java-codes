import first.Actor;
import first.Person;
import first.Teacher;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("teacherT1", 23, "DPS", "101", "Maths");

        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getSchoolName());
        System.out.println(t1.getSubject());
        t1.speak();

        System.out.println("==============================================");

        Actor a1 = new Actor("srk", 50,"everything", 100);
        System.out.println(a1.getName());
        System.out.println(a1.getAge());
        System.out.println(a1.getGenre());
        System.out.println(a1.getFilmCounts());
        a1.speak();

    }
}
