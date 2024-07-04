package section1;
import java.util.Scanner;
public class CoreJava {
	public static void main(String[] args) {
		System.out.println("hello");
		boolean vivek = true;
		int v = 3;
		System.out.println(vivek);
		System.out.println(!vivek);
		System.out.println(v++);
		System.out.println(++v);


		String arr[];
		arr=new String[2];
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();

		arr[0] = s1;
		arr[1] = s2;
		for(int i=0;i<=arr.length;i++) {
		System.out.println(arr[i]);

	}

}
}
