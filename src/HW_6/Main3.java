package HW_6;

public class Main3 {
    public static void main(String[] args){
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        //int index = 0;
        int result = BinaryTree.binarySearch(sortedArray, target);

        if (result != -1){
            System.out.println("Target " + target +  " found at index " + result);
        }
        else {
            System.out.println("Target not found in array.");
        }
    }
}
