import sort.Insertion;
import sort.Selection;
import sort.Shell;
import java.io.File;

public class FileSorter{

	public static void main(String args[]){

		File directory = new File(args[0]);
		File[] files = directory.listFiles();
		
		//Selection.sort(files);
		//Insertion.sort(files);
		Shell.sort(files);

		for(int i=0; i<files.length; i++)
			System.out.println(files[i].getName());
	}
}
