import java.util.*;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        QS a = new QS();
        a.arraybuilder();
        a.quicksorter(a.numbers, 0, a.numbers.length - 1); // Call quicksorter to sort
        System.out.println("AFTER:");
        a.printArray(a.numbers); // Print the sorted array
        QS b = new QS();
        b.arraybuilder();
        b.quicksorter(b.numbers, 0, b.numbers.length-1);
        System.out.println("AFTER:");
        b.printArray(b.numbers);
    }
}

class QS
{
    Random rand = new Random();
    int[] numbers = new int[10];

    // Print the array
    public void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Build random array
    public void arraybuilder() 
    {
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("BEFORE:");
        printArray(numbers);
    }

    // Swap two elements in an array
    public void swap(int[] arr, int t1, int t2) 
    {
        int temp = arr[t1];
        arr[t1] = arr[t2];
        arr[t2] = temp;
    }

    // Quicksort implementation
    public void quicksorter(int[] arr, int leftindex, int rightindex) 
    {
        if (leftindex >= rightindex) 
        {
            return;
        }

        // Choose a pivot index
        int pivotindex = leftindex + rand.nextInt(rightindex - leftindex + 1);
        int pivot = arr[pivotindex];

        // Partition the array
        int leftpointer = leftindex;
        int rightpointer = rightindex;

        while (leftpointer <= rightpointer) 
        {
            while (arr[leftpointer] < pivot) 
            {
                leftpointer++;
            }
            while (arr[rightpointer] > pivot) 
            {
                rightpointer--;
            }
            if (leftpointer <= rightpointer) 
            {
                swap(arr, leftpointer, rightpointer);
                leftpointer++;
                rightpointer--;
            }
        }

        // Recursively sort the subarrays
        quicksorter(arr, leftindex, rightpointer);
        quicksorter(arr, leftpointer, rightindex);
    }
}