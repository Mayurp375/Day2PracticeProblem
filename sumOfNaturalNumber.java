package Day2PracticeProblem;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        //using for loop
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
