package Task2;


import java.util.Scanner;

public class WordGuessGame {
    public static void main(String[] args) {
        String s = "SHAMBHO";
        s = s.toUpperCase();
        startGame(new StringBuilder(s));
    }

    static void startGame(StringBuilder s) {
        Scanner sc = new Scanner(System.in);

        int chances = 0;
        StringBuilder word = new StringBuilder(s);
        boolean[] check = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!(ch == 'A' || ch == 'E' ||
                    ch == 'I' || ch == 'O' ||
                    ch == 'U')) {

                s.setCharAt(i, '_');
                chances++;
            } else {
                check[i] = true;
            }
        }
        chances += 3;

        while (chances != 0) {
            System.out.println("Word : " + s.toString() + "\n" + "Chances : " + chances
                    + "\n" + "Guess : ");
            char ch = sc.next().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            } else if (!(ch >= 'A' && ch <= 'Z')) {
                System.out.println("Please enter valid key");
                continue;
            }
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if ((!check[i]) && word.charAt(i) == ch) {
                    s.setCharAt(i, ch);
                    check[i] = true;
                    count++;

                }
            }

            if (word.toString().equals(s.toString())) {
                System.out.println("Word is : " + s.toString());
                System.out.println("You win the game!");
                break;
            }

            if (count != 0) {
                System.out.println("Character Found " + count + " time(s)!\n");
            } else {
                System.out.println("Oh! Character not found\n");
            }
            chances--;
        }

        if (!(word.toString().equals(s.toString()))) {
            System.out.println("Word is : " + word.toString());
            System.out.println("You lost the game!");
        }
    }
}
