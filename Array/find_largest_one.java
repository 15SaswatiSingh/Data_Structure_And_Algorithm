package Array;

public class find_largest_one {
	public static void large(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
			}
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("the largest value in the arr is "+largest);
		System.out.println("the smallest vlue in the array is "+smallest);
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,55,12,23};
		large(arr);
	}
}
