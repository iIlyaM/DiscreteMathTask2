package ru.vsu.cs.ilyam.search;

import ru.vsu.cs.ilyam.result.Result;

public class BinarySearch {

    public Result search(int[] arr, int item, int startIndex, int endIndex) {
        int low = startIndex;
        int high = endIndex;
        int mid;
        int count = 0;


        while (low <= high) {
            count++;
            mid = (high + low) / 2;
            if(mid == low) {
                if(item < arr[low]) {
                    return new Result(low, count);
                }
            }

            if(mid == high) {
                if(item > arr[high]) {
                    return new Result(high + 1, count);
                }
            }

            if((item >= arr[mid]) && (item <= arr[mid + 1])) {
                return new Result(mid + 1, count);
            }

            if(item < arr[mid]) {
                high = mid - 1;
            }

            if(item > arr[mid]) {
                low = mid + 1;
            }
        }
        return new Result(-1, count);
    }
}
