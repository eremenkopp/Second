package com.petrocompany;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix(new int[] {1, 5, 3, 2, 14, 4, 5, 2, 4, 1, 9, 1});
        taskSeven(new int[] { 3, 5, 6, 1, 4, 9, 2}, -2);
    }

    public static void taskOne() {
        System.out.println("Задание 1.");
        int arr[] = {0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void taskTwo(){
        System.out.println("Задание 2.");
        int arr[] = new int[8];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k;
            k+=3;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void taskThree(){
        System.out.println("Задание 3.");
        int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i]*2;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void taskFour(){
        System.out.println("Задание 4.");
        int size = 10;
        int arr[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j){
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }

    public static void taskFive(){
        System.out.println("Задание 5.");
        int size = 13;
        Random r = new Random();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0], max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимум = " + min);
        System.out.println("Максимум = " + max);
        System.out.println();
    }

    public static boolean taskSix(int[] arr){
        System.out.println("Задание 6.");
        System.out.println(Arrays.toString(arr));
        int sumLeft, sumRight;
        for (int i = 0; i < arr.length; i++) {
            sumLeft = 0;
            sumRight = 0;
            for (int j = 0; j <= i; j++) {
                sumLeft = sumLeft + arr[j];
            }
            for (int k = i+1; k < arr.length; k++) {
                sumRight = sumRight + arr[k];
            }
           if (sumLeft == sumRight){
                System.out.println("Сумма справа от " + (i+1) + " элемента " + " равна " + sumRight);
                System.out.println("Сумма слева равна " + sumLeft);
                return true;
            }
        }
        System.out.println("Нет места, где суммы слева и справа равны.");
        System.out.println();
        return false;
    }

    public static void taskSeven(int[]arr, int n){
        System.out.println("Задание 7.");
        System.out.println(Arrays.toString(arr));
        System.out.println("n = " + n);
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length-1];
                for (int j = arr.length-1; j > 0; j--) {
                    arr[j] = arr[j-1];
                }
                arr[0] = temp;
            }
        }
        if (n < 0){
            for (int i = 0; i > n; i--) {
                int temp = arr[0];
                for (int j = 0; j < arr.length-1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
