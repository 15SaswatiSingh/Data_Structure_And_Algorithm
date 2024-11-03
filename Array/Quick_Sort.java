package Array;

public class Quick_Sort {
	public static int partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
	
	public static void qs(int arr[],int low,int high) {
		if(low<high) {
			int pidx=partition(arr,low,high);
			qs(arr,low,pidx-1);
			qs(arr,pidx+1,high);
		}
		
	}
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]) {
		int arr[]= {7,8,2,3,9,6};
		int n=arr.length;
		qs(arr,0,n-1);
		printarr(arr);
	}
}
