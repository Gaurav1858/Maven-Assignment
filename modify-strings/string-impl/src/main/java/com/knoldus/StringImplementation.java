package com.knoldus;
import java.util.*;
import java.lang.*;
public class StringImplementation {
    public static void main(String[] args) {
        // Taking User Input from the user as a String, which he/she wants to reverse.
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a String to find length and to reverse: ");
        String input = scannerObj.nextLine();

        // Using Dependencies, we are creating object of StringReverseAndLength and by using
        // that object we are calling methods of StringReverseAndLength

        StringReverseAndLength implementation = new StringReverseAndLength();
        //calling methods
        implementation.getLengthOfString(input);
        implementation.reverseOfString(input);
    }
}
