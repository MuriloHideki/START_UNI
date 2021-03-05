package application;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int multiplicando, multiplicadores, fim;
		
		System.out.printf("Multiplicando: ");
		multiplicando = sc.nextInt();
		System.out.printf("Início do intervalo: ");
		multiplicadores = sc.nextInt();
		System.out.printf("Fim do intervalo: ");
		fim = sc.nextInt();
		
		if(multiplicando < 0 || multiplicando > 5000) {
			System.out.println("O multiplicando não pode ser menor que 0 e nem maior que 5000.");
		}else if (multiplicadores < 0 || multiplicadores > 5000 || fim < 0 || fim > 5000) {
			System.out.println("Tanto o início como o fim do intervalo, não podem ser números negativos e não podem ser maiores de 5000.");
		}else if ((fim - multiplicadores) >= 10) {
			System.out.println("O intervalo deve ser menor que 10.");
		}else if ((fim - multiplicadores) <= 0) {
			System.out.println("O início do intervalo deve ser menor que seu fim.");
		}else {
			for(int i = multiplicadores; i<=fim; i++) {
				System.out.printf("%d x %d = %d\n", multiplicando, i, i*multiplicando);
			}
		}
		sc.close();
	}

}
