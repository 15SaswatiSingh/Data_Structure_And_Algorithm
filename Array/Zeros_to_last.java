package Array;

import java.util.Arrays;

public class Zeros_to_last {
	
	public static int[]move_zero_to_last(int arr[]){
		int j=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		if(j!=-1) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[k]!=0) {
					int temp=arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
					j++;
					System.out.print(Arrays.toString(arr));
				}
			}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,0,2,3,0,4};
		System.out.print(Arrays.toString(move_zero_to_last(a)));
		
	}

}
