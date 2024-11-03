package Array;
public class missing_number {
	public static int missing_of(int [] arr) {
		for (int i=1;i<=arr.length;i++) {
			int flag=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
					flag=1;
					break;
				}
			}
			if (flag==0) {
				return i;
			}
		}
		return 0;
	}
	public static int missing_optimal(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int summ=(arr.length+1)*(arr.length+2)/2;
		int diff=summ-sum;
		return diff;
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7};
		System.out.println(missing_of(arr));
		System.out.print(missing_optimal(arr));
	}

}
