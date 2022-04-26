package text_file.xoa_file;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\text_file\\xoa_file\\file_delete.txt");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("Đã tạo file " + file.getName());
        }else {
            System.out.println("Đã tồn tại");
        }
        System.out.println("Xóa file nào>>>");
        File file1 = new File("src\\text_file\\xoa_file\\file_delete.txt");
        if (file1.delete()){
            System.out.println("Đã xóa file " + file1.getName());
        } else {
            System.out.println("Không tồn tại file!");
        }

    }
}
