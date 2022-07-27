package DSA.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Practice {
    /*static int isPrime(int N){
        // code here
        int m = 0;
        for(int i=2; i*i<N;i++){
            if(N%i==0){
                m++;
            }
        }
        if(m>0){
            return 0;
        }
        else{
            return 1;
        }
    }*/

    public static void main(String[] args) {

        int m = 0;
        int N = 9;
        for(int i=2; i*i<=N;i++){
            if(N%i==0){
                m++;
                break;
            }
        }
        if(m>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }

}
