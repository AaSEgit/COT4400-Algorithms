/*
 * Binary Search Algorithm
 * Programmer:  Ava Adams
 * Date:        January 17, 2024
 * Description: This program searches for an element 
 *  in an ordered list using the binary search algorithm
 */

package Practice;

import java.util.ArrayList;

public class BinarySearch {
    static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            }
            else if (arr[mid] > x) {
                high = mid - 1;
            }
            else {
                return mid; // found
            }
            
        }

        return -1;  // not found
    }

    public static void main(String[] args) {
        System.out.println("This program searches for an element in a list" + 
                                " using the binary search algorithm\n");

        // Search items
        int x = 3;
        int y = 8;

        // Initialize and display list
        int list[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("List: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        // Display results from binary search
        System.out.println("\nIndex of " + x + ": " + binarySearch(list, x));
        System.out.println("Index of " + y + ": " + binarySearch(list, y));
    }
}
