package JavaLesson5;

public class TestStaticMenthod {
    public static void main(String[] args) {
        Student student1 = new Student(111,"Hoang");

        student1.display();
        Student.change();
        student1.display();
    }
}
