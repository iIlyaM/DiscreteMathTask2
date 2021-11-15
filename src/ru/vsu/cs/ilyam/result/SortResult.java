package ru.vsu.cs.ilyam.result;

public class SortResult {
    private int[] sortedArr;
    private int count;

    public SortResult(int[] sortedArr, int count) {
        this.sortedArr = sortedArr;
        this.count = count;
    }

    public int[] getSortedArr() {
        return sortedArr;
    }

    public void setSortedArr(int[] sortedArr) {
        this.sortedArr = sortedArr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
