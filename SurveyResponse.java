package org.example;

import java.util.ArrayList;

public class SurveyResponse<Thing> {
    private ArrayList<Thing> array;
    private int counter = 0;
    private ArrayList<Thing> responses;
    public SurveyResponse() {
        responses = new ArrayList<>();
    }

    public void addResponse(Thing response){
        responses.add(response);
        counter++;
    }
    public int countResponses(){
        return responses.size();
    }
    public void printResponses(){
        System.out.println(counter);
    }
    public void analyze() {
        if (responses.isEmpty()) {
            System.out.println("No responses to analyze.");
            return;
        }

        Thing first = responses.get(0);

        if (first instanceof Integer) {
            int sum = 0;
            for (Thing response : responses) {
                sum += (Integer) response;
            }
            double average = (double) sum / responses.size();
            System.out.println("Average: " + average);
        } else if (first instanceof Character) {
            int vowelCount = 0;
            for (Thing response : responses) {
                char ch = Character.toLowerCase((Character) response);
                if ("aeiou".indexOf(ch) >= 0) {
                    vowelCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
        } else if (first instanceof String) {
            int upperCount = 0;
            for (Thing response : responses) {
                String str = (String) response;
                if (!str.isEmpty() && Character.isUpperCase(str.charAt(0))) {
                    upperCount++;
                }
            }
            System.out.println("Responses starting with uppercase: " + upperCount);
        } else {
            System.out.println("Unsupported type for analysis.");
        }
    }
}
