package com.TeachMeSkill.Lesson9;

public class VectorWithTwoCoords {
    public double x, y;
    static int N;
    public static final String twoCoordsVector ="This vector have two coords";
    public VectorWithTwoCoords(double[] arrayWithTwoCoords)
    {
        this.x = arrayWithTwoCoords[0];
        this.y = arrayWithTwoCoords[1];
    }
    public double arrayLongCheck()
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double scalarMultiplyVector(VectorWithTwoCoords vectorWithTwoCoords)
    {
        return x * vectorWithTwoCoords.x + y * vectorWithTwoCoords.y;
    }
    public VectorWithTwoCoords summVectorWithTwoCoords(VectorWithTwoCoords vectorWithTwoCoords)
    {
        return new VectorWithTwoCoords(new double[] {(x + vectorWithTwoCoords.x), (y + vectorWithTwoCoords.y)});
    }
    public VectorWithTwoCoords substractionVector(VectorWithTwoCoords vectorWithTwoCoords)
    {
        return new VectorWithTwoCoords (new double[] {(x - vectorWithTwoCoords.x),  (y - vectorWithTwoCoords.y)});
    }
    public void outputVector(VectorWithTwoCoords vectorWithTwoCoords)
    {
        System.out.println(twoCoordsVector + " " + vectorWithTwoCoords);
    }

    @Override
    public String toString() {
        return "VectorWithTwoCoords{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static double[] generateRandomArray(int longs)
    {
        double[] array = new double[longs];
        for(int i = 0; i <array.length; i++)
        {
            array[i] = Math.random();
        }
        return array;
    }
    public static VectorWithTwoCoords[] generateVectors(int n, int demension)
    {
        VectorWithTwoCoords[] vectors = new VectorWithTwoCoords[n];
        for(int i = 0 ; i < n; i++)
        {
            vectors[i] = new VectorWithTwoCoords(generateRandomArray(demension));
        }
        return vectors;
    }
    public void compairVectorLenght(VectorWithTwoCoords a, VectorWithTwoCoords b)
    {
        if(a.arrayLongCheck() < b.arrayLongCheck())
        {
            System.out.println("Long of vector B more than A " + b.arrayLongCheck() + " > " + a.arrayLongCheck());
        }
        else if(a.arrayLongCheck() > b.arrayLongCheck())
        {
            System.out.println("Long of vector A more than B " + a.arrayLongCheck() + " > " + b.arrayLongCheck());
        }
        else if (a.arrayLongCheck() == b.arrayLongCheck())
        {
            System.out.println("Long vectors A and B same: " + a.arrayLongCheck() + " = " + b.arrayLongCheck());
        }
    }

}
