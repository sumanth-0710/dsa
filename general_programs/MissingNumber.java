package general_programs;


public class MissingNumber {

    public static void main(String[] args) {
        int[]arr={3,8};
        int j=0;
        for(int i=arr[0];i<arr[arr.length-1];i++){
            if(j<arr.length&&i==arr[j]){
                j++;
            }
            else{
                System.out.println(i+" ");
            }
        }
    }

}