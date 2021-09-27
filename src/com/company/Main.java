package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myNums = {8, 4, 2, 5, 6, 7, 1, 9, 3};
        bubbleSort(myNums);

    }

    public static void bubbleSort(int[] arrayToBeSorted) {

        int thisInt;
        int nextInt;

        System.out.println(Arrays.toString(arrayToBeSorted));

        for(int j = 0; j < arrayToBeSorted.length - 1; j++) {
            boolean swapped = false;

            for (int i = 0; i < arrayToBeSorted.length - 1; i++) {

                thisInt = arrayToBeSorted[i]; // store the value at the index equal to current iteration
                nextInt = arrayToBeSorted[i + 1]; // store the value at the index equal to current iteration + 1

                // if this int is bigger than its neighbor to the right, swap them and set swap to true
                if (thisInt > nextInt) {
                    arrayToBeSorted[i + 1] = arrayToBeSorted[i];
                    arrayToBeSorted[i] = nextInt;
                    swapped = true;
                }

                System.out.println(Arrays.toString(arrayToBeSorted));
                System.out.println(swapped);

            }
            if(!swapped) {
                break; // if swapped is false that means nothings has been swapped this time around and the sort is finished
            }

        }
    }
}
