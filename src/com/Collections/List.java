package com.Collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args){

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Badas");
        lista.add(u1); // adicionar objeto existente
        lista.add(new Usuario("Badaró")); // adicionar novo objeto
        lista.add(new Usuario ("Badael"));
        lista.add(new Usuario("Gabriel"));

        System.out.println(lista.get(2)); // exibir o que está no index
        System.out.println(lista.contains("Tem ? " + new Usuario("Badas")));
        
        for (Usuario Eus : lista) {
            System.out.println(Eus.toString());
        }
        System.out.println("Removendo . . . " + lista.remove(2));
        System.out.println(lista.toString());
    }
    
}
