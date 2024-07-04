package section1;
import java.util.*;
import java.io.*;
public class HashSe {
	public static void main(String[] args) {
		HashSet<Integer> vivek = new HashSet<>();
		vivek.add(1);
		vivek.add(2);
		vivek.add(1);
		//System.out.println(vivek); 
		vivek.remove(1);
		//System.out.println(vivek);
		for(int item:vivek) {
			System.out.println(item);
			
		}
	}

}
