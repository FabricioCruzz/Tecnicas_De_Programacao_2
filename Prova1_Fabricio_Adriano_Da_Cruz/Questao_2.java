package br.edu.univas.main;

import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = scanner.nextLine();
		
		inverteString(palavra);
			
		scanner.close();
	}
	public static void inverteString(String word) {
		
		String reverso = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reverso += word.charAt(i);
		}
		System.out.println(reverso);
		
	}

}
