package genericsAndCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List <String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        System.out.println(myList);
        myList.add(1,"Java");
        myList.add("Best");
        System.out.println(myList);
        String temp = myList.get(0);
        System.out.println(temp);

        Collections.sort(myList);
        System.out.println(myList);
        System.out.println();

        for (String element : myList){
            System.out.println(element);
        }
        System.out.println();

        Iterator<String> itr = myList.iterator();
        for (;;){
            if (!itr.hasNext()){
                break;
            }
            String element = itr.next();
            System.out.println(element);
        }
    }
}
