package src.com.TrachMeSkill.Lesson17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IpAdressValidService ipAdressValidService = new IpAdressValidService();
        System.out.println("Enter IP - adress:");
        Scanner scanner = new Scanner(System.in);
        String ipAdress = scanner.nextLine();
        System.out.println(ipAdressValidService.validate(ipAdress));
    }
}