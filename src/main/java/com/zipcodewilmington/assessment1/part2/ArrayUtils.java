package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        return (int) Arrays.stream(objectArray)
                .filter(x -> x.equals(objectToCount)).count();
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        return Arrays.stream(objectArray)
                .filter(x -> !x.equals(objectToRemove))
                .toArray(Integer[]::new);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostObject = null;
        int mostCounter = 0;
        for(Object i : objectArray) {
            int xOccurance = getNumberOfOccurrences(objectArray, i);
            if( xOccurance > mostCounter){
                mostCounter = xOccurance;
                mostObject = i;
            }
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
        for(Object i : objectArray){
            int xOccurance = getNumberOfOccurrences(objectArray, i);
            if( xOccurance < leastCounter){
                leastCounter = xOccurance;
                leastObject = i;
            }
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
        List<Object> listObj = new ArrayList<>(Arrays.asList(objectArray));
        listObj.addAll(Arrays.stream(objectArrayToAdd)
                .collect(Collectors.toList()));
        return listObj.toArray(new Integer[0]);
    }
}
