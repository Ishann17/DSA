package DSA.Easy;

public class ReplaceZerowithFive {
    public static void main(String[] args) {
        int  n = 1004235002;
        int num = 0;
        int mul = 1;
        while(n!=0){
            int d = n%10;
            if(d==0){
                d=5;
            }
            num = num + d * mul;
            mul *= 10;
            n/=10;
        }
        System.out.println(num);
    }
}
