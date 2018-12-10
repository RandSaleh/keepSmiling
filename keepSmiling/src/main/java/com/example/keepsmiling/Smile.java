package com.example.keepsmiling;

import java.util.ArrayList;
import java.util.Random;

public class Smile {
    //////// 5
    static ArrayList<String> dataSourceJokes = new ArrayList<String>();
    public Smile() {
       dataSourceJokes.add("Why are iPhone chargers not called Apple Juice?!");
       dataSourceJokes.add("Q: How many programmers does it take to change a light bulb? \n" +
               "A: None. It's a hardware problem.");
       dataSourceJokes.add(" Why can't cats work on the computer? \n" +
               "A: They get too distracted chasing the mouse around. ");


       dataSourceJokes.add("Q: Why do programmers always mix up Halloween and Christmas? \n" +
               "A: Because 31 OCT = 25 DEC.");

       dataSourceJokes.add("Q. How does a computer get drunk?\n" +
               "\n" +
               "A. It takes screenshots.\n");
    }
public String getJoke(){

    return dataSourceJokes.get(randInt());

}


    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt(5);
        System.out.println("test1"+randomNum);
        return randomNum;
    }



}
