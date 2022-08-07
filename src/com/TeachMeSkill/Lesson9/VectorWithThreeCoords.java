package com.TeachMeSkill.Lesson9;

public class VectorWithThreeCoords extends VectorWithTwoCoords {
    public static final String threeCoordsVector ="This vector have three coords";
    public double z;
    public VectorWithThreeCoords(double[] arrayWithThreeCoords)
    {
        super(arrayWithThreeCoords);
       this.z = arrayWithThreeCoords[2];
    }
    public double arrayLongCheck()
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z, 2));
    }
    public double scalarMultiplyVector(VectorWithThreeCoords vectorWithThreeCoords)
    {
        return x * vectorWithThreeCoords.x + y * vectorWithThreeCoords.y + z * vectorWithThreeCoords.z;
    }
    public VectorWithThreeCoords SummVectorWithThreeCoords(VectorWithThreeCoords vectorWithThreeCoords)
    {
        return new VectorWithThreeCoords(new double[] {(x + vectorWithThreeCoords.x), (y + vectorWithThreeCoords.y),
                (z + vectorWithThreeCoords.z)});
    }
    public VectorWithThreeCoords SubstractionVector(VectorWithThreeCoords vectorWithThreeCoords)
    {
        return new VectorWithThreeCoords (new double[] {(x - vectorWithThreeCoords.x),  (y - vectorWithThreeCoords.y),
                (z - vectorWithThreeCoords.z)});
    }
    public void outputVector(VectorWithTwoCoords vectorWithTwoCoords)
    {
        System.out.println(threeCoordsVector + " " + vectorWithTwoCoords);
    }

    @Override
    public String toString() {
        return "VectorWithThreeCoords{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void compairVectorLenght(VectorWithThreeCoords a, VectorWithThreeCoords b)
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
