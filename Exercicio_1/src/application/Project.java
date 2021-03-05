package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Investimento;
import entities.InvestimentoComIR;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor inicial: ");
		double valorInicial = sc.nextDouble();
		
		System.out.println("jurosMensais");
		double jurosMensais = sc.nextDouble();
		
		Investimento investimento = new Investimento(valorInicial, jurosMensais);
		
		sc.close();
	}

}
