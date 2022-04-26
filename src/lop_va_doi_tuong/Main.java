package lop_va_doi_tuong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào lần lượt 3 tham số của Phương trình: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        PTBacHai ptBacHai = new PTBacHai(a,b,c);

        System.out.println("Phương trình có dạng: " + (int)a +" * x^2 + " + (int)b + " * x + " + (int)c + " = 0");
        double delta = ptBacHai.getDiscriminant();
        System.out.println("Delta = " + delta);
        if (delta > 0) {
            System.out.println("Nghiệm thứ nhất là: x = " + ptBacHai.getRoot1());
            System.out.println("Nghiệm thứ hai là: x = " + ptBacHai.getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm duy nhất: x = " + ptBacHai.getRoot());
        }
        else {
            System.out.println(ptBacHai.noRoot());
        }

    }
}
