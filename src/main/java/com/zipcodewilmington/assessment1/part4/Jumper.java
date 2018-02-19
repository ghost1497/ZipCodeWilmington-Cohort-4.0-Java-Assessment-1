package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpCounter = 0;
        int height = k;
        while (height > 0) {
            if (height > 1 && height >= j) {
                height -= j;
                jumpCounter++;
            } else {
                height -= 1;
                jumpCounter++;
            }
        }
        return jumpCounter;
    }
}
