package Day2PracticeProblem;

public class palindrom {
    public static void main(String[] args) {
        int num = 121;
        int temp = 0;
        int reminder;
        int originalNum = num;
        //using recursion
        for (; num != 0; ) {
            reminder = num % 10;
            temp = temp * 10 + reminder;
            num = num / 10;
        }

        System.out.println(temp);

        if (temp == originalNum) {
            System.out.println(temp + " is pallindrom");
        } else {
            System.out.println(temp + " is not pallindrom");
        }
    }
}
