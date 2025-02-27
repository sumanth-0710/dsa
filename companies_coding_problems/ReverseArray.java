package companies_coding_problems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
      int[]arr={1,2,3};
      int k=2;
      int n=arr.length;
      reverse(arr,k,n-k);
      reverse(arr,0,k-1);
      reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[]arr,int left,int right){
        while(left<=right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
