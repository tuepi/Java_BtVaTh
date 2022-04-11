package ke_thua.triange;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập màu muốn vẽ: ");
        String color = scanner.nextLine();
        System.out.println("Nhập độ dài 3 cạnh của tam giác.");
        System.out.print("Cạnh thứ nhất: ");
        double s1 = scanner.nextDouble();
        System.out.print("Cạnh thứ hai: ");
        double s2 = scanner.nextDouble();
        System.out.print("Cạnh thứ ba: ");
        double s3 = scanner.nextDouble();


        if (s1 + s2 > s3 && s2 + s3 > s1 && s1 + s3 > s2){
            Triangle t = new Triangle(color, true, s1, s2, s3);
            System.out.println(t);
        } else {
            System.out.println("Ba cạnh vừa nhập không phải ba cạnh của một tam giác.");
        }

    }
}
