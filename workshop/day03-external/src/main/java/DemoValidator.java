import org.apache.commons.validator.routines.EmailValidator;

public class DemoValidator {

    public static void main(String[] args) {
        String email = "somkiat@gmail.com";
        boolean result = EmailValidator.getInstance()
                                       .isValid(email);
        System.out.println(result);
    }

}
