package com.TeachMeSkill.Lesson7.FigureTask.Entity;

import com.TeachMeSkill.Lesson7.FigureTask.Service.Figure;

public class Triangle extends Figure {

    double sideOneTriangle;
    double sideTwoTriangle;
    double sideThreeTriangle;
    double areaTriangle;
    double perimetrTriangle;
    public  Triangle(double sideOneTriangle, double sideTwoTriangle, double sideThreeTriangle)
    {
        this.sideOneTriangle = sideOneTriangle;
        this.sideTwoTriangle = sideTwoTriangle;
        this.sideThreeTriangle = sideThreeTriangle;
    }
    double halfPerimetr;
    @Override
    public double findSquare () {
        if(sideOneTriangle+sideTwoTriangle > sideThreeTriangle && sideTwoTriangle+sideThreeTriangle > sideOneTriangle
                && sideOneTriangle +sideThreeTriangle > sideTwoTriangle){
            halfPerimetr = (sideOneTriangle + sideTwoTriangle +
                    sideThreeTriangle) / 2;
            return areaTriangle = Math.sqrt(halfPerimetr * (halfPerimetr - sideOneTriangle) *
                    (halfPerimetr - sideTwoTriangle) * (halfPerimetr - sideThreeTriangle));
        }
        else{
            System.out.println("Wrong parametrs of triangle");
            return 0;
        }
    }
    @Override
    public double findPerimetr()
    {
        if(sideOneTriangle+sideTwoTriangle > sideThreeTriangle && sideTwoTriangle+sideThreeTriangle > sideOneTriangle
                && sideOneTriangle +sideThreeTriangle > sideTwoTriangle) {
            return perimetrTriangle = sideOneTriangle + sideTwoTriangle + sideThreeTriangle;
        }
        else{
            System.out.println("Wrong parametrs of triangle");
            return 0;
        }
    }
}