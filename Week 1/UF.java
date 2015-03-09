import union.QuickUF;
import union.QuickUnion;
import union.QuickUnionImproved;

public class UF{

	public static void main(String args[]){
        int N = StdIn.readInt();
        QuickUnionImproved uf = new QuickUnionImproved(N);
	//QuickUnion uf = new QuickUnionImproved(N);
	//QuickUF uf = new QuickUF(N);
        int p;
        int q;
        while(!StdIn.isEmpty()){
            p = StdIn.readInt();
            q = StdIn.readInt();
	    if(p >= N || q >= N)
		break;
            if(!(uf.connected(p,q))){
                uf.union(p,q);
                System.out.println("\n"+p+ " " + q);
		for(int i=0; i<N; i++)
			System.out.print(uf.root(i)+ " ");
            }
        }
	System.out.println("\n 8 and 9: "+uf.connected(8,9));
    }
}
