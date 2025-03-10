package repeticao;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		 //Login e senha
		// Desafio - implemente uma lógica que permita apenas 5 tentativas para usúario.
		
		
		 Scanner sc = new Scanner (System.in);
		
		 String loginSalvo = "admin";
		 String senhaSalva = "admin";
		 
		 String login = "";
		 String senha = "";
		 int tentativas = 0;
		 int maxTentativas = 5;
		 
		 while (tentativas < maxTentativas) {
			 System.out.print("Informr seu login: ");
			 login = sc.nextLine();
			 
			 System.out.print("Informe sua senha: "); 
			 senha = sc.nextLine();
			 
			 if (login.equalsIgnoreCase(loginSalvo) && senha.equals(senhaSalva)) {
			 System.out.println("Acesso liberado!");
			 break; //sai do loop se a autenticação for bem-sucedida
			 } else {
				 tentativas++;
				 System.out.println("Login ou senha incorretos. Tentativas restantes: " + (maxTentativas - tentativas));
			        }
			 
			 }
		 
		 if (tentativas == maxTentativas) {
			 System.out.println("Número máximo de tentativas atingido. Acesso bloqueado!");
		 }
		 
		  
		 
	}

}
