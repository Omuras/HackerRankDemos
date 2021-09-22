package com.company.demos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int neg = 0, zer = 0, pos = 0;
        for (int numb : arr) {
            if (numb < 0) {
                neg++;
            } else if (numb == 0) {
                zer++;
            } else {
                pos++;
            }
        }
        System.out.format("%.6f\n", (double) pos / arr.size());
        System.out.format("%.6f\n", (double) neg / arr.size());
        System.out.format("%.6f\n", (double) zer / arr.size());
    }

    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0), max = arr.get(0);
        long totalMin = 0;
        long totalMax = 0;
        for (long number : arr) {
            if (min >= number){
                min = number;
            }
            if (max <= number){
                max = number;
            }
        }
        for (long number : arr) {
            if (number != min) {
                totalMax = Math.addExact(number, totalMax);
            }
            if (number != max) {
                totalMin = Math.addExact(number, totalMin);
            }
            //her eleman aynıysa check
        }
        System.out.print(totalMin + " " + totalMax);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\omurcan.arslan\\Desktop\\HackerrankTestCases\\input00.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\omurcan.arslan\\Desktop\\HackerrankTestCases\\output.txt"));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
