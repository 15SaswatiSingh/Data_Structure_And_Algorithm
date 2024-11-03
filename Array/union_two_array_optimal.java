package Array;
import java.util.*;

public class union_two_array_optimal {
    public static ArrayList<Integer> union(Integer[] arr1, Integer[] arr2) {
        ArrayList<Integer> un = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (un.size() == 0 || !un.contains(arr1[i])) {
                    un.add(arr1[i]);
                }
                i++;
            } else {
                if (un.size() == 0 || !un.contains(arr2[j])) {
                    un.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (un.size() == 0 || !un.contains(arr1[i])) {
                un.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (un.size() == 0 || !un.contains(arr2[j])) {
                un.add(arr2[j]);
            }
            j++;
        }

        return un;
    }

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5};
        Integer arr2[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(union(arr1, arr2));
    }
}
