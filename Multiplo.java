package aula15CleanCode;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		System.out.println("Informe um valor : ");
		valor = ler.nextInt();

		ler.close();
		String mensagem = valor % 5 == 0 ? "é múltiplo de 5" : "não é múltiplo de 5";
		System.out.println(mensagem);
		}
		}