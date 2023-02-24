package com.knoldus;

public class StringReverseAndLength {
    // Creating a method for getting/finding length of given String.
    public void getLengthOfString(String inputString){

        // Initializing length of the String
        int lengthOfString=0;
        //Using .toCharArray() to convert the string into character and finding the length of it.;

        for (char Stringtochar : inputString.toCharArray()){

            lengthOfString++;

        }
        //return length of String;
        System.out.println("The Length of String is: " + lengthOfString);
    }

        // Creating a method for Finding the reverse of the given string.
    public void reverseOfString(String inputString){
        // Taking an empty string so that we can store reversed String into it.
        String reversedString = "";
        for (int lengthCounter = inputString.length()-1;lengthCounter>=0;lengthCounter--){
            reversedString+=inputString.charAt(lengthCounter);
        }
        System.out.println("The Reverse of the String is: " + reversedString);
    }
}
