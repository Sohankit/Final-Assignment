package in.ineuron;

import java.util.*;
import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {

		List<Integer> numberList = null;
		Scanner sc = null;
		try {
			numberList = new ArrayList<Integer>();
			sc = new Scanner(System.in);
			System.out.println("Enter Size of the list");
			int size = sc.nextInt();
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the " + i + " element ");
				int value = sc.nextInt();
				numberList.add(value);
			}

			List<Integer> list = sortedList(numberList);

			System.out.println(list);
			System.out.println("Second larget element in the list :: " + list.get(list.size() - 2));
			System.out.println("Second smallest element in the list :: " + list.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	// Logic to sort the array in ascending order
	private static List<Integer> sortedList(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j) > list.get(j + 1)) {
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}
}
