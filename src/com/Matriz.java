package com;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos : ");
        int qteAlunos = input.nextInt();
        System.out.println("Digite a quantidade de notas por alunos : ");
        int qteNotas = input.nextInt();

        int registro[][] = new int[qteAlunos][qteNotas];

        double total = 0;
        for (int a = 0; a < registro.length; a++) {
            for (int n = 0; n < registro[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d: ", (n + 1), (a + 1),"%n");
                registro[a][n] = input.nextInt();
                total += registro[a][n];
            }
            
        }
        double media =  total / (qteAlunos*qteNotas);
        System.out.println("Média da turma : " + media);
        for (int[] notasDaGalera : registro) { 
            System.out.println(Arrays.toString(notasDaGalera));
        }
        input.close();
    }
    
}
