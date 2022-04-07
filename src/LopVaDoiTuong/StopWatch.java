package LopVaDoiTuong;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {

    private long startTime, endTime;
    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public void setStart() {
        this.startTime = System.currentTimeMillis();
    }
    public void setStop() {
        this.endTime = System.currentTimeMillis();
    }
     public long getElapsedTime() {
        return this.endTime - this.startTime;
     }

    public static void main(String[] args) {
       StopWatch stopWatch = new StopWatch();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập S để bắt đầu: ");
//        String choice = scanner.nextLine();
//        if (choice == "s") {
//            System.out.println("hello");
//        }
        stopWatch.setStart();
        System.out.println(stopWatch.getStartTime());
        stopWatch.setStop();
        System.out.println(stopWatch.getEndTime());
        System.out.println("Thời gian đã trôi qua là: " + stopWatch.getElapsedTime() + " mili giây.");



    }


}
