public class HW_5 {
    public static void main(String[] args){
        int[] numbers = {2, 3, 5, 6};
        int start = 0;

        System.out.println("The sum of the array is: " + recursiveFunctionSum(numbers, start));

        //counting down recursion example
        System.out.println("\nCounting down: ");
        int n = 5;
        countingDown(n);

        //reverse string using recursion
        System.out.println("\n\nReversed string: ");
        String string = "hello";
        int last = string.length();
        reverseString(string, last - 1);

        //challenge example
        System.out.println("\n\nChallenge example: ");
        challenge(numbers, start, n);
    }

    public static int recursiveFunctionSum(int[] numbers, int start){
        //base case
        if (start >= numbers.length){
            return 0;
        }
        return numbers[start] + recursiveFunctionSum(numbers, start + 1);
    }

    public static void countingDown(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+ ", ");
        countingDown(n-1);
    }

    public static void reverseString(String string, int start){
        if (start < 0){
            return;
        }
        System.out.print(string.charAt(start));
        reverseString(string, start-1);
    }

    public static void challenge(int[] numbers, int start, int requestedNumber){
        //base case
        if (start >= numbers.length){
            return;
        }
        if (numbers[start] == requestedNumber){
            System.out.println("Requested #5. Received: " + numbers[start]);
        }
        challenge(numbers, start + 1, requestedNumber);
    }
}
