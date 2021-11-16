package ru.vsu.cs.ilyam.sort.shellsortutils;

public class ShellStep implements StepGenerator {
    private int step;

    public ShellStep(int[] arr) {
        step = arr.length / 2;
    }

    @Override
    public int nextStep() {
        step = step / 2;
        return step;
    }
}
