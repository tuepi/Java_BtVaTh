package Vonglap;

public class HT20SNT {
    public static void main(String[] args){

        int dem = 1;
        int num = 2;
        while (dem <= 20){
            String str = "snt";
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    str = "không phải";
                    break;
                }
            }
            if (str.equals("snt")) {
                System.out.println(num);
                dem++;
            }
            num++;
        }

    }
}
