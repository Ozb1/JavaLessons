package com.TeachMeSkill.Lesson6;

import com.TeachMeSkill.Lesson6.Computer.Computer;
import com.TeachMeSkill.Lesson6.Computer.HDD;
import com.TeachMeSkill.Lesson6.Computer.RAM;
import com.TeachMeSkill.Lesson6.CreditCard.CreditCard;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard(247534759, 2500);
        CreditCard creditCard2 = new CreditCard(3423543,3250);
        CreditCard creditCard3 = new CreditCard(2342341, 5400);
        creditCard1.AddSummIntoCard();
        creditCard2.AddSummIntoCard();
        creditCard3.WithdrawSummFromCard();
        creditCard1.InformationCount();
        creditCard2.InformationCount();
        creditCard3.InformationCount();
        HDD hDD = new HDD();
        RAM rAM = new RAM();

        Computer computer1 = new Computer("GCG", 5500);
        computer1.OutputFullInformation();
        Computer computer2 = new Computer("HGG",5600, hDD, rAM);
        computer2.OutputFullInformation();


    }
}
