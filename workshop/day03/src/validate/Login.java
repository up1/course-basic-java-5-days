package validate;

public class Login {

    boolean process(String email, String password) {
        // 1. Validate input
        if(isEmpty(email)) {
            if(isEmpty(password)) {
                // 2. Login process
            }
        }

        // 1. Validate input
        if(email == null || email.trim().length() == 0) {
            // Failure
            return false;
        }
        if(password == null || password.trim().length() == 0) {
            // Failure
            return false;
        }

        // 2. Login process



        // 3. Create and return result

        return false;
    }

    private boolean isEmpty(String email) {
        return email != null && email.trim().length() > 0;
    }

}
