public class Main {
	
	public static int []  selectionSort  (int [] array ) {
		int posicaoMenor;
		int aux;
		for(int i=array.length -1;i>=0;i-- ) {
			posicaoMenor=i;
			for(int j = array.length - 2; j >= 0; j--) {
				if(array[j]<array[posicaoMenor]) {
					posicaoMenor=j;
				}
			}
			
			aux=array[i];
			array[i]=array[posicaoMenor];
			array[posicaoMenor]=aux;
			
			if( i==4) {
				for(int r = 0; r<array.length;r++) {
					System.out.println(array[r]);
				}
			}
			
			
		}
		
		
		
		return array;
	}

	public static void main(String[] args) {
	
		
		int vetor [] = {15, 11, 16, 18, 23, 5, 10, 22, 21, 12};
		
		
		System.out.println("Desordenado: ");
		for(int i = 0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
			System.out.println();
		}
		
		
		selectionSort(vetor);
		
	
		System.out.println("Ordenado: ");
		for(int i = 0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
			
		}
		
		
		
		

	}

}


