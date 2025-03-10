package desafiosJava;

import java.util.Scanner;

public class JurosS {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o capital inicial: ");
	        double capital = scanner.nextDouble();
	        
	        System.out.print("Digite a taxa de juros mensal (em decimal): ");
	        double taxa = scanner.nextDouble();
	        
	        System.out.print("Digite o tempo em meses: ");
	        int meses = scanner.nextInt();
	        
	        double juros = capital * taxa * meses;
	        double montante = capital + juros;
	        
	        System.out.println("Juros acumulados: " + juros);
	        System.out.println("Montante final: " + montante);
	        
	        scanner.close();
	    }
	}
