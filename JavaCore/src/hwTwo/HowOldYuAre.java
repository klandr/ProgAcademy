package hwTwo;

import java.time.Year;
import java.util.Scanner;

public class HowOldYuAre {
    public static void main(String[] args) {
        int myYear;
        int currentYear = Year.now().getValue();
        int result;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your year of birth ( 0 if exit )");
            myYear = sc.nextInt();
            System.out.println("Current year is " + currentYear);

            if (myYear == 0)
                break;

            result = currentYear - myYear;
            System.out.println("You are " + result + " years an old");
        }
    }
}
