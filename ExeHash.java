package section1;
import java.util.*;
import java.io.*;
public class ExeHash {
	public static void main(String[] args) {
		HashSet<Integer> vivek = new HashSet<>();
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int num = sc.nextInt();
			
			if(vivek.add(num)); {
				System.out.println("succesfully added");
			}
		}
		System.out.println(vivek);
	}
}
