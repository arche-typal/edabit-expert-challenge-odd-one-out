package com.company;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence. Each word will be converted in a string in an arraylist");
        String grabInput = in.nextLine();

        String[] splitSentenceIntoStringArraylist = grabInput.split(Pattern.quote(" "));
        HashMap<Integer,Integer> numList = new HashMap<>();

        for (String aWord: splitSentenceIntoStringArraylist) {
            int aWordLength = aWord.length();
            if (numList.containsKey(aWordLength)){
                numList.put(aWordLength,numList.get(aWordLength)+1);
            } else {
                numList.put(aWordLength,1);
            }
        }

        if (numList.size() >2 || numList.size() <2) {
            System.out.println(false);
        } else{
            if (numList.containsValue(1)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
