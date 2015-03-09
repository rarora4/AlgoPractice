package sort;

import java.util.Random;

public class Shuffler{

	public static void shuffle(Object[] items){

		Random random = new Random();
		
		int N = items.length;
		int r;
		for(int i =0 ; i<N; i++){
			r = random.nextInt(i+1);
		exch(items,i,r);	
		}
	}

public static void exch(Object items[], int i, int min){
		
		Object itemTemp = items[i];
		items[i] = items[min];
		items[min] = itemTemp;
	}
}
