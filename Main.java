package org.example;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Marks<Integer> marks = new Marks<>();

        ArrayList<Integer> aryint = new ArrayList<>();
        aryint.add(1);
        aryint.add(2);
        printArrayListElements(aryint);
        ArrayList<Double> aryDouble = new ArrayList<>();
        aryDouble.add(1.2);
        aryDouble.add(2.1);
        printArrayListElements(aryDouble);
        ArrayList<String> arystring = new ArrayList<>();
        arystring.add("Hello");
        arystring.add("Ezgi Hocams ");
        printArrayListElements(arystring);

        SurveyResponse<String> surveyResponse = new SurveyResponse<>();
        SurveyResponse<Integer> intSurvey = new SurveyResponse<>();
        int[] intData = {5, 3, 4, 5, 2};
        for (int num : intData) {
            intSurvey.addResponse(num);
        }
        System.out.println("Integer Survey:");
        intSurvey.printResponses();
        intSurvey.analyze();

        // Character test
        SurveyResponse<Character> charSurvey = new SurveyResponse<>();
        char[] charData = {'A', 'b', 'E', 'f', 'O'};
        for (char ch : charData) {
            charSurvey.addResponse(ch);
        }
        System.out.println("Character Survey:");
        charSurvey.printResponses();
        charSurvey.analyze();

        // String test
        SurveyResponse<String> stringSurvey = new SurveyResponse<>();
        String[] strData = {"Yes", "no", "Maybe", "No", "Absolutely"};
        for (String str : strData) {
            stringSurvey.addResponse(str);
        }
        System.out.println("String Survey:");
        stringSurvey.printResponses();
        stringSurvey.analyze();
        Marks<Integer> marks1 = new Marks<>();




    }
    public static <Thing> void printArrayListElements(ArrayList<Thing> array){
        for (Thing x:array){
            System.out.println("Your variable "+x);
        }
    }
}