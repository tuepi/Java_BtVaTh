package demo;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,10};
        for (int i = 2; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
//        System.out.println("Xóa Phần tử thứ 3 và thêm 30 vào cuối:");
//        int[] newArr = new int[5];
//        for (int j = 0; j < 3; j++) {
//            newArr[j] = arr[j];
//        }
//        for (int z = 3; z < arr.length - 1; z++) {
//            newArr[z] = arr[z + 1];
//        }
//        newArr[newArr.length - 1] = 30;
//        for (int i : newArr) {
//            System.out.println(newArr[i]);
//        }
    }
}
