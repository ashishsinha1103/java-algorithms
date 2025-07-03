package org.example;

import org.example.sort.SortingAlogrithms;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = new Random().nextInt(10);
        }
        System.out.println("Input array - " + Arrays.toString(a));
        System.out.println("Ouput array - " + Arrays.toString(new SortingAlogrithms().selectionSort(a)));

    }
}