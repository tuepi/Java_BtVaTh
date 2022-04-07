package LopVaDoiTuong;

import java.util.Date;

public class StopWatch {

    private double startTime, endTime;
    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch() {
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }





    public static void main(String[] args) {
        String nowTime = String.valueOf(new Date());
        System.out.println(nowTime);
    }

}
