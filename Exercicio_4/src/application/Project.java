package application;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0, aux;
		
		do {
			System.out.printf("Digite um número:");
			aux = sc.nextInt();
			if (aux <0) {
				System.out.println("Números negaticos não são permitidos");
			}else {
				num += aux;
			}
		}while(num <= 157);
		System.out.printf("O somatório foi %d", num);
		sc.close();
	}

}
