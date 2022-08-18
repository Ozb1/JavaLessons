package com.TeachMeSkill.Lesson7.FigureTask.Entity;


import com.TeachMeSkill.Lesson7.FigureTask.Service.Figure;

public class Circle extends Figure {

    final double Pi = 3.14;
    double circleRadius;
    double areaCircle;
    double perimetrCircle;
    public Circle(int circleRadius)
    {
        this.circleRadius = circleRadius;
    }
    @Override
    public double findSquare()
    {
        return areaCircle = Pi * Math.pow(circleRadius, 2);
    }
    @Override
    public double findPerimetr()
    {
        return  perimetrCircle = 2 * circleRadius * Pi;
    }
}
