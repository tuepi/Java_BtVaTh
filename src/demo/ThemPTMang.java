package demo;

public class ThemPTMang {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,10};
        int[] newArr = new int[6];
        System.out.println("Thêm 15 vào cuối mảng.");
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[5] = 15;
        for (int j = 0; j < newArr.length; j++) {
            System.out.println(newArr[j]);
        }
        System.out.println("Thêm 20 vào vị trí 2");
        int[] newwArr = new int[7];
        for (int i = 0; i < 2; i++) {
            newwArr[i] = newArr[i];
        }
        newwArr[2] = 20;
        for (int j = 3; j < newwArr.length; j++) {
            newwArr[j] = newArr[j - 1];
        }
        for (int z = 0; z < newwArr.length; z++) {
            System.out.println(newwArr[z]);
        }

    }
}
