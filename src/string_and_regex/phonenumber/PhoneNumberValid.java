package string_and_regex.phonenumber;

public class PhoneNumberValid {
    private String regex;
    private String message;

    public PhoneNumberValid() {
    }

    public PhoneNumberValid(String regex, String message) {
        this.regex = regex;
        this.message = message;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
