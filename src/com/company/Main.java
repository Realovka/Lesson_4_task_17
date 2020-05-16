package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Введите значение, которое нужно найти в массиве");
        Scanner scanner1 = new Scanner(System.in);
        int x = scanner1.nextInt();

        Random random = new Random();

        int[] array = new int[n];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        int a=0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == x) {
                a++;
            }
        }
            System.out.println("Число "+x+" встречается в массиве "+a+" раз");


    }
}
