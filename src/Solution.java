// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static int solution(int N) {
        String binar = binary(N);

        int max = 0, counter = 0;
        boolean start = false;
        for(int x = 0; x < binar.length(); x++){
            if(binar.charAt(x)=='1' && !start){
                start = true;
            }

            if(binar.charAt(x)=='0'){
                counter++;
            }

            if(binar.charAt(x)=='1' && start){
                if(counter > max)
                    max = counter;
                counter = 0;
                start = false;
            }
        }
        return max;
    }

    private static String binary(int N){
        StringBuilder x = new StringBuilder();
        while(N != 0){
            int rest = N%2;
            N/=2;
            x.append(rest + "");
        }
        x.reverse();
        return x.toString();
    }
}
