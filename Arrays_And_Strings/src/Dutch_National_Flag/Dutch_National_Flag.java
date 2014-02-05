package Dutch_National_Flag;

public class Dutch_National_Flag {
	public static void sort(int[] A,int i){
		if(i>=A.length || i<0)
			return;
		int pivot = A[i];
		//swapping pivot and the last element
		int tmp = A[A.length-1];
		A[A.length-1] = A[i];
		A[i] = tmp;
		
		int smaller = -1;
		int equal = -1;
		for(int j=0;j<A.length;j++){
			if(A[j]<pivot){
				tmp = A[j];
				A[j] = A[++equal];
				A[equal] = A[++smaller];
				A[smaller] = tmp;
			}
			else if(A[j]==pivot){
				tmp = A[j];
				A[j] = A[++equal];
				A[equal] = tmp;
			}
		}
	}
	
	public static void main(String ... args){
		int[] A = new int[]{1,3,1,2};
		Dutch_National_Flag.sort(A, 3);
		for(int i:A)
			System.out.print(i+",");
	}
}
