import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersExample {
    private static final String PHONE_NUMBERS_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public PhoneNumbersExample() {
    }
    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBERS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
