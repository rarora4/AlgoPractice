import sort.Insertion;
import sort.Selection;
import sort.Shell;

public class Experiment{
	public static void main(String[] args){

		int N = Integer.parseInt(args[0]);
		Double[] a = new Double[N];
		
		for(int i=0; i<N; i++)
			a[i] = StdRandom.uniform();

		//Selection.sort(a);
		//Insertion.sort(a);
		Shell.sort(a);

		for(int j=0; j<N; j++)
			System.out.println(a[j]);
		
	}
}
