package Day2PracticeProblem;

import java.util.Scanner;

public class prorgramWithWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value i will tell u sum of the there natural number");
        int num = sc.nextInt();
        //input N=5 output 1+2+3+4+5
        int i = 0, sum = 0;
        //while loop
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.print(sum + ": is sum of the there natural number");
    }
}
