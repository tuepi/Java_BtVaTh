package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String[] list = {"1", "abc"};
        try  {
            FileReader fw = new FileReader("C:\\Users\\hongh\\IdeaProjects\\first_project_JV\\src\\demo\\test.txt");
            BufferedReader rd = new BufferedReader(fw);
            String s = "";
            while ((s = rd.readLine()) != null) {
                System.out.println(s);
            }
            System.out.println(s);
            rd.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
