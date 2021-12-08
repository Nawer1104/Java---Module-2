package MiniTest.Model;

import java.io.Serializable;

public class Teacher extends Human implements Serializable {
    private static final long serialVersionUID = 4369154351438944069L;

    private int salary;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "salary=" + salary +
                '}';
    }
}
