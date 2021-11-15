package ru.vsu.cs.ilyam.sort;

import ru.vsu.cs.ilyam.search.BinarySearch;
import ru.vsu.cs.ilyam.search.LinearSearch;
import ru.vsu.cs.ilyam.result.Result;
import ru.vsu.cs.ilyam.result.SortResult;

public class InsertionSort {

    public SortResult sort(int[] arr, BinarySearch bSearch) {
        int [] array = arr.clone();
        int count = 0;
        int insertIndex;
        Result binSearch;

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            binSearch = bSearch.search(array, current, 0, j);
            insertIndex = binSearch.getValue();
            count += binSearch.getCount();
            for (j = i; j > insertIndex; j--) {
                swap(array, j - 1, j);
            }
        }
        return new SortResult(array, count);
    }

    public SortResult sort(int[] arr, LinearSearch lSearch) {
        int[] array = arr.clone();
        int insertIndex;
        int count = 0;


        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            Result linSearch = lSearch.search(array, current,0 ,j);
            insertIndex = linSearch.getValue();
            count += linSearch.getCount();
            for (j = i; j > insertIndex; j--) {
                swap(array, j - 1, j);
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