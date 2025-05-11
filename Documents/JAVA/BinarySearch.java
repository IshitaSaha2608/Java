/*class BinarySearch
{
    int binarySearch(int val, int[] arr)
    {
        int low=0, high=(arr.length-1);
        while(low<=high)
        {
            int mid =((low+high)/2);
            if(arr[mid] == val)
                return mid;
            else if(arr[mid]>val)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}
class Test
{
    public static void main(String[] args)
    {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        BinarySearch b = new BinarySearch();
        int result = b.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}*/
/*class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x is greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, the element was not present
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}*/
import java.util.Scanner;

public class BinarySearch {
    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If the target is smaller than mid, it must be in the left sub-array
            if (array[mid] > target) {
                right = mid - 1;
            }
            // Otherwise, the target is in the right sub-array
            else {
                left = mid + 1;
            }
        }

        // Target is not in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input: elements of the array
        System.out.println("Enter " + size + " sorted integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: target to search for
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
