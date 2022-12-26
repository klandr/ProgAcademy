package epam;

public class Yui {
    public static void main(String[] args) {
        boolean kepGoing = true;
        int result =15, i=10;
        do{
            i--;
            if (i==8)kepGoing=false;
            result -=2;
        }while (kepGoing);
        System.out.println(result);
    }
}
