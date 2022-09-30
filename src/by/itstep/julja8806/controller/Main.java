package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.logic.ArrayWorker;

public class Main {
    public static void main(String[] args) {
        int size = 2_000_000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;

        }


        ArrayWorker.checkValue(array, 2_000_000);
        ArrayWorker.binarySearch(array, 2_000_000);
    }
}