
public class Bubble_Sort {

	public static void main(String[] args) {

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
			System.out.println();
		}

		// BUBBLE SORT (Complexidade é O(N^2) --> PORQUE SERIA O(N) * O(N)
		int aux;

		for (int i = 0; i < vetor.length; i++) { // complexidade do primeiro for é O(N)
			// complexidade do segundo for é O(N-1)...ignora o 1 ent fica O(N)
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}

		System.out.println("Vetor Ordenado!");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);

		}

	}

}
