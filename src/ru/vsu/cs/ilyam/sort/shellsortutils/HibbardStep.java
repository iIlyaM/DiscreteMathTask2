package ru.vsu.cs.ilyam.sort.shellsortutils;

public class HibbardStep implements StepGenerator{
    private int i;

    public HibbardStep(int[] arr) {
        while ((int)Math.pow(2, i) - 1 < arr.length) {
            i++;
        }
    }

    @Override
    public int nextStep() {
        i--;
        return (int) Math.pow(2, i) - 1;
    }
}
