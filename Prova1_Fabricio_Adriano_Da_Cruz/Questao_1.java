package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
	
	static int qtd = 10;
	
	public static void main(String[] args) {
	
		Scanner	scanner = new Scanner(System.in);
		
		int[] notas = new int[qtd];
		
		for(int i = 0; i <= notas.length; i++) {
			System.out.println("Digite uma nota:");
			notas[i] = scanner.nextInt();
		}
		
		int[] notas2 = new int[qtd*2];
		
		notas2 = montaNovoArray(notas);
		
		notasMaiorQ60(notas2);
		
		int resultado = notasMaiorQ60(notas2);
		
		System.out.println("O número de alunos com nota maior que 60 é: " + resultado);
		
		scanner.close();
	}
	public static int[] montaNovoArray(int[] array1) {
		
		int[] array2 = new int[qtd*2];
		
		for(int j = 0; j <= array1.length; j++) {
			if(j % 2 == 0) {
				array2[j] = array1[j];
			}
			else if(j % 2 != 0) {
				array2[j] = 0;
			}
		}
		
		for(int i = 0; i <= array2.length; i += 2) {
			if(array2[i] < 60) {
				array2[i + 1] = 0;
			}
			else {
				array2[i + 1] = 1;
			}
		}
		return array2;
		
		
	}
	public static int notasMaiorQ60(int[] array3) {
		int contador = 0;
		
		for(int i = 1; i <= array3.length; i += 2) {
			if(array3[i] == 1) {
				contador++;
			}
		}
		return contador;
		
	}
	
}
