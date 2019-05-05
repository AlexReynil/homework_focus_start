package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        int n=3;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (i + 1) * 10 + (j + 1); ;
                System.out.print(array[i][j] );
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i != j) {
                    array[i][j] = array[i][j] + array[j][i];
                    array[j][i] = array[i][j] - array[j][i];
                    array[i][j] = array[i][j] - array[j][i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] );
            }
            System.out.println();
        }

    }
}
