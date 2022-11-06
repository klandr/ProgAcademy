package hwSix;

import java.util.Scanner;

public class CountSymbol {
    public static void main(String[] args) {
        String myText;
        char myLetter = 'b';
        int findSymbol = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write some word. I count how many there is letters " + myLetter);
        myText = scanner.nextLine();
        char[] symbols = myText.toCharArray();
        for (int i = 0; i <= symbols.length - 1; i++) {
            if (symbols[i] == myLetter) {
                findSymbol = findSymbol + 1;
            }
        }
        System.out.println("in this word there is " + myLetter + " " + findSymbol + " times");
    }
}
