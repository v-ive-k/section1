package section1;

import java.util.*;
import java.io.*;

public class HashMa {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("q", 0);
		map.put("qq", 4);
		System.out.println(map.containsKey("q"));
			System.out.println(map.get("q"));
				for(String key : map.keySet()) {
					System.out.println("the key is: " +key + " ,the value of key is: " + map.get(key));
				}
	
	
	}

}
