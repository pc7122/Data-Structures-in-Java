import java.util.Arrays;
import java.util.Scanner;

class Searching {
    public static int linearSearch(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int val) {
        Arrays.sort(arr);
        int low = 0, high = arr.length - 1, mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == val)
                return mid;

            if (arr[mid] > val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    // Function to display elements of an array
    public static void showArray(int[] arr) {
        System.out.println("\nElements of array:");
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        short n = sc.nextShort();

        int[] arr = new int[n];
        System.out.println("\nEnter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter value to be search: ");
        int val = sc.nextInt();

        short index = (short) binarySearch(arr, val);

        if (index == -1)
            System.out.println("Element not found!");
        else
            System.out.println("Element found at index " + (index + 1));

        showArray(arr);

        sc.close();
    }
}