package algoritmos_ordenação;

public class Insertionsort {

	public Insertionsort() {}
	
	public void insertionsort(int A[], int exec, long quant_comp[]) {	
		// TODO Auto-generated constructor stub
		int  x, j;
		long cont = 0;
		
		for (int i = 1; i < A.length; i++) {	
			x = A[i];
			j = i - 1;
			while(j >= 0 && x < A[j]) {
				cont++;
				A[j+1] = A[j];
				j--;
			} 
			A[j+1] = x;
		}
		quant_comp[exec] = cont;
	}
} 
