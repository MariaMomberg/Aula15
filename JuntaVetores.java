package aula15CleanCode;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] num1 = new int[2], num2 = new int [2], num3 = new int[4];
		for (int i = 0; i < 2; i++) {
		System.out.println("Digite o " + (i + 1) + "º valor para 1:");
		num1[i] = ler.nextInt(); }
		for (int i = 0; i < 2; i++) {
		System.out.println("Digite o " + (i + 1) + "º valor para 2:");
		num2[i] = ler.nextInt();}
		for (int i = 0; i < 2; i++) {
		num3[i] = num1[i];
                num3[i + 2] = num2[i]; }
		System.out.println("Valores do vetor 3:");
		for (int i = 0; i < 4; i++) {
		System.out.println(num3[i]); }
		ler.close();
		}	
	}
