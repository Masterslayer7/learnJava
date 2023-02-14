/*
Given the Array  [13, 7, 18, 5, 2]
Search for the min
Search for the max
Find the average 
Swap 13 and 7
 * 
 */

package Arrays;

public class ArrayModifications {

    // Prints elements
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // finds index of num
    private static int findIndex(int[] array, int num) {
        int Index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                Index = i;
            }
        }
        return Index;
    }

    // add number to a array between two numbers
    public static int[] addnumBetween(int arr[], int numAdd, int num1, int num2) {
        int n = arr.length;
        int GreaterNum;
        // sees if num1 or num2 is bigger
        if (num1 > num2) {
            GreaterNum = num1;
        } else {
            GreaterNum = num2;
        }

        // sorts array
        SortGtoL(arr);

        // finds the index of greaterNum
        int index = findIndex(arr, GreaterNum);
        // creates new array
        int newarr[] = new int[n + 1];

        // sets old numbers into new array
        for (int i = 0; i < index + 1; i++) {
            newarr[i] = arr[i];
        }

        // sets new index to where it belongs
        newarr[index + 1] = numAdd;

        // continues putting old numbers into new array

        for (int k = index + 1; k < n; k++) {
            newarr[k + 1] = arr[k];
        }

        return newarr;
    }

    //

    private static int[] removeX(int arr[], int x)
    {
        int i;
        int n = arr.length;
        
        // create a new array of size n-1
        int newarr[] = new int[n - 1];
    
        //Find index of x
        int index = findIndex(arr, x);

        for (i = 0; i < index; i++)
           newarr[i] = arr[i];
        
        for (i = index + 1; i < n - 1; i++)
            newarr[i + 1] = arr[i];
   
       return newarr;
   }

    // sort array from greatest to least
    private static int[] SortGtoL(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // creation of array
        int[] array = { 13, 7, 18, 5, 2 };

        // Prints elements
        printArray(array);
        System.out.println();

        // Get index of num
        System.out.println("The index of 18 is: " + findIndex(array, 18));

        // Sorts array from Greatest to least
        printArray(SortGtoL(array));
        System.out.println();

        printArray(addnumBetween(array, 10, 18, 5));
        System.out.println();

        printArray(removeX(array, 2));
    }

}
