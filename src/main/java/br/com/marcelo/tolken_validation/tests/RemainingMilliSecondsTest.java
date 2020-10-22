package br.com.marcelo.tolken_validation.tests;

import java.util.Random;

import br.com.marcelo.tolken_validation.domain.model.Token;

public class RemainingMilliSecondsTest {

	public static void main(String[] args) {
		 
		Token tolken = new Token();
		
		int[] vet = new int[100000];
		geraVetorRandom(vet);
		long inicio = System.currentTimeMillis();
		bubleSort(vet);
		long fim = System.currentTimeMillis();
		
		System.out.println("BubleSort: " + (fim - inicio)/1000.0);
		System.out.println("Tempo restante: " + tolken.getRemainingMilliSeconds()/1000.0);
		
	}
	
	static void bubleSort(int[] vet) {

		int i, j, aux;

		for (i = 1; i < vet.length; i++) {
			for (j = 0; j < vet.length - i; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}
	}
	static void geraVetorRandom(int[] vet) {

		int i;
		int tamanho = vet.length;
		Random random = new Random();
		for (i = 0; i < tamanho; i++) {
			vet[i] = random.nextInt(10 * tamanho);
		}
	}
	
}
