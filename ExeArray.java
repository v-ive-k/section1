package section1;
import java.util.Scanner;
public class ExeArray {
	public static void main(String[] args) {
//		int arr[] = {3,5,8,12,45};
//		System.out.print("choose a position to replace: ");
//		Scanner vivek = new Scanner(System.in);
//		int num1 = vivek.nextInt();
//		System.out.print("choose a value to replace: ");
//		int num2 = vivek.nextInt();
//		for (int i=0;i<5;i++) {
//			if(num1 == i ) {
//				arr[i] = num2;
//			}
//			
//			
//		}
//		for(int j=0;j<5;j++) {
//		System.out.println(arr[j]);
//		
//	}
		
		int arr[] = {12,12,34,45,34};
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == arr[i-1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
