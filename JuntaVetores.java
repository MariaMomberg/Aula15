package aula15CleanCode;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] Vet1 = new int[2], Vet2 = new int [2], Vet3 = new int[4];
		for (int i = 0; i < 2; i++) {
		System.out.println("Digite o " + (i + 1) + "º valor para 1:");
		Vet1[i] = ler.nextInt(); }
		for (int i = 0; i < 2; i++) {
		System.out.println("Digite o " + (i + 1) + "º valor para 2:");
		Vet2[i] = ler.nextInt();}
		for (int i = 0; i < 2; i++) {
		Vet3[i] = Vet1[i];
		Vet3[i + 2] = Vet2[i]; }
		System.out.println("Valores do vetor 3:");
		for (int i = 0; i < 4; i++) {
		System.out.println(Vet3[i]); }
		ler.close();
		}	
	}
