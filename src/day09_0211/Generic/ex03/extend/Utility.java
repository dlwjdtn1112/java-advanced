package day09_0211.Generic.ex03.extend;

public class Utility {
    public static <T> void printArray(T[] array){
        for(T element : array) System.out.println(element);


    }

    public static void main(String[] args) {
        String[] strArray = {"Hello","Java"};

        Utility.printArray(strArray);
        System.out.println("===========");
        Integer[] intArray   = {1,2,3,4,5};

        Utility.printArray(intArray);
    }
}
