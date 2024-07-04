package section1;
import java.util.Scanner;

public class Exe11 {

	static int mymethod(int num,int num1) {
		int res = num+num1;
		return res;
	}
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the numbers to add");
    int num = sc.nextInt();
    		int num1 = sc.nextInt();
		
		System.out.print(mymethod(num,num1));
	}

	
}
