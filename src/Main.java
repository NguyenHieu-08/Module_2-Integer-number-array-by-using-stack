import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("New array: " + Arrays.toString(revertArr(arr)));
    }

    public static int[] revertArr (int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        int[] newArr = new int[arr.length];
        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = stack.pop();
        }
        return newArr;
    }
}