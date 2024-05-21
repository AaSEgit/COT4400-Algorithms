/*
 * Selection Sort Algorithm
 * Programmer:  Ava Adams
 * Date:        January 4, 2024
 * Description: This program is an example of a simple selection sort (find the kth largest value)
 */

package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
      public static void main (String[] args) {
            // determine k
            int k = 3;

            // Description
            System.out.println("This program will display the kth largest value in a list of numbers (k = " + k + ")\n");

            // initialize list of numbers
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(8);
            numbers.add(5);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(6);
            numbers.add(7);
            numbers.add(1);
            System.out.println("Before sorting: " + numbers);

            // sort list in descending order
            Collections.sort(numbers, Collections.reverseOrder());
            System.out.println("Sorted list: " + numbers);
            System.out.println(k + "th largest: " + numbers.get(k-1));
      }
}