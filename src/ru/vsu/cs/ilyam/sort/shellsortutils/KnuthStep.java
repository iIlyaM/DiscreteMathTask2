package ru.vsu.cs.ilyam.sort.shellsortutils;

public class KnuthStep implements StepGenerator {
    private int i;

    public KnuthStep(int[] arr) {
        while ((Math.pow(3, i) - 1) / 2 < arr.length / 3) {
            i++;
        }
    }

    @Override
    public int nextStep() {
        int step = (int) ((Math.pow(3, i) - 1) / 2);
        i--;
        return step;
    }
}
