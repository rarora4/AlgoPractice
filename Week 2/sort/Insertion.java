package sort;

public class Insertion{

	public static void sort(Comparable[] items){
		
		int N = items.length;
		for(int i=0; i<N; i++){
			for(int j=i; j>0; j--){
				if(less(items[j], items[j-1]))
					exch(items, j, j-1);
				else
					break;
			}
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
