package com.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoCerto {

    public static void main(String[] args){

        SortedSet<String> lista = new TreeSet<>();
        lista.add("Badas");
        lista.add("Gabriel");
        lista.add("Badaró");
        lista.add("Abriel");
        
        for (String Eu : lista) {
            System.out.println(Eu);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(2);
        nums.add(5);
        nums.add(8);
        nums.add(6);

        for (Integer n : nums) {
            System.out.println(n.toString());
            
        }
    }
    
}
