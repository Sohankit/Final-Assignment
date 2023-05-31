package in.ineuron;

public class BinarySearch {

	public int binarySearch(int[] arr, int l, int h, int key) {
		
		
		
		while (l <= h) {
			int mid = (l + h) / 2;
			
			if (arr[mid] < key) {
				
				l = mid + 1;
				
			} else if (arr[mid] == key) {
				
				return mid;
				
				
			} else {
				
				h = mid - 1;
				
			}
			
		}
		
		return -1;
	}
}
