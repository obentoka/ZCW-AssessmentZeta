package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        if(j <= k && j > 1) {
            int justALittle = k % j;
            int maxJumpsWith2ndType = (k - justALittle) / j;
            return maxJumpsWith2ndType + justALittle;
        }else
            return k;
    }
}
