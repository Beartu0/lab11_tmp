package org.example;

import java.util.ArrayList;

public class Marks <M extends Number>{

    public double orderAverage(ArrayList<M> list){
        double sum = 0;
        for (M value:list){
            sum+=(double)value;
        }
        return (double) sum/list.size();
    }
}
