package automation.qa;

public class Homework2 {
    public static void main(String[] args) {
        String testString = "My test string";
        String nameString = "My name string";

        String firstName = "Stiliyana";
        String lastName = "Yaneva";

        System.out.println("My name is " + firstName);

        System.out.println(testString.equals(testString + nameString));

      String [] stringArray = testString.split(" ");
        System.out.println(testString + " has " + stringArray.length + " words.");

        System.out.println("My name is " + firstName + ". This is " + testString + " and my last name is " + lastName + ".");
    }
}
