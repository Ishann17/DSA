package DSA.Easy;

import java.util.Arrays;

public class PrintLargestName {
    public static void main(String[] args) {

        String names[] = { "Harsh", "Gaurav", "GauravMiglani", "HarshAgarwal", "GeeksforGeeksGeeks", "Programmiz", "ZebraCrossingisdanger"};
        Arrays.sort(names);
        String a = "ZebraCrossingisdanger";
        String b = "GeeksforGeeksGeeks";
        System.out.println(a.length() + " " + b.length());
        System.out.println(Arrays.toString(names));
        String op = "";
        for(int i=0; i<names.length-1; i++){
            int start = names[i].length();
            // System.out.println(names[i]);
            int end = names[i+1].length();
            if(end > start){
                op = names[i+1];
            }
            else{
                op = names[i];
                break;
            }
        }
        System.out.println(op);
    }
}
