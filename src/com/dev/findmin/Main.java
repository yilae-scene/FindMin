package com.dev.findmin;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write code here
        int len = readInteger();
        int [] intArrays = readElements(len);
        System.out.println(Arrays.toString(intArrays));
        System.out.println("Min: "+findMin(intArrays));
    }
    private static int readInteger() {
        System.out.println("How many elements do you want in the arrays?");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static int[] readElements(int len) {
        int[] arrays = new int[len];
        int x = 0;
        while (x < len) {
            System.out.println(" put your numbers");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            arrays[x] = input;
            x++;
        }
        return arrays;
    }

    public static int findMin(int[] arrays) {
        int min = arrays[0];
        for (int i : arrays) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}