package Algorithms;

import java.util.Arrays;

public class BinarySearch {


    private static int upperIndex;
    private static int lowerIndex;

    public static void main(String[] args) {
        System.out.println("Binary Search Start...");

        int[] inputData = new int[10001];


        for (int i = 0; i < 10000; i++) {
            inputData[i] = i;
        }


        System.out.println("Inputed Array:\n" + Arrays.toString(inputData));

        lowerIndex = 0;
        upperIndex = inputData.length - 1;


        int findingValue = 1999;


        System.out.println(String.format("Finding value %d", findingValue));

        int indexOfResult = searchValue(inputData, findingValue);

        if (indexOfResult == -1)
            System.out.println("Result cannot find");
        else
            System.out.println(String.format("Result is arr[%d]=%d", indexOfResult, inputData[indexOfResult]));


    }

    private static int calcMidPoint() {
        return lowerIndex + (upperIndex - lowerIndex) / 2;
    }


    private static int searchValue(int[] array, int findingValue) {
        int comparison = 0;
        int mid;
        while (lowerIndex <= upperIndex) {
            comparison++;
            System.out.println(String.format("Comporise %d", comparison));
            System.out.println(String.format("Lower %d,Upper %d", lowerIndex, upperIndex));
            mid = calcMidPoint();
            System.out.println(String.format("Midle arr[%d]=%d", mid, array[mid]));
            if (array[mid] == findingValue) {
                System.out.println("FIND!!!");
                return mid;
            } else if (array[mid] > findingValue) {
                upperIndex = mid - 1;
            } else {
                lowerIndex = mid + 1;
            }
        }
        return -1;
    }


}
