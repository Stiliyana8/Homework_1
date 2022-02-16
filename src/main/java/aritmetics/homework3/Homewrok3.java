package aritmetics.homework3;

import java.util.Scanner;

public class Homewrok3 {
    public static void main(String[] args) {
        //1.Determine which number is the largest.
        int firstNumber, secondNumber, thirdNumber, largest, temp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: " );
        firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.println("Please enter third number: ");
        thirdNumber = scanner.nextInt();

        temp = firstNumber > secondNumber?firstNumber:secondNumber;
        largest = thirdNumber > temp?thirdNumber:temp;

        System.out.println("The largest number is " + largest);

        //2. Rectangle perimeter and face
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.println("Please enter the length of the rectangle: ");
        int length = scanner.nextInt();

        int perimeter = (width * 2) + (length * 2);
        int area = width * length;

        System.out.println("The perimeter of the rectangle is " + perimeter + " and the area of the rectangle is " + area + ".");

        //3. Even or Odd Number
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number = scanner1.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

        //4. Day of the week
        System.out.println("Please enter day of the week from 1 to 7.");

        Scanner scanner3 = new Scanner(System.in);
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("The day of the week is Monday");
                break;
            case 2:
                System.out.println("The day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The day of the week is Friday.");
                break;
            case 6:
                System.out.println("The day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The day of the week is Sunday.");
                break;
            default:
                System.out.println("Incorrect input");
        }

    }

}
