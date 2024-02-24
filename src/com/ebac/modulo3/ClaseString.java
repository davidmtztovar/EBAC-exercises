package com.ebac.modulo3;

public class ClaseString {
	public static void main(String[] args) {
      String variableNonIcializada;
      
      String variableConValorDirecto= "Hola";
      String variableConValorDuplicado= "Hola";
      
      String variableConValorPorConstructor= new String("Hola");
      String variableConValorDuplicado2= new String("Hola");
      
      boolean expresion1= variableConValorDirecto== variableConValorDuplicado;
      boolean expresion2= variableConValorPorConstructor== variableConValorDuplicado2;
      boolean expresio3= variableConValorPorConstructor.equals(variableConValorDuplicado2);
      
      System.out.println("variableConValorDirecto y variableConValorDuplicado tienen la misma referencia en memoria por lo que expresion1= "
      		+ expresion1);
      
      System.out.println("comparando contenido de variables con metodod equals: "+expresio3);
	}
}
