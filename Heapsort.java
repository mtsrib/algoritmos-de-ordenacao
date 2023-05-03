package algoritmos_ordenação;

public class Heapsort {

	public Heapsort() {}
	
	int tamHeap;
	long cont = 0;
	
	public void heapsort(int A[], int exec, long quant_comp[]) {
		constroiHeapMax(A);
		for(int i = A.length - 1 ; i >= 1; i--) {
			troca(0, i, A);
			tamHeap--;
			refazHeapMax(A, 0);
		}
		quant_comp[exec] = cont;	
	}

	public void constroiHeapMax(int A[]) {	
		tamHeap = A.length;
		for(int i = A.length - 1; i >= 0; i--)
			refazHeapMax(A, i);
	}

	public void refazHeapMax(int[] A, int i) {
		int e = 2 * (i) + 1;
		int d = 2 * (i) + 2;
		int maior = i;
		if (e < tamHeap && A[e] > A[maior]) {
			cont++;
			maior = e;
		}
		if (d < tamHeap && A[d] > A[maior]) {
			cont++;
			maior = d;
		}
		if (maior != i) {
			troca(i, maior, A);
			refazHeapMax(A, maior);
		}
	}
	
	public void troca(int a, int b, int A[]) {	// algoritmo que troca dois valores no vetor
		int aux;
		aux = A[a];
		A[a] = A[b];
		A[b] = aux;
	}
}
