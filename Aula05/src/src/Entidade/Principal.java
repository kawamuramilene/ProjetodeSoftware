package Entidade;

public class Principal {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.placa = "EUB-6530";
		civic.ano = 2022;
		civic.cor = "Preta";
		civic.acelera();
		civic.exibirInfo();
		
        Carro kicks = new Carro();
		
        kicks.fabricante = "Nissan";
        kicks.modelo = "Kicks SV";
        kicks.placa = "KLF-6530";
        kicks.ano = 2023;
        kicks.cor = "Branca";
        kicks.acelera();
        kicks.exibirInfo();
        
        //instanciar = um novo obj carro
        
        Carro yaris = new Carro();
		
        yaris.fabricante = "Toyota";
        yaris.modelo = "Yaris Hatch";
        yaris.placa = "MKP-6530";
        yaris.ano = 2023;
        yaris.cor = "Cinza";
        yaris.acelera();
        yaris.exibirInfo(); 
        
        //caracteristas do carro
        
        
        
		

	}

}
