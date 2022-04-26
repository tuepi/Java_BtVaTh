package text_file.tinh_tong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public static void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng là: " + sum);


        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("lỗi");
        }
    }

    public static void main(String[] args) {
        readFileText("C:\\Users\\hongh\\IdeaProjects\\first_project_JV\\src\\text_file\\demo\\testfile.txt");
    }
}
