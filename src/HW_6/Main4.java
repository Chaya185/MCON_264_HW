package HW_6;

public class Main4 {
    public static void main(String[] args){

        //fibonacci using while loop
        int n = 4;
        int previous = 0;
        int current = 1;
        int result = 0;
        int i = 2;
        while (i <= n){
            result = previous + current;
            previous = current;
            current = result;
            i++;
        }
        System.out.println("Fibonacci of " + n  + " is: " + result);

        //fibonacci using tail recursion
        int q = 6;
        long fibonacci = calculateFibonacci(q);
        System.out.println("Fibonacci of " + q + " is: " + fibonacci);

        //fibonacci using head recursion
        int p = 7;
        int headResult = fibonacciHead(p);
        System.out.println("Fibonacci of " + p + " is: " + headResult);
    }
    public static int calculateFibonacci(int n){
        if (n <= 1){
            return n;
        }
        else {
            int prev1 = calculateFibonacci(n-1);
            int prev2 = calculateFibonacci(n-2);
            return prev1 + prev2;

        }
    }

    public static int fibonacciHead(int n){
        if (n <= 1){
            return n;
        }
        return fibonacciHead(n-1) + fibonacciHead(n-2);
    }
}
