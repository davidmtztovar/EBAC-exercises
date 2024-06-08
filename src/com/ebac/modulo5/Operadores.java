package com.ebac.modulo5;

public class Operadores {
	public static void main(String[] args) {
		 //Suma +
		int sumaNumA=9;
		int sumaNumB=7;	
		int sumaResultado= sumaNumA+sumaNumB+8+1;
		System.out.println("la sumatoria es: "+sumaResultado);
		
		//Resta -
		int restaNumA=-9;
		int restaNumB=12;	
		int restaResultado= restaNumA-restaNumB;
		System.out.println("la sumatoria es: "+restaResultado);
		
		//Multiplicacion *
		int multiNumA=7;
		int multiNumB=4;
		int multiResultado= multiNumA*multiNumB;
		System.out.println("la multiplicacion es: "+multiResultado);
		
		//Division /
		int divNumA=8;
		int divNumB=3;
		float divResultado= (float)divNumA/ divNumB;
		System.out.println("la division es: "+divResultado);
		double divResultadoD= (double)divNumA/ divNumB;
		System.out.println("la division almacenada en double: "+divResultadoD);
		
		//Precedencia de operaciones
		/**
		 * observacion: Al dividir 7 entre 2 y usar 7.0 en lugar de 7,
		 * estamos realizando una división con números decimales,
		 * lo que garantiza un resultado más preciso
		 */
		// () , * /, + -
		double operacionA= 9 * 7.0 / 2 - 8 + 15 * -2;
		double operacionB= (9 * (7.0 / 2)) - (8 + 15) * -2;
		System.out.println("Operacion A: "+operacionA);
		System.out.println("Operacion B: "+operacionB);
		
		//Operador de incremento
		int arboles=6;
		//arboles= arboles +1;
		arboles++;
		//arboles= arboles+1;
		arboles++;
		System.out.println("Arboles planatados: "+arboles);
		
		//Operador de Decremento
		int arbolesDeforestados = 10;
		// arboles= arboles -1;
		arboles--;
		// arboles= arboles-1;
		arboles--;
		System.out.println("Cuantos arboles quedan: " + arboles);
				
	   //Operadores de asignacion
		int valor=5;
//		valor= valor+4;
		valor+=4;
//		valor= valor*7;
		valor*=7;
//		valor= valor/2;
		valor/=2;
//		valor= valor-1;
		valor-=1;
		System.out.println("Valor: "+valor);
		
		//Operador modulo
		int modulo= 50%6;
		System.out.println("Residuo es: "+modulo);
		
		//Operadores Relacionales >, <, ==, !=
		int valorA= 8;
		int valorB= 8;
		boolean mayorQue= valorA > valorB;
		boolean menorQue= valorA < valorB;
		boolean igual= valorA == valorB;
		boolean distinto=  valorA != valorB;
		System.out.println("mayor que? "+mayorQue+"\nmenor que? "+menorQue+"\nigual? "
		+igual+"\ndistinto? "+distinto);
		
		//Operadores Logicos &&, ||, !
		boolean valorTrue= true;
		boolean valorFalse= false;
		boolean operadorAnd= valorTrue && valorFalse;
		boolean operadorOr= valorTrue || valorFalse;
		boolean negacion= !valorFalse;
		System.out.println("Resultado operacion AND: "+operadorAnd);
		System.out.println("Resultado operacion OR: "+operadorOr);
		System.out.println("Resultado operacion de negacion: "+negacion);
		
		
		
	}
  
	
	
}
