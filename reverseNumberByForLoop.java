package Day2PracticeProblem;

public class reverseNumberByForLoop {
    public static void main(String[] args) {
        int num = 123;
        int temp = 0;
        int reminder;

        //using recursion
        for (;num !=0 ;) {
            reminder = num % 10;
            temp = temp * 10 + reminder;
            num = num /10;
        }
        System.out.println(temp);
    }
}
