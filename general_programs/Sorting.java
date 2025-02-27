package general_programs;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {1,8, 4, 9,7,2};
        sorted(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Bubble Sort
    /*public static void sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }*/
    //Selection Sort
    /*public static void sorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }*/

    //Insertion Sort
    public static void sorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }


}
