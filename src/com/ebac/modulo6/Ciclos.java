package com.ebac.modulo6;

import java.util.Iterator;

public class Ciclos {
	public static void main(String[] args) {
       //Ciclo for
		for (int i = 0; i < 5; i++) {
			System.out.println("Numero i: " + i);
		}
		
		for (int i = 5; i > 0; i--) {
			System.out.println("Numero i: " + i);
		}
		
		int[] arreglo= new int[] {0,1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("Valor del arreglo en indice "
		                       +i+" es: "+arreglo[i]);
		}
		//Ciclo foreach
		for (int entero : arreglo) {
			System.out.println("Elemento del arreglo: "+ entero);
		}
		String[] strings= new String[] {"Curso","BackEnd","Java","EBAC"};
        for (String elemento : strings) {
			System.out.print(elemento+" ");
		}	
        
        //Ciclo while
        int i=0;
        while(i<=5) {
        	System.out.println("valor de i: "+i);
        	++i;
        	
        }
        
        int j=0;
        //primero se obtiene el valor de j y despues se incrementa
        while((j++)<=5) {
        	System.out.println("valor de j: "+j);
        	
        }
	}
}
