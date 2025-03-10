package aula04;

import java.util.Scanner;

public class compras {

		public class Compras {
		    public static void main(String[] args) {
		        // Máquina de Cartão	 
		        // Capturar o valor de uma compra e método de pagamento
		        // 1 - Dinheiro/Pix 10% de desconto
		        // 2 - Débito 5% de desconto
		        // 3 - Crédito sem desconto
		    	
		    	// Métodos de parcelamento
		    	// A vista = Valor total 
		    	// 2x - 5% de juros
		    	// 3x - 10% de juros
		    	
		 
		Scanner sc = new Scanner(System.in);
		 
		        System.out.print("Informe o valor da sua compra: ");
		        double valorCompra = sc.nextDouble();
		 
		        System.out.println("Método de Pagamento:");
		        System.out.println("1 - Dinheiro/Pix");
		        System.out.println("2 - Débito");
		        System.out.println("3 - Crédito");
		        int metodoPagamento = sc.nextInt();
		 
		        switch (metodoPagamento) {
		        
		            case 1:
		                double valorFinal = valorCompra * 0.9;
		                System.out.println("O valor da sua compra ficou R$ " + valorFinal);
		                break;
		            case 2:
		                valorFinal = valorCompra * 0.95;
		                System.out.println("O valor da sua compra ficou R$ " + valorFinal);
		                break;
		            case 3:
		                System.out.println("O valor da sua compra ficou R$ " + valorCompra);
		                break;
		            default:
		                System.out.println("Opção inválida.");
		                break;
		        }
		 
		        sc.close();
		    }
		}
	}

