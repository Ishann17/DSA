package DSA.Easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {12, 35, 36, 1, 10, 34, 1};

        //Method - 1 (Time requires more)
        /*Arrays.sort(arr);
        int n = arr.length;
        System.out.println(arr[n-2]);
        int ans = arr[n-2];
        System.out.println(ans);*/

        //Method - 2 (Time requires Less) MOST EFFICIENT WAY
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!= max){
                max2 = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(max2);

    }
}
