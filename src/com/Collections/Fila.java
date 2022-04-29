package com.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args){

        Queue<String> fila = new LinkedList<>();
        fila.add("Badas");
        fila.offer("Badaró");
        fila.offer("Gab");
        fila.offer("Gabriel");

        System.out.println(fila.poll());
        System.out.println(fila.toString());

    }
    
}
