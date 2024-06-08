package com.ebac.modulo4;

public class Arreglos {
	public static void main(String[] args) {
        int enteros[]= new int[5];
        enteros[0]=10;
        enteros[1]=11;
        enteros[2]=12;
        enteros[3]=13;
        enteros[4]=14;
        
        System.out.println(enteros[2]);
        System.out.println(enteros[4]);
        
        System.out.println("logitud:"+enteros.length);
        
        String palabras[]= new String[] {"Mundo", "Hola", "Java"};
        String palabra1= palabras[1];
        String palabra2= palabras[0];
        String palabra3= palabras[2];
        String frase= palabra1.concat(palabra2).concat(palabra3);
        System.out.println(frase);
        
        /*
         * Bidimencionales o Matrices
         */
        //no es habitual pero puede haber matrices desbalanceadas
        //una fila de más elementos desbalancearía la matriz {11,12,13,14}
        int matriz[][]= new int[][] {
        	{5,6,7},
        	{8,9,10},
        	{11,12,13},
        	{11,12,13}
        };
        //x,y
        int valorNueve= matriz[1][1];
        int valorTrece= matriz[2][2];
        int valorSiete= matriz[0][2];
        System.out.println(valorNueve+" "+valorTrece+" "+valorSiete);
        
        int filas= matriz.length;
        int columnas=matriz[0].length;
        System.out.println("Filas: "+filas+" Columnas: "+columnas);
	}
}
