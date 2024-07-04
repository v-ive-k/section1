package section1;
import java.util.*;
import java.io.*;

class vehicle{
	public int dis(int num1,int num2) {
		int add = num1+num2;
		return add;
	}
}

class cars extends vehicle{
	public int disp(int num1,int num2) {
		int add = num1-num2;
		return add;
	}
}

public class Inheritance{
	public static void main(String[] args) {
		System.out.print("enter the 2 numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		cars a = new cars();
		if(num1>num2) {
			System.out.println(num1 + "is greatre than"+ num2 + "the addition is" + a.dis(num1,num2));

		}
		if(num1<num2) {
			System.out.println(num1 + "is less than"+ num2 + "the subtraction is" + a.disp(num1,num2));

		}
	}
}