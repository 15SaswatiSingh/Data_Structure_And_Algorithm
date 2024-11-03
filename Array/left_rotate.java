package Array;
import java.util.*;
public class left_rotate {
	public static int[]rotate_left(int [] arr,int a){
		int temp=arr[0];
		for (int i=1;i<a;i++) {
			arr[i-1]=arr[i];
		}
		arr[a-1]=temp;
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(rotate_left(arr,arr.length)));
	}

}
