package Vonglap;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        int num = 2;
        while (num  <= 100) {
            String str = "snt";
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    str = "khongphai";
                    break;
                }
            }
            if (str.equals("snt")) {
                System.out.println(num);
            }
            num++;
        }
    }
}
