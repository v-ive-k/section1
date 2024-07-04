package section1;
import java.util.*;
import java.io.*;
public class LinkedLi1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<String> vivek = new LinkedList<>();
		vivek.add("vivek");
		vivek.addFirst("first");
		vivek.addLast("last");
		System.out.println("choose a position to add string 'add' in the list");
		int num = sc.nextInt();
		vivek.add(num,"add");		
		System.out.println(vivek.contains("vivek"));
		vivek.remove("vivek");
		vivek.remove(0);
		System.out.println(vivek);
	}

}
