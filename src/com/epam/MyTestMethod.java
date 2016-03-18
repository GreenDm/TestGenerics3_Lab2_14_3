package com.epam;

/**
 * Created by Hrinchenko on 18.03.2016.
 */
public class MyTestMethod {
    public static <T extends Comparable> int calcNum(T[] arr, T elem) {
        int count = 0;
        for (T arrayElement : arr) {
            if (arrayElement.compareTo(elem) > 0) {
                count++;
            }

        }
        return count;

    }

    public static <T extends Number & Comparable> double calcSum(T[] arr, T maxval) {

       double sum = 0;
        for (T element:arr) {

            if(element.compareTo(maxval)> 0){

    sum += element.doubleValue();
}
               }


return sum;
        }
    }


