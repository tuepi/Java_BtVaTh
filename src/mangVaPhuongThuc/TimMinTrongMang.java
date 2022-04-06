package mangVaPhuongThuc;

public class TimMinTrongMang {
    public static void main(String[] args) {
        int[] arr = {1,4,0,3,1,9,9,8};
        System.out.println("Phần tử Min trong mảng là : " + timMin(arr));
    }
    public static int timMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
