package com.TeachMeSkill.Lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.twoArrays();
        main.contain();
        main.arrayWithNotEven();
        main.randomArrayEnterdUser();
        main.deleteAllInput();
        main.randomNumber();

    }
    public void twoArrays()
    {
        int[] array1 = {1, 5, 2, 4, 6};
        int[] array2 = {2, 6, 7, 8, 9};
        double averageNum1 = 0;
        double averageNum2 = 0;
        System.out.print("Array 1 is: ");
        for(int i = 0; i < array1.length; i++)
        {
            averageNum1 = averageNum1 + array1[i];
            System.out.print("[ " + array1[i] + " ]");
        }
        System.out.println();
        System.out.print("Array 2 is: ");
        for(int i = 0; i < array2.length; i++)
        {
            averageNum2 = averageNum2 + array2[i];
            System.out.print("[ " + array2[i] + " ]");
        }
        System.out.println();
        averageNum2 = averageNum2 / 5;
        averageNum1 = averageNum1 / 5;
        if(averageNum1 > averageNum2)
        {
            System.out.println(" Average Number of array 1 bigger: " + averageNum1 + " to " + averageNum2);
        }
        else if (averageNum2 > averageNum1)
        {
            System.out.println(" Average Number of array 2 bigger: " + averageNum2 + " to " + averageNum1);
        }
        else {
            System.out.println("Arrays average value are same.");
        }
    }
    public void randomNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int sizeArray = scanner.nextInt();
        double averageNumber = 0;
        int maxRange = 10;
        int minRange = 1;
        int range = maxRange - minRange + 1;
        int[] array = new int[sizeArray];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * range) + minRange;
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("[ " + array[i] + " ]");
        }
        int minNumber = array[0];
        int maxNumber = array[0];
        for(int i = 0; i <array.length; i++)
        {
            if(array[i] > maxNumber)
            {
                maxNumber = array[i];
            }
            if(array[i] < minNumber)
            {
                minNumber = array[i];
            }
            averageNumber = averageNumber + array[i];
        }
        System.out.println("Min number is: " + minNumber + " Max number is: " + maxNumber + " average number is: " + (averageNumber/sizeArray));
    }
    public void deleteAllInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search number: ");
        int searchNumber = scanner.nextInt();
        int[] array = {2, 4, 5, 2, 3, 4, 1};
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (searchNumber != array[i])
            {
                count++;
            }
        }
        int[] secondArray = new int[count];
        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if (searchNumber != array[i]) {
                secondArray[index] = array[i];
                index++;
            }
        }
        for(int i = 0; i < secondArray.length; i++)
        {
            System.out.print("[ " +secondArray[i] + " ]");
        }
    }
    public void contain()
    {
        int[] array = {4, 3, 6, 7, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search number: ");
        int searchNumber = scanner.nextInt();
        int compareNumber = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == searchNumber)
            {
                System.out.println("Search number contain in array");
                compareNumber = searchNumber;
            }
        }
        if(compareNumber != searchNumber)
        {
            System.out.println("This array didnt contain search number");
        }
    }
    public void randomArrayEnterdUser()
    {
        System.out.println("Enter Size of array: ");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();

        while (sizeArray <= 5 || sizeArray > 10) {
            System.out.println("Wrong value enter again: ");
            sizeArray = scanner.nextInt();
        }
        int[] array = new int[sizeArray];
        int maxRange = 10;
        int minRange = 1;
        int range = maxRange - minRange + 1;
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * range) + minRange;
            if(array[i]% 2 == 0)
            {
                count++;
            }
        }
        int[] evenArray = new int[count];
        for(int i = 0, j = 0; i < array.length; i++)
        {
            if(array[i]% 2 == 0)
            {
                evenArray[j] = array[i];
                j++;
            }
        }
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int j : evenArray) {
            System.out.print(j + " ");
        }

    }
    public void arrayWithNotEven()
    {
        int[] array = {2,5,4,3,6,5,7,34};
        for (int j : array) {
            System.out.print(j + " ");
        }
        for(int i = 0; i < array.length; i = i + 2)
        {
            array[i] = 0;
        }
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
