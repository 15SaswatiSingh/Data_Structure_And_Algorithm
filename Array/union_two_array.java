package Array;
import java.util.*;
public class union_two_array {
	
	public static Integer[] union(int arr1[],int arr2 []) {
		int n=arr1.length;
		int n2=arr2.length;
		Set<Integer> set = new HashSet<>();
		for (int i=0;i<n;i++) {
			set.add(arr1[i]);
		}
		for(int j=0;j<n2;j++) {
			set.add(arr2[j]);
		}
		Integer[]d=set.toArray(new Integer[0])	;
		
		return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {1,2,3,4,5,6,6,7,7,8,9};
		System.out.print(Arrays.toString(union(arr1,arr2)));
	}

}
