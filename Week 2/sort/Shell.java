package sort;

public class Shell{

	public static void sort(Comparable[] items){

		int N = items.length;
		int h = 1;
		while(h < N/3)
			h = (3*h + 1);

		while(h>=1){

			for(int i=h; i<N; i++){
				for(int j=i; j>=h; j-=h){
					if(less(items[j], items[j-h]))
						exch(items, j, j-h);
					else
						break;
				}
			}
			h = h/3;
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
