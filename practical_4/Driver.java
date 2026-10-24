package practical_4;

class PasswordChecker {
    public static String strength(String pw) {
        int count = 0;
        
        if (pw.length() >= 8) {
            count++;
            System.out.println("Length rule: Passed");
        } else {
            System.out.println("Length rule: Failed");
        }
        
        if (pw.matches(".*[A-Z].*")) {
            count++;
            System.out.println("Uppercase rule: Passed");
        } else {
            System.out.println("Uppercase rule: Failed");
        }
        
        if (pw.matches(".*[0-9].*")) {
            count++;
            System.out.println("Digit rule: Passed");
        } else {
            System.out.println("Digit rule: Failed");
        }
        
        if (pw.matches(".*[^a-zA-Z0-9].*")) {
            count++;
            System.out.println("Special character rule: Passed");
        } else {
            System.out.println("Special character rule: Failed");
        }

        if (count == 4) {
            return "Strong";
        } else if (count >= 2) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        String[] passwords = {"abc", "Abcd1234!", "hello123", "Hello123"};
        
        for (String pw : passwords) {
            System.out.println("\nPassword: " + pw);
            System.out.println("Strength: " + PasswordChecker.strength(pw));
        }
    }
}