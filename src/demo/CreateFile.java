package demo;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\demo\\t.txt");
        if (file.exists()){
            System.out.println("Đã tồn tại file.");
        } else {
            file.createNewFile();
        }
        System.out.println(file.getAbsolutePath());
    }
}
