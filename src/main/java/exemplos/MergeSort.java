package exemplos;
//Descrição do problema: Você foi designado para criar um programa em Java que classifica uma lista de números inteiros usando o algoritmo

//Merge Sort. Sua tarefa é implementar o algoritmo de Merge Sort e aplicá-lo à lista de números fornecida.

public class MergeSort {
	public static void main(String[] args) {
		int[] numeros = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.println("Merge Sort");
		System.out.println("\nArray desordenado:");
		imprimirArray(numeros);

		mergeSort(numeros);
		System.out.println("\nArray ordenado do menor para o maior:");
		imprimirArray(numeros);

		// Ordenação decrescente
		decrescenteArray(numeros);
		System.out.println("\nArray ordenado do maior para o menor:");
		imprimirArray(numeros);
	}

	public static void mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int meio = arr.length / 2;
		int[] esquerda = new int[meio];
		int[] direita = new int[arr.length - meio];

		for (int i = 0; i < meio; i++) {
			esquerda[i] = arr[i];
		}

		for (int i = meio; i < arr.length; i++) {
			direita[i - meio] = arr[i];
		}

		mergeSort(esquerda);
		mergeSort(direita);

		merge(arr, esquerda, direita);
	}

	public static void merge(int[] arr, int[] esquerda, int[] direita) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < esquerda.length && j < direita.length) {
			if (esquerda[i] < direita[j]) {
				arr[k] = esquerda[i];
				i++;
			} else {
				arr[k] = direita[j];
				j++;
			}
			k++;
		}

		while (i < esquerda.length) {
			arr[k] = esquerda[i];
			i++;
			k++;
		}

		while (j < direita.length) {
			arr[k] = direita[j];
			j++;
			k++;
		}
	}

	public static void decrescenteArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			// Troca os elementos no índice left e right
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			// Move os índices para dentro
			left++;
			right--;
		}
	}

	public static void imprimirArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}