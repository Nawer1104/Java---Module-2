package PracticeAll;

public class Student extends Human {
    private int id;
    private int averageScore;
    private static int idNumber = 1;

    public Student(String name, int age, int averageScore) {
        super(name, age);
        this.averageScore = averageScore;
        this.id = idNumber++;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student have " + super.toString() +
                ", id:" + id +
                ", averageScore is: " + averageScore
                ;
    }
}
