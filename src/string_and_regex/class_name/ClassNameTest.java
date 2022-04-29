package string_and_regex.class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameTest {
    //Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
    //
    //Không chứa các ký tự đặc biệt
    //
    //Theo sau ký tự bắt đầu là 4 ký tự số
    //
    //Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    public static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIKLM]\\d$";
    public static final String NOT_VALID_CLASS_NAME_MESSAGE = "Nhập tên lớp chưa đúng định dạng!!!";
    public static final String VALID_CLASS_NAME_MESSAGE = "Nhập tên lớp thành công!!!";


    public static boolean validate(DetailValid detailValid, String string){
        Pattern pattern = Pattern.compile(detailValid.getRegex());
        Matcher matcher = pattern.matcher(string);
        if(!matcher.matches()){
            System.out.println(detailValid.getMessage());
        } else {
            System.out.println(VALID_CLASS_NAME_MESSAGE);
        }

        return matcher.matches();
    }

    public static void main(String[] args) {
        boolean check = false;
        while (check == false) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào tên lớp: ");
            String className = sc.nextLine();
            check = validate(new DetailValid(CLASS_NAME_REGEX, NOT_VALID_CLASS_NAME_MESSAGE), className);
        }

    }
}


