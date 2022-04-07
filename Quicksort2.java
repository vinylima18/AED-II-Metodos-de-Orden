import java.util.Random;

public class Quicksort2 {

public static void main(String[] args) {
		
		Random rand = new Random();
		
		int [] numeros = new int [10];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100);
			
		}
		
		
		System.out.println("Antes: ");
		printArray(numeros);
		System.out.println();
		
		
		quicksort(numeros, 0, numeros.length - 1);
		
		System.out.println("\nDepois:");
		printArray(numeros);
		
	}
	
	//metodo do quick
			private static void quicksort(int[] array, int posMenor, int posMaior) {
				
				if(posMenor >= posMaior) {
				//sabemos que temos apenas 1 elemento ent ja esta ordenado
				return;	
				}
				
				// escolher numero qualquer para ser o Pivot para o tempo/performance ser um pouco melhor
				int pivotIndice = new Random().nextInt(posMaior - posMenor) + posMenor;
				
				
				//Escolher o tal do "Pivot"
				int pivot = array[pivotIndice];
				swap(array, pivotIndice, posMaior);
				
				int leftPointer = partition(array, posMenor, posMaior, pivot); 
				
				
				//agora o pivot está na pos correta
				//agora vamos fazer a mesma coisa com o subArray a esquerda de onde o pivot foi e a direta tambem
				
				
				//recursive call o quick sort metodo
				
				//posMenor porque é o primeiro indice desde o inicio
				quicksort(array, posMenor, leftPointer - 1 );
				
				//posMaior porque é o ultimo indice ainda
				quicksort(array, leftPointer + 1, posMaior);
				
				
				
				//alguma hora vai chegar em um array de apenas 1 elemento
				//se tem um elemento ja esta ordenado, logo vamos apenas retornar
				//essa logica esta no topo começando na linha 31 e terminando na linha 34
			
		
			}

	private static int partition(int[] array, int posMenor, int posMaior, int pivot) {
		int leftPointer = posMenor;
		int rightPointer = posMaior;
		
		while(leftPointer  <  rightPointer) {
			
			while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			
			//trocar os dois
			swap(array, leftPointer, rightPointer);
			
			
		}
		
		
		//quando o right pointer e o left pointer encontrar no msm indice, o pivot vai onde o leftpointer apota
		
		//pos maior é onde está o pivot
		swap(array, leftPointer, posMaior );
		return leftPointer;
	}
			
			
			//swap method
			private static void swap (int [] array, int index1, int index2) {
				int temp = array[index1];
				array[index1] = array[index2];
				array[index2] = temp;
			}
			
			private static void printArray(int array[]) {
				for(int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}
			}

}
