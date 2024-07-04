package section1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {6,4,0,3,2};
        int index = 3; 
        int numberToAdd = 15; 
        
//        if (index < 0 || index > array.length) {
//            System.out.println("Invalid index");
//            return;
//        }
        
        int[] newArray = new int[array.length + 1];
        
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        
        newArray[index] = numberToAdd;
        
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        System.out.println( Arrays.toString(array));
        System.out.println( Arrays.toString(newArray));
    }
}
