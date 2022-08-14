package com.TeachMeSkill.Lesson12;

import java.io.*;

public class Starter {
    public static void main(String[] args) {
        String[] numbersDocument = new String[] {"docnum43524tret", "contract125er3r", "docnum99999tret",
                "35erwerewrfsd54", "docnum4354444et"};
        try{
            PrintStream printStream = new PrintStream("text.txt");
            for(int i = 0; i < numbersDocument.length; i++) {
                if(numbersDocument[i].toCharArray().length == 15 && numbersDocument[i].startsWith("docnum") ||
                        numbersDocument[i].startsWith("contract")) {
                    printStream.println(numbersDocument[i]);
                }
                else {
                    System.out.println("Number of document is not valid " + numbersDocument[i]);
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        try{File reader = new File("text.txt");
            FileReader fileReader = new FileReader(reader);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}