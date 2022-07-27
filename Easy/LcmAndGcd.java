package DSA.Easy;

public class LcmAndGcd {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long a = A;
        long b = B;
        Long [] x = new Long[2];
        long GCD = 0;
        while(B!=0){
            long r = A%B;
            A=B;
            B=r;
            GCD = A;
            x[1] = GCD;
        }
        long LCM = (a*b)/GCD;
        x[0] = LCM;
        return x;
    }
    public static void main(String[] args) {

    }
}
