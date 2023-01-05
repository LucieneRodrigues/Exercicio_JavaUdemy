package exercicioArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioArrayMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in); //entrada dados teclado
		System.out.println("Digite a quantidade de notas: ");
		
		int qtdNotas = entrada.nextInt(); // qtd notas q terá no array
		
		double [] notas = new double [qtdNotas]; //cria array com a qtd informada
		for(int i = 0; i < notas.length; i ++) {
			System.out.println("Informe a nota "+ (i +1)+ ":");
			notas[i] = entrada.nextInt();
			
		}
		double total = 0;
		for(double i: notas) {
			total += i;
		}
		double media = total / notas.length;
		System.out.println("A media eh: "+media+"!");
		System.out.println(Arrays.toString(notas));
		
		entrada.close();

	}

}
