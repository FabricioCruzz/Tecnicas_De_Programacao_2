package br.edu.univas.main;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite uma palavra:");
		String palavra = scanner.nextLine();
		
		char[] letras = palavra.toCharArray();
		
		int tamanhoPalavra = palavra.length();
		
		//verificaPalindrome(letras, tamanhoPalavra);
		
		System.out.println(palavra.substring(0));
		
		scanner.close();
	}
	public static boolean verificaPalindrome(char[] str, int n) {
		if(n <= 1) {
			return true;
		}
		else {
			return (str[0] == str [n - 1]) && verificaPalindrome(str + 1, n - 2);
		}
		
		
	}
public static void inverteString(String word) {
		
		String reverso = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			reverso += word.charAt(i);
		}
		System.out.println(reverso);
		
	}
	
}
