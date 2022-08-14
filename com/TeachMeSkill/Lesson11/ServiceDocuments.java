package com.TeachMeSkill.Lesson11;

public class ServiceDocuments {
    String numberDocuments;
    public ServiceDocuments(String numberDocuments)
    {
        this.numberDocuments = numberDocuments;
    }
    public static String onlyLetters(String numberDocuments)
    {
        numberDocuments.replaceAll("[^a-z,A-Z]", " ").trim().toLowerCase();
        final String twoSpaces = "  ";
        final String oneSpace = " ";
        while (numberDocuments.contains(twoSpaces))
        {
            numberDocuments.replace(twoSpaces, oneSpace);
        }
        while (numberDocuments.contains(oneSpace))
        {
            numberDocuments.replace(oneSpace, "/");
        }
        return numberDocuments;
    }
    public static void splitDocs(String numberDocument)
    {
        String[] arrayOfBlocks = numberDocument.split("-");
        System.out.println("Two first blocks with numbers: " + arrayOfBlocks[0] + arrayOfBlocks[2]);
    }
    public static void replaceNumbers(String numberDocuments)
    {
        String changeSymbols1 = numberDocuments.replace("GDf", "***");
        String changeSymbols2 = changeSymbols1.replace("OdE", "***");
        System.out.println("Number of documents without letters: " + changeSymbols2);
    }
    public static StringBuffer stringBufferChangers(String numberDocuments)
    {
        StringBuffer sb = new StringBuffer(numberDocuments);
        sb = sb.replace(0,5,"");
        sb = sb.replace(3,9,"/");
        sb = sb.replace(7,9,"/");
        sb = sb.replace(9, 10, "/");
        return sb;
    }
}
