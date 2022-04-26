package text_file.copy_file;

import java.io.*;

public class CopyFile {
    public static void copyFile(String filePath1, String filePath2) throws IOException {
        File file = new File(filePath1);
        File file1 = new File(filePath2);
        if (!file.exists() || !file1.exists()){
            throw new FileNotFoundException();
        }

        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file1);
        int a;
        int count = 0;
        while ((a = fr.read()) != -1){
            fw.write((char)a);
            count++;
        }
        fw.close();
        System.out.println("Số ký tự là: " + count);
    }

    public static void main(String[] args) throws IOException {
        copyFile("src\\text_file\\copy_file\\filenguon.txt", "src\\text_file\\copy_file\\filedich.txt");
    }
}
