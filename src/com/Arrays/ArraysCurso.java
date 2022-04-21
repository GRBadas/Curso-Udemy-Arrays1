package com.Arrays;

import java.util.Arrays;

public class ArraysCurso{
    public static void main(String[] args){
        int a[][][] = new int[3][3][3];
        double[] b = {4.2, 6.7, 2.5};

        double totalB = 0;
        for (int i = 0; i < b.length; i++) {
            totalB += b[i];
        }
       

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(totalB);

    }
}