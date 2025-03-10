package repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {

		 //Login e senha
		// Desafio - implemente uma lógica que permita apenas 5 tentativas para usúario.
		
		
		 Scanner sc = new Scanner (System.in);
		
		 String loginSalvo = "admin";
		 String senhaSalva = "admin";
		 
		 String login = "";
		 String senha = "";
		 
		 // while (!(login == loginSalvo) && !(senha == senhaSalva)) {
		 while (! (login.equals(loginSalvo)) || !(senha.equals(senhaSalva))) {
		  System.out.println("Informe seu login: "); 
		  login = sc.nextLine();
		  
		  System.out.print("Informe sua senha: "); 
		  senha = sc.nextLine();
		 }
		 
		 System.out.println("Acesso liberado");
		 sc.close();
		  
		 
	}

}