package Array;
import java.util.*;

public class intersection {
    public static ArrayList<Integer> intersect(Integer a1[], Integer a2[]) {
        int n = a1.length;
        int m = a2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        while (i < n && j < m) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a1[i]) {
                j++;
            } else {
                ans.add(a1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        Integer b[] = {2, 3, 4, 5};
        System.out.print(intersect(a, b));
    }
}
