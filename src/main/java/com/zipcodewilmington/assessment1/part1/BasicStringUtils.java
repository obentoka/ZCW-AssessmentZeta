package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        StringBuilder returnString = new StringBuilder(str);
        String capLetter = "" + str.charAt(0);
        returnString.replace(0,1, capLetter.toUpperCase());
        return returnString.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder returnString = new StringBuilder(str);
        return returnString.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        int unicode;
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            unicode = str.codePointAt(i);
            if(unicode > 90){
                returnString.append(str.toUpperCase().charAt(i));
            }else {
                returnString.append(str.toLowerCase().charAt(i));
            }
        }
        return returnString.toString();
    }
}
