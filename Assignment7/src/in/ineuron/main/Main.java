package in.ineuron.main;

import java.util.Scanner;

import in.ineuron.BinarySearch;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		BinarySearch b = new BinarySearch();
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Enter key ");
		int key = sc.nextInt();
		int last = arr.length - 1;
		int result=b.binarySearch(arr, 0, last, key);
		
		if(result== -1) {
			System.out.println("Element is not found");
		}else {
			System.out.println("Element is present at index "+result);
		}
	}
}
