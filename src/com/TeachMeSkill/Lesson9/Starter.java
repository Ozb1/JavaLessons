package com.TeachMeSkill.Lesson9;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.println("Enter value of X for two coords vector");
    double x = value.nextDouble();
    System.out.println("Enter value of Y for two coords vector");
    double y = value.nextDouble();
    double[] array1 = new double[]{x,y};
    System.out.println("Enter value of X for two coords vector");
    double x1 = value.nextDouble();
    System.out.println("Enter value of Y for two coords vector");
    double y1 = value.nextDouble();
    double[] array2 = new double[]{x1,y1};

    VectorWithTwoCoords vector1 = new VectorWithTwoCoords(array1);
    VectorWithTwoCoords vector2 = new VectorWithTwoCoords(array2);
    vector1.outputVector(vector2);
    System.out.println(vector1.arrayLongCheck());
    System.out.println(vector1.substractionVector(new VectorWithTwoCoords(array2)));
    System.out.println(vector1.scalarMultiplyVector(new VectorWithTwoCoords(array2)));
    System.out.println(vector1.summVectorWithTwoCoords(new VectorWithTwoCoords(array2)));

    System.out.println("Enter value of X for three coords vector");
    x = value.nextDouble();
    System.out.println("Enter value of Y for three coords vector");
    y = value.nextDouble();
    System.out.println("Enter value of Z for three coords vector");
    double z = value.nextDouble();
    array1 = new double[]{x,y,z};
    VectorWithThreeCoords vectorWithThreeCoords = new VectorWithThreeCoords(array1);
    vectorWithThreeCoords.outputVector(vectorWithThreeCoords);
    vectorWithThreeCoords.SummVectorWithThreeCoords(vectorWithThreeCoords);
    }
}
