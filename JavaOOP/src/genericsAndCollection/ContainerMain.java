package genericsAndCollection;

public class ContainerMain {
    public static void main(String[] args) {
        Container<Integer> a = new Container<>(10);
        Container<String> b = new Container<>("Hello word");

        //a.setElement("Java");

        int number = 5 + a.getElement();
        System.out.println("Number = " + number);
        System.out.println(a);
        System.out.println(b);
        Integer[] array1 = new Integer[]{5,4,8,1};

        Integer maxElement1 = getMax(array1);
        System.out.println(maxElement1);
    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T maxElement = array[0];
        for (int i = 0; i< array.length;i++){
            if (maxElement.compareTo(array[i])<0){
                maxElement=array[i];
            }
        }
        return maxElement;
    }
}
