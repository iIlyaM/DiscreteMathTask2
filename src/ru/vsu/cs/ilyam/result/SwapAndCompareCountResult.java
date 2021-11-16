package ru.vsu.cs.ilyam.result;

public class SwapAndCompareCountResult {
    private int[] sortedArr;
    private int countSwap;
    private int countComparison;

    public SwapAndCompareCountResult(int[] sortedArr, int countSwap, int countComparison) {
        this.sortedArr = sortedArr;
        this.countSwap = countSwap;
        this.countComparison = countComparison;
    }

    public int[] getSortedArr() {
        return sortedArr;
    }

    public void setSortedArr(int[] sortedArr) {
        this.sortedArr = sortedArr;
    }

    public int getCountSwap() {
        return countSwap;
    }

    public void setCountSwap(int countSwap) {
        this.countSwap = countSwap;
    }

    public int getCountComparison() {
        return countComparison;
    }

    public void setCountComparison(int countComparison) {
        this.countComparison = countComparison;
    }
}
