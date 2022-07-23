package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* O programa cria uma matriz baseado nas respostas do usuário. */
		/* O usuário escolhe um número e o programa retorna os vizinhos. */
		/* Exercício em Java para treinamento de For duplo e matrizes. */
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de linhas da matriz: ");
		int n = sc.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Quer saber os vizinhos de qual número da matriz?");
		int numeroEscolhido = sc.nextInt();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == numeroEscolhido) {
					
					System.out.println("Posição: "+i+" "+j);
					
					if(i-1>=0) {
						System.out.println("Cima: "+matriz[i-1][j]);
					}
					
					if(i+1<=matriz.length-1) {
						System.out.println("Baixo: "+matriz[i+1][j]);
					}
					
					if(j-1>=0) {
						System.out.println("Esquerda: "+matriz[i][j-1]);
					}
					
					if(j+1<=matriz[i].length-1) {
						System.out.println("Direita: "+matriz[i][j+1]);
					}
		
				}
			}
		}
		
		sc.close();
		
	}

}
