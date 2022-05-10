package com.switchcase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class Calculator {

    static Scanner input = new Scanner(System.in);
    public double result;
    public static double nA;
    public static double nB;

    
    
    public static int chooseOP(){
        
        int opt;
        ArrayList<Integer> validOptions = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7)); 

        do{
            System.out.println("Selecione a opção desejada");
            System.out.printf("1) Adição \n2) Subtração \n3) Multiplicação \n4) Divisão \n5) Potência \n6) Raíz quadrada \n7) Logarítimo \n --------------------------------------- \n");
            opt = input.nextInt();
        }while(!validOptions.contains(opt));
        
        return opt;
        
    }

    public static double getUsersInput(String message){
        System.out.println(message);
        return input.nextDouble();   
    }

    private static void doMath(){
        double result = 0;
        int opt = chooseOP();
        
        if(opt == 7)
         nA = getUsersInput("Digite o número que gostaria de saber o logarítimo : ");
         else{
         nA = getUsersInput("Digite o Primeiro número: ");
         nB = getUsersInput("Digite o Segundo número: ");
         }

        switch (opt) {
            case 1 : {
                result = nA + nB;
                break;
            }
            case 2 : {
                result = nA - nB;
                break;
            }
            case 3 : {
                result = nA * nB;
                break;
            }
            case 4 : {
                result = nA / nB;
                break;
            }
            case 5 : {
                result = Math.pow(nA, nB);
                break;
            }
            case 6 : {
                result = Math.pow(nA, 1/nB);
                break;
            }
            case 7 : {
                result = Math.log10(nA);
            }
        }

        System.out.println("Resultado : " + result);
    
 }

    public static void run(){
        do{
            doMath();     
            System.out.printf("Deseja fazer outra operação ? \n (sim/nao) \n");   

        }while(askForContinue());
    }    

    public static boolean askForContinue(){
        Scanner input = new Scanner(System.in);
        String repeat = input.nextLine(); 
        if(repeat.equals("sim")){
             System.out.println("----------------------------------------");
             return true;
        }else{
             return false;
        }
 }
}
