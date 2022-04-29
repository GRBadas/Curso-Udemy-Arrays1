package com.Collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        
        HashSet<Usuario> usuarios = new HashSet<Usuario>(); 

        usuarios.add(new Usuario("Badas"));
        usuarios.add(new Usuario("Badaró"));
        usuarios.add(new Usuario("Badinhas"));
        usuarios.add(new Usuario("Bundama"));


        boolean resultado = usuarios.contains(new Usuario("Badas"));
        System.out.println(resultado);

    }
    
}
