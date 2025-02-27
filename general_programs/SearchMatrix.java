package general_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,9,5,7},{7,10,13,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 13));
        List<Integer>array=Arrays.stream(matrix)
                .flatMapToInt(e -> Arrays.stream(e))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(array);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target&&target<=matrix[i][matrix[0].length-1]){
                return(binaryS(matrix[i],target));
            }
        }
        return false;
    }
    public static boolean binaryS(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }

}
