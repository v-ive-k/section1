package section1;
import java.util.Scanner;
public class Exe3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
	}

}
