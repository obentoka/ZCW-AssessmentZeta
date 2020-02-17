package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for(Object i : objectArray){
            if(i.equals(objectToCount)){
                counter ++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer objToRemove = (Integer)objectToRemove;
        Integer[] objectArrayAsInterger = (Integer[]) objectArray.clone();
        int numOccurance = getNumberOfOccurrences(objectArray, objectToRemove);
        Integer[] returnObjectArray = new Integer[objectArray.length-numOccurance];
        int newObjectCounter = 0;
        for(Integer i : objectArrayAsInterger){
            if(!i.equals(objToRemove)){
                returnObjectArray[newObjectCounter] = (Integer) i;
                newObjectCounter++;
            }
        }
        return returnObjectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostObject = new Object();
        int mostCounter = 0;
        int numcounter = 0;
        for(Object i : objectArray){
            for(Object k : objectArray){
                if(i.equals(k)){
                    numcounter++;
                }
            }
            if(numcounter > mostCounter){
                mostCounter = numcounter;
                mostObject = i;
            }
            numcounter = 0;
        }
        return mostObject;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastObject = new Object();
        int leastCounter = objectArray.length;
        int numcounter = 0;
        for(Object i : objectArray){
            for(Object k : objectArray){
                if(i.equals(k)){
                    numcounter++;
                }
            }
            if(numcounter < leastCounter){
                leastCounter = numcounter;
                leastObject = i;
            }
            numcounter = 0;
        }
        return leastObject;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] returnArray = new Integer[objectArray.length + objectArrayToAdd.length];
        Integer[] objectArrayInt = (Integer[]) objectArray;
        Integer[] objectArrayToAddInt = (Integer[]) objectArrayToAdd;
        int counter = 0;
        for(Integer i : objectArrayInt){
            returnArray[counter] = i;
            counter++;
        }
        for(Integer i : objectArrayToAddInt){
            returnArray[counter] = i;
            counter++;
        }
        return returnArray;
    }
}
