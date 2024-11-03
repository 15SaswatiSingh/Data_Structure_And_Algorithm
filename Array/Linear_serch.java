package Array;

public class Linear_serch {
	public static int linear_search(int arr[],int ele) {
		for(int i=0;i<=arr.length-1;i++) {
			if(ele==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int index=linear_search(arr,3);
		if(index==-1) {
			System.out.println("element not found");
			
		}
		else {
			System.out.println("the element is found at index: "+index);
		}
		
	}

}
