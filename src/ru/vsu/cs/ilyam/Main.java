package ru.vsu.cs.ilyam;

import ru.vsu.cs.ilyam.search.BinarySearch;
import ru.vsu.cs.ilyam.search.LinearSearch;
import ru.vsu.cs.ilyam.sort.BubbleSort;
import ru.vsu.cs.ilyam.sort.InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        init();
    }

    private static void init() {
        BubbleSort bubbleSort = new BubbleSort();
        int size;
        int[] arr;
        printArrayStartInfo();
        int answer = readAnswer();

        switch (answer) {
            case 1:
                size = readArraySize();
                arr = initRandomArray(size);
                printArray(arr);
                printBubbleSortResult(arr, bubbleSort);
                break;
            case 2:
                size = readArraySize();
                arr = initArray(size);
                printArray(arr);
                printBubbleSortResult(arr, bubbleSort);
                break;
        }
    }

    private static int readArraySize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        return sc.nextInt();
    }

    private static int readAnswer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выбираю способ : ");
        return scan.nextInt();
    }

    private static int readArrValue(int index) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ввести %d- ый элемент массива: ", index);
        return scanner.nextInt();
    }

    private static void printArrayStartInfo() {
        System.out.println("Введите '1', чтобы проинициализировать случаный массив\n" +
                "Введите '2', чтобы задать массив самостоятельно");
    }

    private static int[] initRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30));
        }
        System.out.println("Сгенерированный массив : ");
        return array;
    }

    private static int[] initArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = readArrValue(i);
        }
        System.out.println("Сгенерированный массив : ");
        return array;
    }

    private static void printArray(int[] array2Print) {
        System.out.println(Arrays.toString(array2Print));
    }

    private static void printInsertBinSort(int[] arr, InsertionSort iSort, BinarySearch bSearch) {
        System.out.println("\n");
        System.out.println("Отсортированный с помощью бинарного поиска массив : ");
        printArray(iSort.sort(arr, bSearch).getSortedArr());
        System.out.println("Количество сравнений : " + iSort.sort(arr, bSearch).getCount());
        System.out.println("\n");
    }

    private static void printInsertLinSort(int[] arr, InsertionSort iSort, LinearSearch lSearch) {
        System.out.println("Отсортированный с помощью линейного поиска поиска массив : ");
        printArray(iSort.sort(arr, lSearch).getSortedArr());
        System.out.println("Количество сравнений : " + iSort.sort(arr, lSearch).getCount());
        System.out.println("\n");
    }

    private static void printBubbleSortResult(int[] arr, BubbleSort bubbleSort) {
        System.out.println("\n");
        System.out.println("Отсортированный с помощью пузырьковой сортировки массив : ");
        printArray(bubbleSort.sort(arr).getSortedArr());
        System.out.println("Количество сравнений : " + bubbleSort.sort(arr).getCount());
        System.out.println("\n");
    }
}
