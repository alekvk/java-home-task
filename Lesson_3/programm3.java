package Lesson_3;
import java.util.Arrays;

public class programm3 {
    public static void main (String args[]) {
        double Arr[] = {17.1, -6, 4, 1, 16.8, 15, 11, 5, 3.5};
        System.out.println(Arrays.toString(Arr));
        double result[] = sortMerge(Arr);
        System.out.println(Arrays.toString(result));
    }    
     
    public static double[] sortMerge(double[] Arr) {
        double arr1[] = Arrays.copyOf(Arr, Arr.length);
        double arr2[] = new double[Arr.length];
        double result[] = sortMergeRecurs(arr1, arr2, 0, Arr.length);
        return result;
        }
    
    public static double[] sortMergeRecurs(double arr1[], double arr2[], int startInd, int arrayLength) {
        if (startInd >= arrayLength - 1) {
                return arr1;
        }
        int median = startInd + (arrayLength - startInd) / 2;
        double sort1[] = sortMergeRecurs(arr1, arr2, startInd, median);
        double sort2[] = sortMergeRecurs(arr1, arr2, median, arrayLength);
        
        int ind1 = startInd;
        int ind2 = median;
        int destInd = startInd;
        double result[];
        if (sort1 == arr1) {
            result = arr2; 
        } else {
            result = arr1;
        }
        while (ind1 < median && ind2 < arrayLength) {
            if (sort1[ind1] < sort2[ind2]) {
                result[destInd++] = sort1[ind1++];   
            } else {
                result[destInd++] = sort2[ind2++];
            }
        }
        while (ind1 < median) {
            result[destInd++] = sort1[ind1++];
        }
        while (ind2 < arrayLength) {
                result[destInd++] = sort2[ind2++];
        }
        return result;
        }
}






