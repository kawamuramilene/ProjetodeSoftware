package poo;

public class Principal {

	public static void main(String[] args) {
		
		Conta janeiro = new Conta ();
		Conta fevereiro = new Conta();
 
		//Gastos JANEIRO
		janeiro.agua = 300;
		janeiro.alimentacao = 1800;
		janeiro.luz = 300;
		
		//Gastos FEVEREIRO
		fevereiro.agua = 100;
		fevereiro.alimentacao = 800;
		fevereiro.luz = 300;
		
		//somar todos os gastos
		double gastoJan = janeiro.somaConta();
		double gastoFev = fevereiro.somaConta();
		
		if (gastoJan > gastoFev) {
			System.out.println("O gasto de janeiro foi maior");
		}
		else if (gastoFev > gastoJan) {
			System.out.println("O gasto de fevereiro foi maior");
		}
		else {
			System.out.println("Ambos os meses tiveram o mesmo gasto");
			
			
		}
	}

}
