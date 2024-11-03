package Array;
import java.util.*;
public class left_rotate_by_d {
//	public static String optimal_left_rotation(int [] arr,int d,int n) {
//		List<int[]> list=Arrays.asList(arr);
//		Collections.reverse(list.subList(0,d));
//		Collections.reverse(list.subList(d+1, n));
//		System.out.print(Arrays.toString(arr));
//		return Arrays.toString(arr);
//	}


    public static String maini(Integer[] array,int s,int e) {

        // Convert array to list
        List<Integer> list = Arrays.asList(array);
        
        // Reverse the sublist
        Collections.reverse(list.subList(s, e + 1));
        
        // Print the modified array
        return Arrays.toString(array);
	
    }
	public static void main(String args[]) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        int d=5;
        int n=array.length;
        maini(array,0,d-1);
        maini(array,d,n-1);
        System.out.print     (maini(array,0,n-1));
	}
}

