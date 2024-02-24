package com.ebac.modulo3;

public class MetodosClaseString {
	public static void main(String[] args) {
       String cursoBackendJava= "Curso Backend Java -EBAC";
       //Obtener caraccter de un String dada una posición
       char caracter= cursoBackendJava.charAt(2);
       System.out.println(caracter);
       
       //Comparacion de 2 Strings
       String variableConValorDirecto="Hola";
       //si no se usara "new String" ambas variables apuntarían al mismo espacio en memoria
       String variableConValorDuplicado=new String("Hola");
       String variableConMinusculas= "hola";
       
       boolean validacion1= variableConValorDirecto== variableConValorDuplicado;
       boolean validacion2= variableConValorDirecto.equals(variableConValorDuplicado);
       boolean validacion3= variableConValorDirecto.equalsIgnoreCase(variableConMinusculas);
       System.out.println("comparando referencias: "+validacion1);
       System.out.println("comparando valores: "+validacion2);
       System.out.println("comparando variables con equalsIgnoreCase: "+ validacion3);
       
       //Concatenacionde strings
       String cadenaA="hola ";
       String cadenaB="como estas?";
       System.out.println(cadenaA.concat(cadenaB));
       
       //isEmpty
       String cadenaC= " ";
       boolean esVacia = cadenaC.isEmpty();
       boolean noHayNada= cadenaC.isBlank();
       System.out.println("es vacia? "+ esVacia+"\nesta en blanco? "+noHayNada);
       
       int longitud= cursoBackendJava.length();
       System.out.println("longitud de variable cursoBackendJava: "+longitud);
       //substring
       String extracto1= cursoBackendJava.substring(14,18);
       String extracto2= cursoBackendJava.substring(6);
       System.out.println(extracto1 +"-"+ extracto2);
       
	}
}
