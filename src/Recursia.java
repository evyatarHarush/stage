import java.util.Stack;

public class Recursia {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        int [] arr = {2,3,4,5,7};

        System.out.println(LastNumber(stack));
        System.out.println(SarchBirary(arr,0,arr.length-1,8));

    }

    public static int SarchBirary(int[] arr, int start, int end, int find) {
        int mid = (start + end) / 2;
        if (arr[mid] == find) {
            return mid;
        } else if (start >= end) {
            return -1;
        } else if (arr[mid] > find) {
            return SarchBirary(arr, start, mid - 1, find);
        }

        return SarchBirary(arr, mid + 1, end, find);
    }

    public static int LastNumber(Stack<Integer> stack) {

        int temp = stack.pop();
        if (stack.isEmpty()) {
            return temp;
        }

        return LastNumber(stack);
    }
}
