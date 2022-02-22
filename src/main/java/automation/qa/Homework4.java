package automation.qa;

import java.util.Scanner;

public class Homework4 {
    static int[] myArray = new int[20];

    public static void main(String[] args) {
        fillArray();
        averageValueOfMyArray();
    }

    //1.
    public static void fillArray() {
        System.out.println("The elements in my Array are: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 5;
            System.out.println(myArray[i]);
        }
    }

    //2.
    public static void averageValueOfMyArray() {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 5;
            sum += myArray[i];
            average = sum / myArray.length;
        }
        System.out.println("The average value is: " + average);

        //3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[7];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                evenSum = evenSum + array[i];
            } else if (array[i] % 2 != 0) {
                oddSum = oddSum + array[i];
            }
        }
        System.out.println("The sum of even numbers is " + evenSum + " and the sum of odd numbers is " + oddSum + ".");

        //4.
        System.out.println("Please enter parameter:");
        int N = scanner.nextInt();
        printNumbersParameterN(N);
        printNumbersNotDivToThreeAndSeven(N);
        printSumFibonacci(N);

    }

    public static void printNumbersParameterN(int N) {
        System.out.println("The numbers from 1 to N are: ");
        for (int i = 0; i < N; i++) {
            System.out.println(i);
        }

        }
    public static void printNumbersNotDivToThreeAndSeven ( int N){
        System.out.println("The not divisible to 3 and 7 numbers are: ");
        for (int i = 0; i < N; i++) {
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                System.out.println(i);
            }
        }

    }
    public static void printSumFibonacci (int N){
        int sum = 1;
        int first = 0;
        int second = 1;

        for (int i = 0; i < N; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;

        }
        System.out.println("The sum of Fibonacci numbers is: " + sum);
    }
}

