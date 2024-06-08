package com.ebac.modulo4;

public class ArreglosBidimensionales {
	public static void main(String[] args) {
       int enterosBidimensional [][]= new int[3][4];
       enterosBidimensional[0][0]=1;
       enterosBidimensional[0][1]=2;
       enterosBidimensional[0][2]=3;
       enterosBidimensional[0][3]=4;
       
       enterosBidimensional[1][0]=5;
       enterosBidimensional[1][1]=6;
       enterosBidimensional[1][2]=7;
       enterosBidimensional[1][3]=8;
       
       enterosBidimensional[2][0]=9;
       enterosBidimensional[2][1]=10;
       enterosBidimensional[2][2]=11;
       enterosBidimensional[2][3]=12;
       
       System.out.println("Matriz con 3 filas y 4 columnas:\n"+
       enterosBidimensional[0][0]+" "+
       enterosBidimensional[0][1]+" "+
       enterosBidimensional[0][2]+" "+
       enterosBidimensional[0][3]+"\n"+
       enterosBidimensional[1][0]+" "+
       enterosBidimensional[1][1]+" "+
       enterosBidimensional[1][2]+" "+
       enterosBidimensional[1][3]+"\n"+
       enterosBidimensional[2][0]+" "+
       enterosBidimensional[2][1]+" "+
       enterosBidimensional[2][2]+" "+
       enterosBidimensional[2][3]);
       
       
	}
}
