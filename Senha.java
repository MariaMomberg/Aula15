package aula15CleanCode;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Cadastre uma senha (Apenas Números): ");
		int senha = ler.nextInt();
		System.out.print("Digite um número: ");
		double num1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		double num2 = ler.nextDouble();
		System.out.print("Digite a sua senha para desbloquear a soma: ");
		System.out.println(ler.nextInt() == senha ? "A soma é: " + (num1 + num2) : "Erro! Senha errada!");
		ler.close();
	}
}
