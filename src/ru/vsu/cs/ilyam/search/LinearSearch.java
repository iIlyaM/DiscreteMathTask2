package ru.vsu.cs.ilyam.search;

import ru.vsu.cs.ilyam.result.Result;

public class LinearSearch {

    public Result search(int[] arr, int item, int startIndex, int endIndex) {
        int count = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            count++;

            if(item <= arr[i]) {
                return new Result(i, count);
            }
        }
        return new Result(endIndex + 1  , count);
    }
}
