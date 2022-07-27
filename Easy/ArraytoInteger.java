package DSA.Easy;

public class ArraytoInteger {
    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int result = 0;
        int offset = 1;
        for(int i = ar.length - 1; i >= 0; i--) {
            result += ar[i]*offset;
            offset *= 10;
        }
        System.out.println(result);
    }
}
