//package section1;
//import java.util.ArrayList;
//
//public class ArrayL {
//	public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>(5);
//     for(int i=0;i<5;i++) {
//    	 list.add(i);
//     }
//     System.out.println(list);
//     list.remove(3);
//     System.out.println(list);
//     System.out.println(list.get(2));
//	}
//
//}

package section1;
import java.util.ArrayList;

public class ArrayL{
	public static void main(String[] args) {
		ArrayList<String> vivek = new ArrayList<>(5);
		ArrayList<Integer> list = new ArrayList<>(5);
		
		for(int i=0; i<5;i++) {
			vivek.add("vivek");
			list.add(i);
		}
		
		System.out.println(vivek);
		System.out.println(list);
	}
	
}