public class PhoneNumbersExampleTest {
    public static final String[] phoneNumbers = {"(12)-(0123456789)", "(99)-(0987654321)", "(34)-(0345678901)","(12)-0123456789", "12-(0123456789)", "(12)-(1234567890)", "(12)-(012345678)", "(1a)-(0123456789)"};

    public static void main(String[] args) {
        PhoneNumbersExample phoneNumbersExample = new PhoneNumbersExample();
        for (String phoneNumbers : phoneNumbers) {
            boolean isValid = phoneNumbersExample.validate(phoneNumbers);
            System.out.println("Phone numbers: " + phoneNumbers + " is " + (isValid?"valid":"invalid"));
        }
    }
}
