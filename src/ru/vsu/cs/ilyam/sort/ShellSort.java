package ru.vsu.cs.ilyam.sort;

import ru.vsu.cs.ilyam.result.SortResult;
import ru.vsu.cs.ilyam.result.SwapAndCompareCountResult;
import ru.vsu.cs.ilyam.sort.shellsortutils.StepGenerator;

public class ShellSort {

//    public SwapAndCompareCountResult sort(int[] arr, StepGenerator stepGen) {
//        int[] sortedArray = arr.clone();
//        int count = 0;
//        int swapCount = 0;
//        int step = stepGen.nextStep();
//
//
//        while (step > 0) {
//            for (int i = step; i < sortedArray.length; i++) {
//                for (int j = i; (j >= step); j -= step) {
//                    count++;
//                    if (sortedArray[j] < sortedArray[j - step]) {
//                        swap(sortedArray, j, j - step);
//                        swapCount++;
//                    }
//                }
//            }
//            step = stepGen.nextStep();
//        }
//        return new SwapAndCompareCountResult(sortedArray, swapCount, count);
//    }

    public SwapAndCompareCountResult sort(int[] array) {
        int[] arr = array.clone();
        int countSwap = 0;
        int countComparison = 0;


        int h = 1;
        while (h * 3 < arr.length)
            h = h * 3 + 1;

        while (h >= 1) {
            SwapAndCompareCountResult res =  hSort(arr, h);
            countSwap += res.getCountSwap();
            countComparison += res.getCountComparison();
            h = h / 3;
        }
        return new SwapAndCompareCountResult(arr, countSwap, countComparison);
    }

    private SwapAndCompareCountResult hSort(int[] array, int h) {
        int length = array.length;
        int countSwap = 0;
        int countComparison = 0;

        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                countComparison++;
                if (array[j] < array[j - h]) {
                    swap(array, j, j - h);
                    countSwap++;
                } else
                    break;
            }
        }
        return new SwapAndCompareCountResult(array, countSwap, countComparison);
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
