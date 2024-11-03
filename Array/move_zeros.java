package Array;
import java.util.*;
public class move_zeros {
	public static int[] move_to_last(int []arr,int n) {
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				count++;
			}
		}
		int temp[] = new int[count];
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				
				temp[index]=arr[i];
				index++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,0,1,0};
		System.out.print(Arrays.toString(move_to_last(arr,arr.length)));
	}

}
