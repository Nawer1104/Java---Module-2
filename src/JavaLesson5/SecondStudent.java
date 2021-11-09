package JavaLesson5;

public class SecondStudent {
    private String name = "John";
    private String classes = "C02";

    public SecondStudent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "SecondStudent{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        SecondStudent student = new SecondStudent();
        student.setName("Bob");
        student.setClasses("C21");
        System.out.println(student.toString());
    }
}
