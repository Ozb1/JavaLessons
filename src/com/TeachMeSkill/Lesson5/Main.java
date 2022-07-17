package com.TeachMeSkill.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.trippleArray();
        main.chessDesk();
        main.multiplyTwoArrays();
        main.summTwoArrays();
        main.diagonalValue();
        main.arraySort();
    }
    public void trippleArray()
    {
        int[][][]  tripleArray = {{{3,2,5},{3,4,2}},{{2,1,6}},{{4,2,1},{2,4}}};
        System.out.println("Enter value for increase array value: ");
        Scanner scanner = new Scanner(System.in);
        int increaseValue = scanner.nextInt();
        for(int i = 0; i < tripleArray.length; i++) {
            for (int j = 0; j < tripleArray[i].length; j++) {
                for (int k = 0; k < tripleArray[j].length; k++) {
                    tripleArray[i][j][k] = tripleArray[i][j][k] + increaseValue;
                }
            }
        }
        System.out.println(Arrays.deepToString(tripleArray));
    }
    public void chessDesk()
    {
        String cube1 = " W ";
        String cube2 = " B ";

        String [][] array = new String[10][10];
        for(int i = 0; i < array.length; i++)
        {
            array[0][0] = cube1;
            for(int j = 1; j < array[i].length; j++)
            {
                if(array[i][0] == cube2 && i < 9)
                {
                    array[i + 1][0] = cube1;
                }
                else if (array[i][0] == cube1 && i < 9) {
                    array[i + 1][0] = cube2;
                }
                array[0][0] = cube1;
                if(array[i][j - 1] == cube1) {
                    array[i][j] = cube2;
                }
                else {
                    array[i][j] = cube1;
                }
            }

        }
        for (String[] strings : array) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }
    public void multiplyTwoArrays()
    {
        int[][] array1 = {{1,0,0},{0,1,0},{0,0,0}};
        int[][] array2 = {{1,2,3},{1,1,1},{0,0,0},{2,1,0}};
        int[][] array3 = new int[3][3];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                for(int k = 0; k <= 2; k++)
                {
                    array3[i][j] += array1[i][k]*array2[k][j];
                }
            }
        }
        for(int i = 0; i <= 2 ; i++)
        {
            for(int j = 0; j <= 2; j++)
            {
                System.out.print(array3[i][j] + " ");
            }
        }
    }
    public void summTwoArrays(){
        int[][] array1 ={{2,4,1},{2,6,5}, {1,7,4}};
        int result = 0;
        for (int[] ints : array1) {
            for (int j = 0; j < ints.length; j++) {
                result += ints[j];
            }
        }
        System.out.println("result is: " + result);
    }
    public void diagonalValue()
    {
        int[][] array = {{1,5,3,4}, {2, 5, 6, 5}, {2, 1, 1, 6},{9,7,9,10}};
        int index = array.length - 1;
        for(int i = 0; i <array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i <= index; i++)
        {
            System.out.print((array[i][i] + " "));
        }
        System.out.println();
    }
    public void arraySort() {
        int[][] array = {{1, 5, 3, 4}, {2, 5, 6, 5}, {2, 1, 1, 6}, {5, 7, 9, 10}};
        for(int i = 0; i < 15; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                for(int k = 0; k < array[j].length - 1; k++)
                {
                    if(array[j][k] < array[j][k+1])
                    {
                        int swap = array[j][k];
                        array[j][k] = array[j][k+1];
                        array[j][k+1] = swap;
                    }
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}