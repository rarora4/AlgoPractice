package sort;

public class Selection{

	public static void sort(Comparable[] items){
		
		int min;
		int N = items.length;
		for(int i=0; i<N; i++){
			min = i;
			for(int j=i+1; j<N; j++){
				if(less(items[j], items[min]))
					min = j;	
			}
			exch(items, i, min);
		}
	}

	public static boolean less(Comparable item1, Comparable item2){
		
		return (item1.compareTo(item2) < 0 );
	}

	public static void exch(Comparable items[], int i, int min){
		
		Comparable itemTemp = items[i];
		items[i] = items[min];
		items[min] = itemTemp;
	}
}
