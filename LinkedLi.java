package section1;
import java.util.*;
import java.io.*;
public class LinkedLi {
	public static void main(String[] args) {
		LinkedList<Integer> vivek = new LinkedList<>(); 
		ArrayList<String> vivek1 = new ArrayList<>(5);
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string to add");
		String num2 = sc.nextLine();
		vivek1.add(num2);
		System.out.println("enter an element to add");
		int num1 = sc.nextInt();
		vivek.add(num1);
//		vivek.add(2);
//		vivek.addLast(55);
//		vivek.addFirst(10);
		
		System.out.println("the ArrayList is "+ vivek1);
		System.out.println("the LinkedList is: "+ vivek);
	}
}
