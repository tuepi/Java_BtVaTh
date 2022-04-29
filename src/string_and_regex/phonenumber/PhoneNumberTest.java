package string_and_regex.phonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberTest {


    static boolean validate(PhoneNumberValid phoneNumberValid, String string){
        Pattern pattern = Pattern.compile(phoneNumberValid.getRegex());
        Matcher matcher = pattern.matcher(string);

        if (!matcher.matches()){
            System.out.println(phoneNumberValid.getMessage());
        } else {
            System.out.println("Đúng");
        }
        return matcher.matches();
    }

}
class Test{
    public static void main(String[] args) {
        PhoneNumberTest phoneNumberTest = new PhoneNumberTest();
        final String PHONE_NUMBER_REGEX = "84+\\d{9}";
        final String NOT_VALID_CLASS_NAME_MESSAGE = "Nhập chưa đúng định dạng!!!";

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (check == false){
            System.out.println("Nhập vào SĐT dạng (84)-(xxxxxxxxx) : ");
            String phoneNumber = sc.nextLine();
            PhoneNumberValid phoneNumberValid = new PhoneNumberValid(PHONE_NUMBER_REGEX, NOT_VALID_CLASS_NAME_MESSAGE);
            check = phoneNumberTest.validate(phoneNumberValid,phoneNumber);
        }

    }
}
