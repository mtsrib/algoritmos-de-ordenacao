package algoritmos_ordenação;

public class Quicksort {

	public Quicksort() {}
	
	long cont = 0;
	
	// Partition Original (Hoare) 
	public void quicksort(int A[], int p, int u, int exec, long quant_comp[]) { 
		int i = p;
		int j = u; 
		int x = A[(p+u)/2];
		while (i <= j) {
			while (A[i] < x) {
				cont++;
				i = i + 1;
			}
			while (A[j] > x) {
				cont++;
				j = j - 1;
			}
			if (i <= j) {
				troca(i, j, A);
				i = i + 1;
				j = j - 1;
			}
		}
		if (p < j)
			quicksort(A, p, j, exec, quant_comp);
		if (u > i)
			quicksort(A, i, u, exec, quant_comp);	
		quant_comp[exec] = cont;
	}
	
	public void troca(int a, int b, int A[]) {	// algoritmo que troca dois valores no vetor
		int aux;
		aux = A[a];
		A[a] = A[b];
		A[b] = aux;
	}
}
