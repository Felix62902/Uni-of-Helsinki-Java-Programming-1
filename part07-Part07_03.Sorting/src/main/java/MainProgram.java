import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
            // write your code here
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex+1; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
    int store = array[index1];
    array[index1]= array[index2];
    array[index2]=store;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array,smallestIndex,i);
            System.out.println(Arrays.toString(array));
        }
    }
}
