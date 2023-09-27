package exemplos;
//Descrição do problema: Imagine que você é um assistente de laboratório em uma escola e foi solicitado a ajudar na organização de uma coleção de 
//números em ordem crescente usando o método Bubble Sort. Os números representam as notas dos alunos em um teste recente. 
//Sua tarefa é escrever um programa em uma linguagem de programação de sua escolha para classificar essas notas e, em seguida, 
//identificar a nota mais alta e a nota mais baixa.

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 2, 90 };

		System.out.println("Bubble Sort");
		System.out.println("\nArray desordenado:");
		imprimirArray(arr);

		bubbleSortCrescente(arr);
		System.out.println("\nArray ordenado do menor para o maior:");
		imprimirArray(arr);

		bubbleSortDecrescente(arr);
		System.out.println("\nArray ordenado do maior para o menor:");
		imprimirArray(arr);

		System.out.println("\nNota mais alta: " + arr[0]);

		int lastIdx = arr.length - 1;
		int lastElement = arr[lastIdx];
		System.out.println("\nNota mais baixa: " + lastElement);
	}

	public static void bubbleSortCrescente(int[] arr) {
		int n = arr.length;
		boolean trocou;

		do {
			trocou = false;
			for (int i = 1; i < n; i++) {
				if (arr[i - 1] > arr[i]) {
					// Troca os elementos se estiverem fora de ordem
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					trocou = true;
				}
			}
		} while (trocou);
	}

	public static void bubbleSortDecrescente(int[] arr) {
		int n = arr.length;
		boolean trocou;

		do {
			trocou = false;
			for (int i = 1; i < n; i++) {
				if (arr[i - 1] < arr[i]) {
					// Troca os elementos se estiverem fora de ordem
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					trocou = true;
				}
			}
		} while (trocou);
	}

	public static void imprimirArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
