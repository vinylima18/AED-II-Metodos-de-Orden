

 class selectionSort {

	private static void imprimirVetor (int [] vetor) {
		for (int i : vetor) {
			System.out.print(i + " ");
			
			
		}
		
		System.out.println();
	}
	
	private static void troca (int vetor [] , int esquerda , int direita) {
		int temp = vetor[esquerda];
		vetor[esquerda]=vetor[direita];
		vetor[direita]=temp;
	}
	
	private static void ordenacaoPorSelecao (int [] vetor) {
		int min;
		
		
		for(int i=0;i<vetor.length-1;i++) {
			min=i;
			
			for(int j= i+1; j<vetor.length;j++) {
				if(vetor[j] < vetor[min]) {
					min=j;
				}
			}
			
			if(min != i) {
				troca (vetor,i,min);
			}
		}
	}
	
	






	public static void main(String[] args) {
		
		int [] vetor = {5,4,3,2,1};
		
		imprimirVetor(vetor);
		
		ordenacaoPorSelecao(vetor);
		
		imprimirVetor(vetor);
		

	}

}






