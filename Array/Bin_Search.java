package Array;

public class Bin_Search {
	public static int Bs(int arr[],int n) {
		int start=0;
		int end=arr.length-1;
		for(int i=0;i<=end;i++) {
			int mid=(start+end)/2;
			if(n==arr[mid]) {
				return mid;
			}
			else if(n<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int index=Bs(arr,4);
		if(index==-1) {
			System.out.println(" not found");
		}
		else {
			System.out.println(index);
		}
	}

}
