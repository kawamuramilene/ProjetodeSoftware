package desafiosJava;

import java.util.Scanner;

public class ConversaoTemperatura {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite a temperatura em Celsius: ");
	        double celsius = scanner.nextDouble();
	        
	        double fahrenheit = (celsius * 9/5) + 32;
	        double kelvin = celsius + 273.15;
	        
	        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
	        System.out.println("Temperatura em Kelvin: " + kelvin);
	        
	        scanner.close();
	    }
	}
