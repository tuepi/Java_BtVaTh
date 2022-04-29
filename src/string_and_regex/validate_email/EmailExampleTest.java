package string_and_regex.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invaliEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail
             ) {
            boolean isValid = emailExample.validate(email);
            System.out.println(email + " là " + isValid);
        }

        for (String email : invaliEmail
        ) {
            boolean isValid = emailExample.validate(email);
            System.out.println(email + " là " + isValid);
        }
    }
}
