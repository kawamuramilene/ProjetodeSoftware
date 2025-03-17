package poo;

public class Conta {
	
    //atributos
	double alimentacao;
	double luz;
	double agua;
	
	//metodos
	
	public double somaConta() {
		double gastoMes = alimentacao + luz + agua;
		return gastoMes; 
	}
}

