package automation.qa;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        System.out.println("Please enter you password");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        checkPassword(input);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        checkPositiveAndEquals(a,b,c);

        System.out.println("Enter number x:");
        double x = scanner.nextDouble();
        System.out.println("Enter number y:");
        double y = scanner.nextDouble();
        averageValue(x,y);
        sumNumbers(x,y);

    }
    //1.Method for check of string for password - min.8 symbols, letters, digits, and symbol
        public static void checkPassword (String passWord){
            if (!(passWord.length() >= 8 && passWord.matches(".*[0-9].*") && passWord.matches(".*[!@#$%^&*].*")
                    && passWord.matches(".*[a-z].*") && passWord.matches(".*[A-Z].*"))) {
                System.out.println("The system doesn't accept the password.");
            } else
            System.out.println("The system accept the password.");
        }
        //2. Method for check 3 numbers are positive and equal
        public static void checkPositiveAndEquals(int a, int b, int c){
            if (a>0){
                System.out.println("The first number is positive.");
            }else{
                System.out.println("The first number is negative");
            }
            if (b>0){
                System.out.println("The second number is positive.");
            }else{
                System.out.println("The second number is negative");
            }
            if (c>0){
                System.out.println("The third number is positive.");
            }else{
                System.out.println("The third number is negative.");
            }
            if(a==b && b==c) {
                System.out.println("All numbers are equal.");
            }else if (a==b || b==c || a==c){
                System.out.println("Some numbers are equal.");
            }else{
                System.out.println("The numbers are different.");
            }
        }
        //3.Method for average value of 2 numbers
        public static double averageValue(double x, double y){
            double result;
            result = (x+y) / 2;
            System.out.println("The average sum is: " + result);
            return result;
    }
    //4.Method for sum of 2 numbers
    public static double sumNumbers(double x, double y) {
            double result;
            result = x + y;
            System.out.println("The sum is: " + result);
            return result;
    }
    }



