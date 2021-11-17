package ru.vsu.cs.ilyam.sort;

import ru.vsu.cs.ilyam.result.SortResult;
import ru.vsu.cs.ilyam.result.SwapAndCompareCountResult;

public class BubbleSort {

    public SwapAndCompareCountResult sort(int[] arr) {
        int[] array = arr.clone();
        boolean isSorted = false;
        int countComparison = 0;
        int countSwap = 0;
        int j = 0;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                countComparison++;
                if(array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                    countSwap++;
                }
            }
            j++;
        }
        return new SwapAndCompareCountResult(array, countSwap, countComparison);
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
