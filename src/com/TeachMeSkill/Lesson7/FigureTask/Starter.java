package com.TeachMeSkill.Lesson7.FigureTask;

import com.TeachMeSkill.Lesson7.FigureTask.Entity.Circle;
import com.TeachMeSkill.Lesson7.FigureTask.Service.Figure;
import com.TeachMeSkill.Lesson7.FigureTask.Entity.Rectangle;
import com.TeachMeSkill.Lesson7.FigureTask.Entity.Triangle;

public class Starter {
        public static void main(String[] args) {
                Rectangle rectangleOne = new Rectangle(6, 4);
                Circle circleOne = new Circle(6);
                Triangle triangleOne = new Triangle(7, 5, 4);
                Triangle triangleTwo = new Triangle(7, 6, 4);
                Triangle triangleThree = new Triangle(8, 5, 4);
                double summSquareFigure = 0;
                Figure[] figures = {rectangleOne, circleOne, triangleOne,
                                triangleTwo, triangleThree};
                for(int i = 0; i < figures.length; i++)
                {
                        summSquareFigure = summSquareFigure + figures[i].findSquare();
                }
                System.out.println("Summ of all figures = " + summSquareFigure);
        }
}
