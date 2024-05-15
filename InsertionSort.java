/*
 * Insertion Sort Algorithm
 * Programmer:  Ava Adams
 * Date:        January 17, 2024
 * Description: This program is an example of an insertion sort 
 *  (maintain ascending order after inserting a new element)
 */

package Practice;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        int i, key, j;

        for (i = 1; i < arr.length; i++) {
            key = arr[i];

            /*  Move elements of arr[0 : i-1], that are
                greater than key, to one position ahead
                of their current position
            */
            for (j = i-1; j >= 0 && arr[j] > key; j--) {
                arr[j+1] = arr[j];
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] myList = {7, 3, 5, 6, 1};
        
        System.out.println("This program will sort an array of numbers using the insertion sort algorithm.\n");

        System.out.print("Before Insertion Sort: ");
        for(int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        insertionSort(myList);

        System.out.print("\nAfter Insertion Sort: ");
        for(int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
    }
}
