package ru.vsu.cs.ilyam.sort;

import ru.vsu.cs.ilyam.result.SortResult;

public class BubbleSort {

    public SortResult sort(int[] arr) {
        int[] array = arr.clone();
        boolean isSorted = false;
        int count = 0;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                count++;
                if(array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                }
            }
        }
        return new SortResult(array, count);
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
