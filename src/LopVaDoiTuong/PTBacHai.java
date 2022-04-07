package LopVaDoiTuong;

import java.util.Scanner;

public class PTBacHai {

    private double a,b,c;
    public PTBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public PTBacHai(){
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot() {
        return - this.b / (2 * this.a);
    }

    public double getRoot1() {
            return (- this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }
    public double getRoot2() {
            return (- this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }
    public String noRoot() {
        return "Phương trình vô nghiệm.";
    }


}
