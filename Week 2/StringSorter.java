import sort.Insertion;
import sort.Selection;
import sort.Shell;

public class StringSorter{
	public static void main(String args[]){
	
		String[] a = In.readStrings(args[0]);
		//Selection.sort(a);
		//Insertion.sort(a);
		Shell.sort(a);
	
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}
