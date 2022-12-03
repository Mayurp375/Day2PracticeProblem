package Day2PracticeProblem;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("Enter any number between 0 to 5 " +
                "I will tell you spelling");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("this is zero");
        } else if (number == 1) {
            System.out.println("this is one");
        } else if (number == 2) {
            System.out.println("this is two");
        } else if (number == 3) {
            System.out.println("this is three");
        } else if (number == 4) {
            System.out.println("this is four");
        }else if (number == 5) {
            System.out.println("this is five");
        }else {
            System.out.println("Please enter between 0 to 5");
        }
    }
}
