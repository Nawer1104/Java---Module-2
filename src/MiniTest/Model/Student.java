package MiniTest.Model;

import java.io.Serializable;

public class Student extends Human implements Serializable {
    private static final long serialVersionUID = 4369154351438944069L;

    private int avg;


    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int avg) {
        super(name, age);
        this.avg = avg;
    }


    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" + "name= " + this.getName() + " ," + "age= " + this.getAge() + " ," +
                "avg= " + this.getAvg() +
                '}';
    }
}
