package DSA.Easy;

public class AmrstrongNumber {
    static String armstrongNumber(int n) {
        // code here
        int check = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, 3);
            n /= 10;
        }
        if (check == sum) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
