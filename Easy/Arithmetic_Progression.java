package DSA.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arithmetic_Progression {

    static boolean checkAP(int [] a, int n){
        //n is the size of the array.
        //For AP check first sort the Array
        Arrays.sort(a);
        //Check for the common difference d
        int d = a[n-1] - a[n-2];
        for(int i=n-1; i>0; i--){
            if(a[i]-a[i-1]!=d)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int arr[] = {0,12,4,8};
        int x = arr.length;
        System.out.println(checkAP(arr, x));

    }
}
