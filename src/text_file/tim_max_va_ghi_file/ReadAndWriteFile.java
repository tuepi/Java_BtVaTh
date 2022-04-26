package text_file.tim_max_va_ghi_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        }catch (Exception e){
            System.out.println("Không tồn tại file hoặc nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) throws IOException {
        FileWriter fr = new FileWriter(filePath, true);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("Giá trị Max là: "  + max + "\n");
        bw.close();
    }
}
