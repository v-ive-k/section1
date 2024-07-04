package section1;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		int arr[][] = {{1,1,1},{2,2,2},{3,3,3}} ;
		Scanner sc = new Scanner(System.in);
		
		for(int m=0;m<3;m++) {
			for(int n=0;n<3;n++) {
				System.out.print(arr[m][n]+ " ");
			}
			System.out.println();
		}

	}

}
