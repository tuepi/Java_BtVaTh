package text_file.su_dung_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\text_file\\bai_tap_scanner_giai_nghiem_bac_nhat\\inp.txt");
            System.out.println((char) fr.read());
    }
}
