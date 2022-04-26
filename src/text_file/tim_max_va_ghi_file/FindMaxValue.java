package text_file.tim_max_va_ghi_file;

import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\text_file\\tim_max_va_ghi_file\\numbers.txt");
        int max =findMax(numbers);
        readAndWriteFile.writeFile("src\\text_file\\tim_max_va_ghi_file\\result.txt", max);
        System.out.println("Đã ghi");
    }
}
