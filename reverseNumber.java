package Day2PracticeProblem;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("reverse number");
        int num = 123;
        int temp = 0;
        int reminder;
        while (num != 0) {
            reminder = num % 10;
            temp = temp * 10 + reminder;
            num = num /10;
        }
        System.out.println(temp);
    }
}
