package Day2PracticeProblem;

import java.util.Scanner;

public class displayUnit {
    public static void main(String[] args) {
        System.out.println("Enter number multiple of 1." +
                "ie. 1,10,100..etc");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            if (number == 0) {
                System.out.println("this is zero");
            } else if (number == 10) {
                System.out.println("this is ten");
            } else if (number == 100) {
                System.out.println("this is hundred");
            } else if (number == 1000) {
                System.out.println("this is thousand or ten Hundred");
            } else if (number == 10000) {
                System.out.println("this is ten Thousand");
            } else if (number == 100000) {
                System.out.println("this is lack");
            } else {
                System.out.println("Please enter between multiple of 10");
            }
        } else {
            System.out.println("Invalid");
        }
    }
}
