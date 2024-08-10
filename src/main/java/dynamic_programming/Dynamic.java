package dynamic_programming;
import java.util.HashMap;

public class Dynamic {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        long ans = fib(150, new HashMap<>());
//        long endTime = System.currentTimeMillis();
//        long timeTaken = endTime - startTime;
//
//        System.out.println("Fibonacci number: " + ans);
//        System.out.println("Time taken: " + timeTaken + " milliseconds");
        
        long startTime = System.currentTimeMillis();
        long ans = justfib(4);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;

        System.out.println("Fibonacci number: " + ans);
        System.out.println("Time taken: " + timeTaken + " milliseconds");
    }

    static long fib(long n, HashMap<Long, Long> memo) {
        if (n <= 2) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long result = fib(n - 1, memo) + fib(n - 2, memo);
            memo.put(n, result);
            return result;
        }
    }
    
    static long justfib(long n) {
    	if(n<=2) {
    		return 1;
    	}
    	return justfib(n-2)+justfib(n-1);
    }
}
