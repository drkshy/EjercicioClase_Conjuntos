package com.pperezm;
import java.util.*;


/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Practica de conjuntos evaluadora de unión, intersección y sub conjunto
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Character alfabeto = 65;
        int pares = 0;
            Set<Character> listaAlfabeto = new HashSet<>();
            for (int i=0; i<26; i++){
                listaAlfabeto.add((char) (alfabeto +i));
            }

            Iterator value = listaAlfabeto.iterator();
        System.out.println("Los valores de la lista alfabetica son: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
            /*
       for (Object object : alfabeto) {
           System.out.println(object);
        }
*/
       SortedSet<Integer> listaPares = new TreeSet<>();
       pares = 1;
        while(pares <= 400){
            if(pares % 2 == 0){
               listaPares.add(pares);
            }
            pares++;
        }

        Iterator valuePares = listaPares.iterator();
        System.out.println("Los valores de la lista de pares es: ");
        while (valuePares.hasNext()) {
            System.out.println(valuePares.next());

       }
        int valorInferior = -300;
        int valorSuperior = 400;
        SortedSet<Integer> negativos = new TreeSet<>();
        for (int j=0; j<=valorSuperior; j++)
        {
            negativos.add(valorInferior+j);
        }
        Iterator valoresNeg = negativos.iterator();
        System.out.println("Los valores de la lista de negativos a positivos es: ");
        while (valoresNeg.hasNext()) {
            System.out.println(valoresNeg.next());

        }
        listaPares.addAll(negativos);
        System.out.println("Los pares contienen " + listaPares);
        System.out.println("Los negativos contienen " + negativos);

        negativos.retainAll(listaPares);
        System.out.println("Los pares contienen " + listaPares);
        System.out.println("Los negativos contienen " + negativos);
        System.out.println("Elementos en negativos entre 20 y 100 " + negativos.subSet(-20,100));

        //Fin del programa

    }

}
