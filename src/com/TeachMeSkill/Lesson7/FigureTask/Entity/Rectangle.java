package com.TeachMeSkill.Lesson7.FigureTask.Entity;

import com.TeachMeSkill.Lesson7.FigureTask.Service.Figure;

public class Rectangle extends Figure {
    int fistSideRectangle;
    int secondSideRectangle;
    int areaRectangle;
    int perimetrRectangle;
    public Rectangle(int fistSideRectangle, int secondSideRectangle)
    {
        this.fistSideRectangle = fistSideRectangle;
        this.secondSideRectangle = secondSideRectangle;
    }
    @Override
    public double findSquare()
    {
        return areaRectangle = fistSideRectangle * secondSideRectangle;
    }
    @Override
    public double findPerimetr()
    {
        return perimetrRectangle = 2 * fistSideRectangle + 2 * secondSideRectangle;
    }

}