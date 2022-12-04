package Day2PracticeProblem;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {


        System.out.println("enter anny number of Month");
        Scanner sc = new Scanner(System.in);
        int name = sc.nextInt();

        switch (name) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jully");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

        }
        if (name >= 1 && name <= 12) {
        } else {
            System.out.println("ther are only 12 months");

        }
    }
}
