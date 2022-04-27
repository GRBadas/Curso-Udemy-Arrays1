package com.DesafioArray;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
       
     
        double[] notas = new double[5];

      for (int i =0; i < notas.length; i++) {
          System.out.println("Digite a nota " + (i + 1));
          notas[i] = input.nextDouble();
    }

    double total = 0;
    for (double nota : notas) {
        total += nota;  
    }
    double media = total/notas.length;
    
    System.out.printf("%s%n%s%n","total :" + total, "Média :" + media);
    input.close();
}
}
