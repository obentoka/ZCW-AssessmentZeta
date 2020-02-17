package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int oddCounter = 0;
        for(Integer i : ints){
            if(i % 2 != 0){
                oddCounter++;
            }
        }
        Integer[] returnArray = new Integer[oddCounter];
        int returnCounter = 0;
        for(Integer i : ints){
            if(i % 2 != 0){
                returnArray[returnCounter] = i;
                returnCounter++;
            }
        }
        return returnArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int evenCounter = 0;
        for(Integer i : ints){
            if(i % 2 == 0){
                evenCounter++;
            }
        }
        Integer[] returnArray = new Integer[evenCounter];
        int returnCounter = 0;
        for(Integer i : ints){
            if(i % 2 == 0){
                returnArray[returnCounter] = i;
                returnCounter++;
            }
        }
        return returnArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int notMultiple3 = 0;
        for(Integer i : ints){
            if(i % 3 != 0){
                notMultiple3++;
            }
        }
        Integer[] returnArray = new Integer[notMultiple3];
        int returnCounter = 0;
        for(Integer i : ints){
            if(i % 3 != 0){
                returnArray[returnCounter] = i;
                returnCounter++;
            }
        }
        return returnArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int notMultipleN = 0;
        for(Integer i : ints){
            if(i % multiple != 0){
                notMultipleN++;
            }
        }
        Integer[] returnArray = new Integer[notMultipleN];
        int returnCounter = 0;
        for(Integer i : ints){
            if(i % multiple != 0){
                returnArray[returnCounter] = i;
                returnCounter++;
            }
        }
        return returnArray;
    }
}
