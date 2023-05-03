package algoritmos_ordenação;

public class Bubblesort {

	public Bubblesort() {}
	
	public void bubblesort(int A[], int exec,  long quant_comp[]) {	// algoritmo do bubblesort (encontrado no problema 2.2 do Cap. 2 do livro do Cormen)
		// TODO Auto-generated constructor stub
		long cont = 0;
		for (int i = 0; i < A.length; i++) {	
			for (int j = A.length-1; j >= i+1; j--) {
				if (A[j] < A[j-1]) {
					cont++;
					troca(j, j-1, A);
				}		
			}
		}
		quant_comp[exec] = cont;    // vetor quant_comp recebe as quantidades de comparações feitas em cada execução
	}
	
	public void troca(int a, int b, int A[]) {	// algoritmo que troca dois valores no vetor
		int aux;
		aux = A[a];
		A[a] = A[b];
		A[b] = aux;
	}
}
	
	

