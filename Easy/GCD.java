package DSA.Easy;

import java.util.Arrays;

public class GCD {
    public static void main(String[] args) {
    //Euclidean Algo
        //Find GCD
        int b = 900;
        int a = 750;
        /*if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }*/
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(a);





    }


}
