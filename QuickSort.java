/*
 * Quick Sort Algorithm
 * Programmer:  Ava Adams
 * Date:        January 17, 2024
 * Description: This program is an example of the quick sort algorithm
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuickSort {
    static void quickSort(ArrayList<Integer> arr) {

        if(arr.size() > 1) {
            ArrayList<Integer> smaller = new ArrayList<>();
            ArrayList<Integer> same = new ArrayList<>();
            ArrayList<Integer> larger = new ArrayList<>();
            int pivot = arr.get(arr.size() / 2);

            for (int i : arr) {
                if (i < pivot) smaller.add(i);
                else if (i > pivot) larger.add(i);
                else same.add(i);
            }
            // Sort the sectioned lists and combine them in the new list
            quickSort(smaller);
            quickSort(larger);
            arr.clear();

            arr.addAll(smaller);
            arr.addAll(same);
            arr.addAll(larger);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(1);

        System.out.println("This program will sort an array of numbers using the quick sort algorithm.\n");

        System.out.println("Before sorting: " + numbers);
        quickSort(numbers);
        System.out.println("After sorting: " + numbers);
    }
}   
