package aula04;

import java.util.Scanner;

public class notas {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.printf("A sua média foi de: "+ media);
        
        if  (media >= 7) {
        	System.out.print("Aprovado ");
        }
        else if (media >= 5) {
        	System.out.print("Recuperação");
        }
        System.out.print("Digite a nota da recuperação: ");
        double notaRec = scanner.nextDouble();
        
        double mediaFinal = (media + notaRec) /2;
        //media = (media + notaRec) /2
        
        System.out.printf("A sua média foi de: "+ mediaFinal);
   
        else {
        	System.out.print("Reprovado");
        }
        
        scanner.close(); 
        }
}

