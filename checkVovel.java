package Day2PracticeProblem;

import java.util.Scanner;

public class checkVovel {
    private static char c;

    public static void main(String[] args) {
        System.out.println("enter anny corrector");
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);

        boolean isVowel = false;
        switch (name) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;
        }
        if (isVowel == true) {
            System.out.println(name + " is  a Vowel");
        } else {
            if ((name >= 'a' && name <= 'z') || (name >= 'A' && name <= 'Z'))
                System.out.println(name + " is a Consonant");
            else
                System.out.println("Input is not an alphabet");
        }
    }
}





