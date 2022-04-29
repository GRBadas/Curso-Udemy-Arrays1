package com.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Pilha {

    public static void main(String[] args) {
        
        Deque<String> livros = new LinkedList<>();
        livros.add("Química");
        livros.push("Física");
        livros.push("Matemática");
        livros.push("Biologia");

     for (String livro : livros) {
            System.out.println(livros.pop());      
     }

    }
    
}
