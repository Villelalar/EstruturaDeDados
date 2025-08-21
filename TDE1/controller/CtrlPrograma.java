package controller;
import java.text.DecimalFormat;
import java.util.Scanner;

import dominio.VendaProduto;
public class CtrlPrograma {

	 static int[] numero = new int[5];
	    static int[] quantidade = new int[5];
	    static double[] valorUnitario = new double[5];
	    DecimalFormat df = new DecimalFormat("#.00"); 
	    static VendaProduto[] venda = new VendaProduto[5];
	    
	    public static void main(String[] args) {
	        Listas(); 
	        listasDitar(); 
	    }
        public static void Listas() { 
        	Scanner sc = new Scanner(System.in); 
 
        	for (int i = 0; i<5; i++) {
        		
        		System.out.println("\n Venda " + (i + 1));
                
                System.out.print("\nDigite o número da venda:    ");
                numero[i] = sc.nextInt();

                System.out.print("\nDigite a quantidade de produtos:  ");
                quantidade[i] = sc.nextInt();

                System.out.print("\nDigite o valor unitário do produto: ");
                valorUnitario[i] = sc.nextDouble();
                venda[i] = new VendaProduto(numero[i], quantidade[i],valorUnitario[i]);
        	}
        	sc.close();
	}
        
        public static void listasDitar() {
        	for(int i=0; i<5;i++) {
        		System.out.println("\n--- Venda " + (i + 1));
        		 System.out.print("\nDigite o número da venda" + numero[i]);
        		 System.out.print("\nDigite a quantidade de produtos" + quantidade[i]);
        		 System.out.print("\nDigite o valor unitário do produto" + valorUnitario[i]);
        		
        	}
        }

}
