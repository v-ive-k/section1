package section1;
import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
    	 int num=0, num1 = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        num = array[0];
       for(int j=0;j<array.length;j++) {
    	  
    	   if(array[j]<num) {
    		  num=array[j]; 
    	   }
    	   if(array[j]>num1) {
    		   num1=array[j];
    	   }
        }
       System.out.println("Lowest num in the array : "+num);
       System.out.println("The highets num in the array : "+num1);
        
        scanner.close();
    }
}
