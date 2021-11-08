package JavaLesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StopWatch {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();

        timeWatch check = new timeWatch(start);

        check.setStartTimes();

        StopWatch.setArr();

        check.setEndTimes();
        System.out.println(check.getElapsedTime());

    }

    public static void setArr() {
        long[] newArr = new long[10000];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = Math.round(Math.random()*100000+1);
        }
        Arrays.sort(newArr);
    }
}

class timeWatch {
    private double startTime;
    private double endTime;

    public timeWatch(double start){
        this.startTime = start;
    }

    public void setStartTimes() {
        this.startTime = System.currentTimeMillis();
    }

    public void setEndTimes() {
        this.endTime = System.currentTimeMillis();
    }

    public double  getElapsedTime() {
        double time = this.endTime - this.startTime;
        return time;
    }
}
