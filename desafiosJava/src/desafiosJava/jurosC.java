package desafiosJava;

import java.util.Scanner;

public class jurosC {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o capital inicial: ");
	        double capital = scanner.nextDouble();
	        
	        System.out.print("Digite a taxa de juros (em %): ");
	        double taxa = scanner.nextDouble() / 100;
	        
	        System.out.print("Digite o número de meses: ");
	        int meses = scanner.nextInt();
	        
	        double montante = capital * Math.pow((1 + taxa), meses);
	        
	        System.out.printf("Montante final: %.2f\\n", montante);
	        
	        scanner.close();
	    }
	}

