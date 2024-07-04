package section1;

import java.util.*;
import java.io.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int m = sc.nextInt();
		int arr[] = new int[m];
		System.out.println("enter the numbers into array one by one:");
		for (int q = 0; q < m; q++) {
			arr[q] = sc.nextInt();
		}
		bubble1(arr, m);
		for (int k = 0; k < 5; k++) {
			System.out.println(arr[k]);
		}
		sc.close();
	}

	public static void bubble1(int[] arr, int w) {
		int n = w;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}
			}
		}

	}

}