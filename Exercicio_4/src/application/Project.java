package application;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = 0, aux;
		
		do {
			System.out.printf("Digite um n�mero:");
			aux = sc.nextInt();
			if (aux <0) {
				System.out.println("N�meros negaticos n�o s�o permitidos");
			}else {
				num += aux;
			}
		}while(num <= 157);
		System.out.printf("O somat�rio foi %d", num);
		sc.close();
	}

}
