package recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    public static int reverse(int num){
        return reverseHelper(num,0);
    }
    private static int reverseHelper(int num, int reversed) {
        if(num==0){
            return reversed;
        }
        return reverseHelper(num/10,reversed*10+num%10);
    }
}
