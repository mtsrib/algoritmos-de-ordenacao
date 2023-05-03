package algoritmos_ordenação;

public class Mergesort {

	public Mergesort() {}
	
	long cont = 0;
	
	public void mergesort(int A[], int p, int u, int exec, long quant_comp[]) {
		if (p < u) {
			int q; 
			q = (p + u)/2;
			mergesort(A, p, q, exec, quant_comp);
			mergesort(A, q+1, u, exec, quant_comp);
			merge(A, p, q, u, exec, quant_comp);
		}
		quant_comp[exec] = cont;
	}
	
	public void merge(int A[], int p, int q, int u, int exec, long quant_comp[]) {
		int n1 = q-p+1;
		int n2 = u-q;
		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];
		for(int i = 1; i <= n1; i++) 
			L[i-1] = A[p + i - 1];
		for(int j = 1; j <= n2; j++)
			R[j-1] = A[q + j];
		L[n1] = (int) Double.POSITIVE_INFINITY;
		R[n2] = (int) Double.POSITIVE_INFINITY;
		int i = 0, j = 0;
		for(int k = p; k <= u; k++) {
			if (L[i] < R[j]) {
				cont++;
				A[k] = L[i]; i = i + 1;
			}
			else {
				cont++;
				A[k] = R[j]; j = j + 1;
			}
		}	
	}

}
