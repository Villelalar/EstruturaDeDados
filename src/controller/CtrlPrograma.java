package controller;

import java.util.Scanner;

public class CtrlPrograma {

// Ex 1
	/* public static void verificador(int[] array) {
		for (int i=0; i<20; i++) {
			if(array[i] % 2 == 0) {
				System.out.println("Par " + array[i]);
			}
			else {
				System.out.println("impar "+ array[i]);
			}
		}
	}*/
	
// Ex 2 
//	public static void verificador(int[] array, int numeroescolhida) {
//		for(int i=0;i<10;i++) {
//			if(array[i] == numeroescolhida) {
//				System.out.println("VOCÊ JÁ COLOCOU ESSE NUMERO");
//			}
//		}
//	}
	public static void verificador(int[] array, int numeroescolhido, int contador) {
		for(int i=0;i<10;i++) {
			if(array[i] == numeroescolhido) {
				System.out.println("VOCÊ JÁ COLOCOU ESSE NUMERO NA POSIÇÃO" + i);
				contador++;
			}
			System.out.println("Contador é igual a " +contador);
			
	}
		
	}
	
	public static void main(String[] args) {
		
		
// Ex 1 		
//		Scanner sc = new Scanner (System.in);
//		int[] array= new int[20];
//		 
//		for(int i= 0; i<20; i++) {
//			System.out.println("Qual é o número");
//			int numero = sc.nextInt();
//			array[i] = numero; 
//		}
//        System.out.println("\n--- Resultado da Verificação ---");
//        verificador(array);
//        sc.close();

		
//EX 2 
//		Scanner sc = new Scanner (System.in);
//		int[] array= new int[10];
//		
//		for(int i= 0; i<10; i++) {
//		System.out.println("Qual é o número");
//		int numero = sc.nextInt();
//		array[i] = numero; 
//	    }
//		
//		System.out.println("Qual é o numero escolhido");
//		int numeroEscolhido = sc.nextInt();
//		
//		
//		verificador(array,numeroEscolhido);
//		sc.close();
//	
//		
		int contador = 0;
		Scanner sc = new Scanner (System.in);
    	int[] array= new int[10];
		
		for(int i= 0; i<10; i++) {
		System.out.println("Qual é o número");
		int numero = sc.nextInt();
		array[i] = numero; 
	    }
		
		System.out.println("Qual é o numero escolhido");
		int numeroEscolhido = sc.nextInt();
		
	
		verificador(array,numeroEscolhido, contador);
		sc.close();
	
		
	}

}
