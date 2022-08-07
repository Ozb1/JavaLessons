package com.TeachMeSkill.Lesson10;

import java.util.Locale;
import java.util.Scanner;

public class Document {
    public static void main(String[] args) {
        String numberDocument = "4568-GDf-4789-OdE-4A6e";
        ServiceDocuments.splitDocs(numberDocument);
        ServiceDocuments.replaceNumbers(numberDocument);
        ServiceDocuments.onlyLetters(numberDocument);
        System.out.println(ServiceDocuments.stringBufferChangers(numberDocument.toUpperCase(Locale.ROOT)));
        System.out.println(numberDocument.toLowerCase(Locale.ROOT).contains("abc"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check start: ");
        String value = scanner.nextLine();
        System.out.println(numberDocument.startsWith(value));
        System.out.println("Check end: ");
        value = scanner.nextLine();
        System.out.println(numberDocument.endsWith(value));
    }


}
