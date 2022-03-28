import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int [] vetor = new int [10];
		
		//Preenchendo o vetor com numeros aleatórios
		for(int i = 0; i < vetor.length; i++) {
			vetor [i] = (int) (Math.random() * vetor.length); // preencher de 1 até 10
			System.out.println(vetor [i]);
		}
		
		System.out.println();
		
		int aux , j;
		// i nao precisa iniciar com 0 pq vetor tamanho 1 ja esta ordenado
		for(int i = 1; i < vetor.length; i++) {
			aux = vetor [i];
			j = i - 1;
			while(j >= 0 && vetor[j] > aux) {
				vetor[j + 1] = vetor[j];
				j--;
			}
			
			vetor[j + 1] = aux;
		
		}
		
		
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.println(vetor [i]);
		}
		
		
		

	}

}
