package PracticeAll;

import java.util.*;

public class Management implements Manage {
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Student> humanArrayList = new ArrayList<>();


    public Student createStudent() {
        System.out.println("Enter Student's name");
        String name = scanner.nextLine();
        System.out.println("Enter Student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Student's average score");
        int averageScore = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(name, age, averageScore);
        return newStudent;
    }

    @Override
    public void show() {
        for (Student x : humanArrayList
             ) {
            System.out.println(x);
        }
    }

    @Override
    public void add() {
       humanArrayList.add(createStudent());
       show();
    }

    @Override
    public void search() {
        System.out.println("Enter Student's name");
        String name = scanner.nextLine();
        for (int i = 0; i < humanArrayList.size(); i++) {
            if (Objects.equals(name, humanArrayList.get(i).getName())) {
                System.out.println(humanArrayList.get(i));
            }
        }
    }

    @Override
    public void remove() {
        System.out.println("Enter Student's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < humanArrayList.size(); i++) {
            if (id == humanArrayList.get(i).getId()) {
                index = i;
            }
        }
        humanArrayList.remove(index);
        show();
    }

    @Override
    public void edit() {
        System.out.println("Enter Student's id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Student's name");
        String name = scanner.nextLine();
        System.out.println("Enter Student's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Student's average score");
        int averageScore = Integer.parseInt(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < humanArrayList.size(); i++) {
            if (id == humanArrayList.get(i).getId()) {
                humanArrayList.get(i).setName(name);
                humanArrayList.get(i).setAge(age);
                humanArrayList.get(i).setAverageScore(averageScore);
            }
        }
        show();
    }

    @Override
    public void sort() {
        Collections.sort(humanArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAverageScore() < o2.getAverageScore()) {
                    return -1;
                } else {
                    if (o1.getAverageScore() == o2.getAverageScore()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
        show();
    }

    @Override
    public int sumScoreNumber() {
        int sum = 0;
        for (int i = 0; i < humanArrayList.size(); i++) {
            sum += humanArrayList.get(i).getAverageScore();
        }
        return sum;
    }

}


