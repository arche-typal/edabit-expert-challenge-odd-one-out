package com.company;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence. Each word will be converted in a string in an arraylist");
        String grabInput = in.nextLine();

        String[] splitSentenceIntoStringArraylist = grabInput.split(Pattern.quote(" "));
        //int[] numList = {};
        //List<HashMap<Integer,Integer>> numList = new ArrayList<HashMap<Integer, Integer>>();
        HashMap<Integer,Integer> numList = new HashMap<>();

        //System.out.println(splitSentenceIntoStringArraylist[0]);

        for (String aWord: splitSentenceIntoStringArraylist) {
            int aWordLength = aWord.length();
            //HashMap<Integer,Integer> =
            if (numList.containsKey(aWordLength)){
                numList.put(aWordLength,numList.get(aWordLength)+1);

            } else {
                //numList.add(<aWordLength,); //reference key, see if contains value
                //System.out.println("Wuterr");
                numList.put(aWordLength,1);
            }
            //System.out.println(numList);

        }

        if (numList.size() >2 || numList.size() <2) {
            System.out.println(false);
        } else{ //for each key value in HashMap
            /*for (Map.Entry<Integer,Integer> entry : numList.entrySet()) {
                if(entry.getValue() == 1){
                    System.out.println("true");
                } else {

                }
                //System.out.println(eachNum);
                //
                //if ()*/
            if (numList.containsValue(1)) {

                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }




    }
}
