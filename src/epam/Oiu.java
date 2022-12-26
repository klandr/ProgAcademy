package epam;

public class Oiu {

    public static void main(String[] args) {
        int num =9;
        boolean divideBy7 = false;
        while (!divideBy7){
            System.out.println(num);
            if (num%7==0)
                divideBy7 = true;
            --num;
        }
    }
}
