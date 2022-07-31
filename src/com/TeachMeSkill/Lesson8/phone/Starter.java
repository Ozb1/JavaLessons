package com.TeachMeSkill.Lesson8.phone;

public class Starter {
    public static void main(String[] args) {
        Phone samsung = new Phone( 8023255,"A51",350);
        Phone iphone = new Phone(80223235, "S4");
        Phone huawei = new Phone();

        System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(huawei);
        samsung.receiveCall("Andrei");
        samsung.getNumber();
        iphone.receiveCall("Vitalik");
        iphone.getNumber();
        huawei.receiveCall("Jena");
        iphone.receiveCall("Mother", 645949);
        huawei.receiveCall("Natasha");
        huawei.sendMessage(2154, 554121);

    }


}
