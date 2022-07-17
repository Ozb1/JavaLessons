package com.TeachMeSkill.Lesson4;

import java.util.Arrays;

public class mainClassWork {
    public static void main(String[] args) {

        int[] array = {1, 6, 7, 2, 4};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            System.out.println(array[i]);
        }

    }
}
