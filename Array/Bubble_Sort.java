package Array;

public class Bubble_Sort {
	public static void Bs(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,4,2,3,1};
		Bs(arr);
		printarr(arr);
	}

}
